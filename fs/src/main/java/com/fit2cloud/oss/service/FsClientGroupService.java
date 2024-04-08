package com.fit2cloud.oss.service;

import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyClientGroup;
import com.fit2cloud.oss.base.domain.FsXskyClientGroupExample;
import com.fit2cloud.oss.base.mapper.FsXskyClientGroupMapper;
import com.fit2cloud.oss.dto.FsXskyClientGroupDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.ClientGroup;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsClientGroupService {

    private static final String ID_DESC = "id desc";
    @Resource
    ExtAccountService extAccountService;
    @Resource
    FsClientService fsClientService;

    @Resource
    private FsXskyClientGroupMapper xskyClientGroupMapper;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsXskyClientGroup> pagingClient(FsXskyClientGroupDTO condition){
        FsXskyClientGroupExample example = new FsXskyClientGroupExample();
        FsXskyClientGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsXskyClientGroupDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (StringUtils.isNotBlank(condition.getName())) {
            criteria.andNameLike("%" + condition.getName() + "%");
        }
        Optional.ofNullable(condition.getWorkspace()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(condition.getOrganization()).ifPresent(criteria::andOrganizationEqualTo);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return xskyClientGroupMapper.selectByExampleWithBLOBs(example);
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyClientGroupExample example = new FsXskyClientGroupExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyClientGroupMapper.deleteByExample(example);
    }

    /*public void syncFsClientGroup(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyClientGroup> localClientGroups = getLocalClientGroup(account);
        Map<Long, ClientGroup> xskyClientGroups = getXskyClientGroup(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localClientGroupId : localClientGroups.keySet()){
            if(!xskyClientGroups.containsKey(localClientGroupId)){
                xskyClientGroupMapper.deleteByPrimaryKey(localClientGroups.get(localClientGroupId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyClientGroupId : xskyClientGroups.keySet()){
            FsXskyClientGroup xskyClientGroup = convert(account.getId(), xskyClientGroups.get(xskyClientGroupId));

            if(!localClientGroups.containsKey(xskyClientGroupId)){
                xskyClientGroupMapper.insert(xskyClientGroup);
            }else{
                FsXskyClientGroupExample example = new FsXskyClientGroupExample();
                example.createCriteria().andClientGroupIdEqualTo(xskyClientGroup.getClientGroupId());
                xskyClientGroupMapper.updateByExampleSelective(xskyClientGroup, example);
            }
        }
    }*/

   /* private FsXskyClientGroup convert(String accountId, ClientGroup fsClientGroup) {
        FsXskyClientGroup xskyClientGroup = new FsXskyClientGroup();
        xskyClientGroup.setAccountId(accountId);
        xskyClientGroup.setName(fsClientGroup.getName());
        xskyClientGroup.setActionStatus(fsClientGroup.getStatus());
        xskyClientGroup.setClientGroupId(fsClientGroup.getId());

        xskyClientGroup.setClientNum(fsClientGroup.getClientNum());
        xskyClientGroup.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsClientGroup.getUpdate()));
        xskyClientGroup.setCreateTime(XskyCommonUtil.convertTime2Mills(fsClientGroup.getCreate()));
        Optional.ofNullable(fsClientGroup.getClients()).map(group ->
                JSONObject.toJSONString(fsClientGroup.getClients().stream()
                .map(Client::getId).collect(Collectors.toList()))).ifPresent(xskyClientGroup::setClientIds);


        return xskyClientGroup;
    }*/

   /* @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public String createClientGroup(FsXskyClientGroupDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }

        if (checkNameExist(record.getAccountId(), record.getName(), null)) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FSClientGroup resRecord = client.createFsClientGroup(record);

        FsXskyClientGroup clientGroup = convert(record.getAccountId(), resRecord);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(record::setWorkspace);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(record::setOrganization);
        clientGroup.setOrganization(record.getOrganization());
        clientGroup.setWorkspace(record.getWorkspace());

        xskyClientGroupMapper.insert(clientGroup);
        fsClientService.modifyClientClientGroup(record.getAccountId(), clientGroup.getClientGroupId(), record.getClientIdList(), true);
        return JSONObject.toJSONString(record);
    }
*/
    /**
     * 修改对象用户
     * @param record
     */
  /*  @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void updateClientGroup(FsXskyClientGroupDTO record){
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (null == record.getId()) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyClientGroup dbRecord = xskyClientGroupMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        if (checkNameExist(record.getAccountId(), record.getName(), record.getClientGroupId())) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FsXskyUpdateClientGroupDTO resRecord = client.updateFsClientGroup(record);

        FsXskyClientGroup clientGroup = convert(record.getAccountId(), resRecord.getFsClientGroup());
        clientGroup.setId(record.getId());
        xskyClientGroupMapper.updateByPrimaryKeySelective(clientGroup);
        fsClientService.modifyClientClientGroup(record.getAccountId(), clientGroup.getClientGroupId(),
                resRecord.getAddClientIds(), true);
        fsClientService.modifyClientClientGroup(record.getAccountId(), clientGroup.getClientGroupId(),
                resRecord.getRemoveClientIds(), false);
    }

    *//**
     * 删除对象用户
     *
     * @param
     *//*
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void deleteClientGroup(Integer clientGroupId) {
        if (null == clientGroupId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyClientGroup record = xskyClientGroupMapper.selectByPrimaryKey(clientGroupId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));

        if (!deletable(client, record.getClientGroupId())) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.CLIENT_GROUP_IN_SHARE);
        }

        client.deleteFsClientGroup(record.getClientGroupId());
        xskyClientGroupMapper.deleteByPrimaryKey(record.getId());
        fsClientService.modifyClientClientGroup(record.getAccountId(), record.getClientGroupId(),
                JSONArray.parseArray(record.getClientIds()).toJavaList(Long.class), false);
    }
*/
   /* public void bindWorkspace(Integer id, String workspaceId, String organizationId){
        FsXskyClientGroup record = xskyClientGroupMapper.selectByPrimaryKey(id);
        if (null == record) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        if (!deletable(client, record.getClientGroupId())) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.CLIENT_GROUP_IN_SHARE_NOT_MODIFIED_WORKSPACE);
        }

        record.setWorkspace(workspaceId);
        record.setOrganization(organizationId);
        xskyClientGroupMapper.updateByPrimaryKey(record);
    }*/

    /*public List<FsXskyClientGroup> listClientGroupByAccount(String accountId){
        FsXskyClientGroupExample example = new FsXskyClientGroupExample();
        FsXskyClientGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        Optional.ofNullable(accountId).ifPresent(criteria::andAccountIdEqualTo);
        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);
        return xskyClientGroupMapper.selectByExampleWithBLOBs(example);
    }*/

   /* private boolean deletable(FsClient fsClient, Long clientGroupId) {
        FsXskyQueryDTO queryDTO = new FsXskyQueryDTO() {{
            setClientGroupId(clientGroupId);
        }};
        if (fsClient.getFolderNumWithCondition(queryDTO) > 0) {
            return false;
        }
        return true;
    }*/

    private boolean checkNameExist(String accountId, String name, Long recordId){
        FsXskyClientGroupExample example = new FsXskyClientGroupExample();
        FsXskyClientGroupExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andNameEqualTo(name);
        Optional.ofNullable(recordId).ifPresent(criteria::andClientGroupIdNotEqualTo);
        if (CollectionUtils.isNotEmpty(xskyClientGroupMapper.selectByExample(example))) {
            return true;
        }
        return false;
    }

    private Map<Long, FsXskyClientGroup> getLocalClientGroup(FsXskyAccount account){
        FsXskyClientGroupExample example = new FsXskyClientGroupExample();
        FsXskyClientGroupExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyClientGroup> clients = xskyClientGroupMapper.selectByExample(example);

        Map<Long, FsXskyClientGroup> localClients =new HashMap<>();
        clients.forEach(clientGroup -> localClients.put(clientGroup.getClientGroupId(), clientGroup));
        return localClients;
    }

    private Map<Long, ClientGroup> getXskyClientGroup(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<ClientGroup> clients = client.getFsClientGroup(page);

        Map<Long, ClientGroup> xskyClientGroups =new HashMap <>();
        clients.forEach( c -> {
            xskyClientGroups.put(c.getId(), c);
            }
        );
        return xskyClientGroups;
    }
}
