package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FsFtpShareAclMapper;
import com.fit2cloud.oss.dto.FsFtpShareAclDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.service.ext.ExtFsFtpShareService;
import com.fit2cloud.oss.utils.FsShareClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.*;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsFtpShareAclService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsFtpShareAclMapper fsFtpShareAclMapper;
    @Resource
    private ExtFsFtpShareService extFsFtpShareService;
    @Resource
    ExtAccountService extAccountService;
    @Resource
    FsUserService fsUserService;
    @Resource
    FsUserGroupService fsUserGroupService;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsFtpShareAcl> pagingAcl(FsFtpShareAclDTO condition){
        FsFtpShareAclExample example = new FsFtpShareAclExample();
        FsFtpShareAclExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsFtpShareAclDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (null != condition.getShareId()) {
            criteria.andShareIdEqualTo(condition.getShareId());
        }

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return fsFtpShareAclMapper.selectByExample(example);
    }

    public void syncFsFtpShareAcl(FsXskyAccount account, FsShareClient client, Long shareId) {
        Map<Long, FsFtpShareAcl> localAcls = getLocalShareAcls(account, shareId);
        Map<Long, DfsFTPShareACL> xskyAcls = getXskyAcls(client, shareId);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localAclId : localAcls.keySet()){
            if(!xskyAcls.containsKey(localAclId)){
                fsFtpShareAclMapper.deleteByPrimaryKey(localAcls.get(localAclId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyAclId : xskyAcls.keySet()){
            FsFtpShareAcl xskyAcl = convert(account.getId(), xskyAcls.get(xskyAclId));

            if(!localAcls.containsKey(xskyAclId)){
                fsFtpShareAclMapper.insert(xskyAcl);
            }else{
                FsFtpShareAclExample example = new FsFtpShareAclExample();
                example.createCriteria().andAclIdEqualTo(xskyAcl.getAclId())
                        .andAccountIdEqualTo(account.getId());
                fsFtpShareAclMapper.updateByExampleSelective(xskyAcl, example);
            }
        }
    }

    public List<Long> listShareIdsByAcl(String accountId) {
        List<Long> shareIds = new ArrayList<>();

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

        FsFtpShareAclExample example = new FsFtpShareAclExample();
        FsFtpShareAclExample.Criteria criteria = example.createCriteria();

        if (CollectionUtils.isNotEmpty(userIds)) {
            criteria.andAccountIdEqualTo(accountId);
            criteria.andUserIdIn(userIds);
            shareIds.addAll(fsFtpShareAclMapper.selectByExample(example).stream()
                    .map(FsFtpShareAcl::getShareId).collect(Collectors.toList()));
        }

        if (CollectionUtils.isNotEmpty(userGroupIds)) {
            example.clear();
            criteria = example.createCriteria();
            criteria.andUserGroupIdIn(userGroupIds);
            criteria.andAccountIdEqualTo(accountId);
            shareIds.addAll(fsFtpShareAclMapper.selectByExample(example).stream()
                    .map(FsFtpShareAcl::getShareId).collect(Collectors.toList()));
        }
        return shareIds;
    }

    public List<FsFtpShareAcl> listAclByShare(String accountId, Long shareId){
        FsFtpShareAclExample example = new FsFtpShareAclExample();
        FsFtpShareAclExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        criteria.andAccountIdEqualTo(accountId).andShareIdEqualTo(shareId);
        return fsFtpShareAclMapper.selectByExample(example);
    }

    private FsFtpShareAcl convert(String accountId, DfsFTPShareACL acl) {
        FsFtpShareAcl shareAcl = new FsFtpShareAcl();
        shareAcl.setAccountId(accountId);
        shareAcl.setShareId(acl.getDfsFtpShare().getId());
        shareAcl.setAclId(acl.getId());
        shareAcl.setType(acl.getType());
        Optional.ofNullable(acl.getDfsFtpShare()).map(DfsFTPShareNestview::getName).ifPresent(shareAcl::setAclName);

        shareAcl.setDeleteEnabled(acl.isDeleteEnabled());
        shareAcl.setCreateEnabled(acl.isCreateEnabled());
        shareAcl.setDownloadEnabled(acl.isDownloadEnabled());
        shareAcl.setRenameEnabled(acl.isRenameEnabled());
        shareAcl.setUploadEnabled(acl.isUploadEnabled());
        shareAcl.setListEnabled(acl.isListEnabled());



        Optional.ofNullable(acl.getDownloadBandwidth()).ifPresent(shareAcl::setDownloadBandwidth);
        Optional.ofNullable(acl.getUploadBandwidth()).ifPresent(shareAcl::setUploadBandwidth);
        Optional.ofNullable(acl.getFsUser()).map(FSUserNestview::getId).ifPresent(shareAcl::setUserId);
        Optional.ofNullable(acl.getFsUser()).map(FSUserNestview::getName).ifPresent(shareAcl::setAclName);
//        Optional.ofNullable(acl.getFsUserGroup()).map(FSUserGroupNestview::getId).ifPresent(shareAcl::setUserGroupId);
//        Optional.ofNullable(acl.getFsUserGroup()).map(FSUserGroupNestview::getName).ifPresent(shareAcl::setAclName);

        shareAcl.setUpdateTime(XskyCommonUtil.convertTime2Mills(acl.getUpdate()));
        shareAcl.setCreateTime(XskyCommonUtil.convertTime2Mills(acl.getCreate()));
        return shareAcl;
    }

    private Map<Long, FsFtpShareAcl> getLocalShareAcls(FsXskyAccount account, Long shareId){
        FsFtpShareAclExample example = new FsFtpShareAclExample();
        FsFtpShareAclExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        Optional.ofNullable(shareId).ifPresent(criteria::andShareIdEqualTo);
        List<FsFtpShareAcl> acls = fsFtpShareAclMapper.selectByExample(example);

        Map<Long, FsFtpShareAcl> localAcls =new HashMap<>();
        acls.forEach(client -> localAcls.put(client.getAclId(), client));
        return localAcls;
    }

    /**
     * 删除对象用户
     *
     * @param aclId
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void deleteAcl(Integer aclId) {
        if (null == aclId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsFtpShareAcl record = fsFtpShareAclMapper.selectByPrimaryKey(aclId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));

        client.deleteFsFTPShareACL(record.getShareId(), Arrays.asList(record.getAclId()));
        fsFtpShareAclMapper.deleteByPrimaryKey(record.getId());
        extFsFtpShareService.removeAclNumByShareId(record.getAccountId(), record.getShareId());
    }

    public void deleteLocalData(String xskyAccountId) {
        FsFtpShareAclExample example = new FsFtpShareAclExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        fsFtpShareAclMapper.deleteByExample(example);
    }

    private Map<Long, DfsFTPShareACL> getXskyAcls(FsShareClient client, Long shareId){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsFTPShareACL> acls = client.getFsFTPShareACL(page, shareId);

        Map<Long, DfsFTPShareACL> xskyAcls =new HashMap <>();
        acls.forEach( c -> {
            xskyAcls.put(c.getId(), c);
            }
        );
        return xskyAcls;
    }

    /**
     * 根据共享的shareIds和userIds查询Acl
     */
    public List<FsFtpShareAcl> getSmbShareAclsByShareIdsAndUserIds(List<Long> shareIds,List<Long> userIds){
        List<FsFtpShareAcl> fsFtpShareAcls = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(shareIds) && CollectionUtils.isNotEmpty(userIds)){
            FsFtpShareAclExample example = new FsFtpShareAclExample();
            example.createCriteria().andShareIdIn(shareIds).andUserIdIn(userIds);
            fsFtpShareAcls = fsFtpShareAclMapper.selectByExample(example);
        }
        return fsFtpShareAcls;
    }

}
