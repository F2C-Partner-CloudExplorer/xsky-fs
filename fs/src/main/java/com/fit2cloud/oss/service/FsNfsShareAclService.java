package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.oss.base.domain.FsNfsShareAcl;
import com.fit2cloud.oss.base.domain.FsNfsShareAclExample;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyClient;
import com.fit2cloud.oss.base.mapper.FsNfsShareAclMapper;
import com.fit2cloud.oss.dto.FsNfsShareAclDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.service.ext.ExtFsNfsShareService;
import com.fit2cloud.oss.utils.FsShareClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.DfsNFSShareACL;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsNfsShareAclService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsNfsShareAclMapper fsNfsShareAclMapper;
    @Resource
    ExtAccountService extAccountService;
    @Resource
    ExtFsNfsShareService extFsNfsShareService;
    @Resource
    FsClientService fsClientService;
    @Resource
    FsClientGroupService fsClientGroupService;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsNfsShareAcl> pagingAcl(FsNfsShareAclDTO condition){
        FsNfsShareAclExample example = new FsNfsShareAclExample();
        FsNfsShareAclExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsNfsShareAclDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (null != condition.getShareId()) {
            criteria.andShareIdEqualTo(condition.getShareId());
        }

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return fsNfsShareAclMapper.selectByExample(example);
    }

    public List<FsNfsShareAcl> listAclByShare(String accountId, Long shareId){
        FsNfsShareAclExample example = new FsNfsShareAclExample();
        FsNfsShareAclExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        criteria.andAccountIdEqualTo(accountId).andShareIdEqualTo(shareId);
        return fsNfsShareAclMapper.selectByExample(example);
    }

    public void syncFsNfsShareAcl(FsXskyAccount account, FsShareClient client, Long shareId) {
        Map<Long, FsNfsShareAcl> localAcls = getLocalShareAcls(account, shareId);
        Map<Long, DfsNFSShareACL> xskyAcls = getXskyAcls(client, shareId);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localAclId : localAcls.keySet()){
            if(!xskyAcls.containsKey(localAclId)){
                fsNfsShareAclMapper.deleteByPrimaryKey(localAcls.get(localAclId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyAclId : xskyAcls.keySet()){
            FsNfsShareAcl xskyAcl = convert(account.getId(), xskyAcls.get(xskyAclId));

            if(!localAcls.containsKey(xskyAclId)){
                fsNfsShareAclMapper.insert(xskyAcl);
            }else{
                FsNfsShareAclExample example = new FsNfsShareAclExample();
                example.createCriteria().andAclIdEqualTo(xskyAcl.getAclId())
                        .andAccountIdEqualTo(account.getId());
                fsNfsShareAclMapper.updateByExampleSelective(xskyAcl, example);
            }
        }
    }

    private FsNfsShareAcl convert(String accountId, DfsNFSShareACL acl) {
        FsNfsShareAcl shareAcl = new FsNfsShareAcl();
        shareAcl.setAccountId(accountId);
        shareAcl.setShareId(acl.getDfsNfsShare().getId());
        shareAcl.setAclId(acl.getId());
        shareAcl.setPermission(acl.getPermission());
        shareAcl.setType(acl.getType());
        shareAcl.setClients(acl.getClients());
        shareAcl.setUpdateTime(XskyCommonUtil.convertTime2Mills(acl.getUpdate()));
        shareAcl.setCreateTime(XskyCommonUtil.convertTime2Mills(acl.getCreate()));
        shareAcl.setAclName(acl.getClients());
        //todo
       /* Optional.ofNullable(acl.getClients()).map(FSClientNestview::getId).ifPresent(shareAcl::setClients);
        Optional.ofNullable(acl.getFsClient()).map(FSClientNestview::getName).ifPresent(shareAcl::setAclName);
        Optional.ofNullable(acl.getFsClientGroup()).map(FSClientGroupNestview::getId).ifPresent(shareAcl::setClientGroupId);
        Optional.ofNullable(acl.getFsClientGroup()).map(FSClientGroupNestview::getName).ifPresent(shareAcl::setAclName);*/

        return shareAcl;
    }

    public List<Long> listShareIdsByAcl(String accountId) {
        List<Long> shareIds = new ArrayList<>();

        FsNfsShareAclExample example = new FsNfsShareAclExample();
        FsNfsShareAclExample.Criteria criteria = example.createCriteria();

        List<Long> clientIds = fsClientService.listClientByAccount(accountId)
                .stream().map(FsXskyClient::getClientId).collect(Collectors.toList());
       /* List<Long> clientGroupIds = fsClientGroupService.listClientGroupByAccount(accountId)
                .stream().map(FsXskyClientGroup::getClientGroupId).collect(Collectors.toList());*/

        List<Long> subClientGroupIds = fsClientService.listClientByAccount(accountId)
                .stream().map(FsXskyClient::getClientGroupIds).flatMap(ids ->
                        JSONArray.parseArray(Optional.ofNullable(ids).orElse(JSONObject.toJSONString(new ArrayList<>())))
                                .toJavaList(Long.class).stream()).distinct().collect(Collectors.toList());

       /* if (CollectionUtils.isNotEmpty(subClientGroupIds)) {
            clientGroupIds.addAll(subClientGroupIds);
        }*/

        if (CollectionUtils.isNotEmpty(clientIds)) {
            criteria.andAccountIdEqualTo(accountId);
            criteria.andClientIdIn(clientIds);
            shareIds.addAll(fsNfsShareAclMapper.selectByExample(example).stream()
                    .map(FsNfsShareAcl::getShareId).collect(Collectors.toList()));
        }

       /* if (CollectionUtils.isNotEmpty(clientGroupIds)) {
            example.clear();
            criteria = example.createCriteria();
            criteria.andAccountIdEqualTo(accountId);
            criteria.andClientGroupIdIn(clientGroupIds);
            shareIds.addAll(fsNfsShareAclMapper.selectByExample(example).stream()
                    .map(FsNfsShareAcl::getShareId).collect(Collectors.toList()));
        }*/
        return shareIds;
    }

    public void deleteAcl(Integer aclId) {
        if (null == aclId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsNfsShareAcl record = fsNfsShareAclMapper.selectByPrimaryKey(aclId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsShareClient client = new FsShareClient(extAccountService.getXskyAccount(record.getAccountId()));

        client.deleteFsNFSShareACL(record.getShareId(), Arrays.asList(record.getAclId()));
        fsNfsShareAclMapper.deleteByPrimaryKey(record.getId());
        extFsNfsShareService.removeAclNumByShareId(record.getAccountId(), record.getShareId());
    }

    private Map<Long, FsNfsShareAcl> getLocalShareAcls(FsXskyAccount account, Long shareId){
        FsNfsShareAclExample example = new FsNfsShareAclExample();
        FsNfsShareAclExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        Optional.ofNullable(shareId).ifPresent(criteria::andShareIdEqualTo);
        List<FsNfsShareAcl> acls = fsNfsShareAclMapper.selectByExample(example);

        Map<Long, FsNfsShareAcl> localAcls =new HashMap<>();
        acls.forEach(client -> localAcls.put(client.getAclId(), client));
        return localAcls;
    }

    public void deleteLocalData(String xskyAccountId) {
        FsNfsShareAclExample example = new FsNfsShareAclExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        fsNfsShareAclMapper.deleteByExample(example);
    }

    private Map<Long, DfsNFSShareACL> getXskyAcls(FsShareClient client , Long shareId){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsNFSShareACL> acls = client.getDfsNfsShareAcls(page, shareId);

        Map<Long, DfsNFSShareACL> xskyAcls =new HashMap <>();
        acls.forEach( c -> {
                    xskyAcls.put(c.getId(), c);
                }
        );
        return xskyAcls;
    }
}
