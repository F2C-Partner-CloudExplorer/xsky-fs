package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FsSmbShareAclMapper;
import com.fit2cloud.oss.dto.FsSmbShareAclDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.service.ext.ExtFsSmbShareService;
import com.fit2cloud.oss.utils.FsShareClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.DfsSMBShareACL;
import xio.sds.client.model.FSUserGroupNestview;
import xio.sds.client.model.FSUserNestview;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsSmbShareAclService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsSmbShareAclMapper fsSmbShareAclMapper;
    @Resource
    ExtAccountService extAccountService;
    @Resource
    ExtFsSmbShareService extFsSmbShareService;
    @Resource
    FsUserService fsUserService;
    @Resource
    FsUserGroupService fsUserGroupService;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsSmbShareAcl> pagingAcl(FsSmbShareAclDTO condition){
        FsSmbShareAclExample example = new FsSmbShareAclExample();
        FsSmbShareAclExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsSmbShareAclDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (null != condition.getShareId()) {
            criteria.andShareIdEqualTo(condition.getShareId());
        }

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return fsSmbShareAclMapper.selectByExample(example);
    }

    public List<Long> listShareIdsByAcl(String accountId) {
        List<Long> shareIds = new ArrayList<>();

        FsSmbShareAclExample example = new FsSmbShareAclExample();
        FsSmbShareAclExample.Criteria criteria = example.createCriteria();

        List<Long> userIds = fsUserService.listUserByAccount(accountId)
                .stream().map(FsXskyUser::getUserId).collect(Collectors.toList());
        List<Long> userGroupIds = fsUserGroupService.listUserGroupByAccount(accountId)
                .stream().map(FsXskyUserGroup::getUserGroupId).collect(Collectors.toList());
        List<Long> subUserGroupIds = fsUserService.listUserByAccount(accountId)
                .stream().map(FsXskyUser::getFsUserGroupIds).flatMap(ids ->
                        JSONArray.parseArray(Optional.ofNullable(ids).orElse(JSONObject.toJSONString(new ArrayList<>())))
                                .toJavaList(Long.class).stream()).distinct().collect(Collectors.toList());

        if (CollectionUtils.isNotEmpty(subUserGroupIds)) {
            userGroupIds.addAll(subUserGroupIds);
        }

        if (CollectionUtils.isNotEmpty(userIds)) {
            criteria.andAccountIdEqualTo(accountId);
            criteria.andUserIdIn(userIds);
            shareIds.addAll(fsSmbShareAclMapper.selectByExample(example).stream()
                    .map(FsSmbShareAcl::getShareId).collect(Collectors.toList()));
        }

        if (CollectionUtils.isNotEmpty(userGroupIds)) {
            example.clear();
            criteria = example.createCriteria();
            criteria.andUserGroupIdIn(userGroupIds);
            criteria.andAccountIdEqualTo(accountId);
            shareIds.addAll(fsSmbShareAclMapper.selectByExample(example).stream()
                    .map(FsSmbShareAcl::getShareId).collect(Collectors.toList()));
        }
        return shareIds;
    }

    public List<FsSmbShareAcl> listAclByShare(String accountId, Long shareId){
        FsSmbShareAclExample example = new FsSmbShareAclExample();
        FsSmbShareAclExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        criteria.andAccountIdEqualTo(accountId).andShareIdEqualTo(shareId);
        return fsSmbShareAclMapper.selectByExample(example);
    }

    public void syncFsSmbShareAcl(FsXskyAccount account, FsShareClient client, Long shareId) {
        Map<Long, FsSmbShareAcl> localAcls = getLocalShareAcls(account, shareId);
        Map<Long, DfsSMBShareACL> xskyAcls = getXskyAcls(client, shareId);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localAclId : localAcls.keySet()){
            if(!xskyAcls.containsKey(localAclId)){
                fsSmbShareAclMapper.deleteByPrimaryKey(localAcls.get(localAclId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyAclId : xskyAcls.keySet()){
            FsSmbShareAcl xskyAcl = convert(account.getId(), xskyAcls.get(xskyAclId));

            if(!localAcls.containsKey(xskyAclId)){
                fsSmbShareAclMapper.insert(xskyAcl);
            }else{
                FsSmbShareAclExample example = new FsSmbShareAclExample();
                example.createCriteria().andAclIdEqualTo(xskyAcl.getAclId())
                        .andAccountIdEqualTo(account.getId());
                fsSmbShareAclMapper.updateByExampleSelective(xskyAcl, example);
            }
        }
    }


    private FsSmbShareAcl convert(String accountId, DfsSMBShareACL acl) {
        FsSmbShareAcl shareAcl = new FsSmbShareAcl();
        shareAcl.setAccountId(accountId);
        shareAcl.setAclName(acl.getFsUserName());
        shareAcl.setShareId(acl.getDfsSmbShare().getId());
        shareAcl.setAclId(acl.getId());
        shareAcl.setPermission(acl.getPermission());
        shareAcl.setType(acl.getType());

        shareAcl.setUpdateTime(XskyCommonUtil.convertTime2Mills(acl.getUpdate()));
        shareAcl.setCreateTime(XskyCommonUtil.convertTime2Mills(acl.getCreate()));
        Optional.ofNullable(acl.getFsUser()).map(FSUserNestview::getId).ifPresent(shareAcl::setUserId);
        Optional.ofNullable(acl.getFsUser()).map(FSUserNestview::getName).ifPresent(shareAcl::setAclName);

        Optional.ofNullable(acl.getFsUserGroup()).map(FSUserGroupNestview::getId).ifPresent(shareAcl::setUserGroupId);
        Optional.ofNullable(acl.getFsUserGroup()).map(FSUserGroupNestview::getName).ifPresent(shareAcl::setAclName);
        return shareAcl;
    }

    private Map<Long, FsSmbShareAcl> getLocalShareAcls(FsXskyAccount account, Long shareId) {
        FsSmbShareAclExample example = new FsSmbShareAclExample();
        FsSmbShareAclExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        Optional.ofNullable(shareId).ifPresent(criteria::andShareIdEqualTo);
        List<FsSmbShareAcl> acls = fsSmbShareAclMapper.selectByExample(example);

        Map<Long, FsSmbShareAcl> localAcls = new HashMap<>();
        acls.forEach(client -> localAcls.put(client.getAclId(), client));
        return localAcls;
    }

    public void deleteAcl(Integer aclId) {
        if (null == aclId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsSmbShareAcl record = fsSmbShareAclMapper.selectByPrimaryKey(aclId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));

        client.deleteFsSMBShareACL(record.getShareId(), Arrays.asList(record.getAclId()));
        fsSmbShareAclMapper.deleteByPrimaryKey(record.getId());
        extFsSmbShareService.removeAclNumByShareId(record.getAccountId(), record.getShareId());
    }

    public void deleteLocalData(String xskyAccountId) {
        FsSmbShareAclExample example = new FsSmbShareAclExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        fsSmbShareAclMapper.deleteByExample(example);
    }

    private Map<Long, DfsSMBShareACL> getXskyAcls(FsShareClient client, Long shareId){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsSMBShareACL> acls = client.getFsSMBShareACL(page, shareId);

        Map<Long, DfsSMBShareACL> xskyAcls =new HashMap <>();
        acls.forEach( c -> {
                    xskyAcls.put(c.getId(), c);
                }
        );
        return xskyAcls;
    }

    /**
     * 根据共享的shareIds和userIds查询Acl
     */
    public List<FsSmbShareAcl> getSmbShareAclsByShareIdsAndUserIds(List<Long> shareIds,List<Long> userIds){
        List<FsSmbShareAcl> fsSmbShareAcls = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(shareIds) && CollectionUtils.isNotEmpty(userIds)){
            FsSmbShareAclExample example = new FsSmbShareAclExample();
            example.createCriteria().andShareIdIn(shareIds).andUserIdIn(userIds);
            fsSmbShareAcls = fsSmbShareAclMapper.selectByExample(example);
        }
        return fsSmbShareAcls;
    }
}
