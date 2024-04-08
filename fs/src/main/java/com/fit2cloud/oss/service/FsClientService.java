package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyClient;
import com.fit2cloud.oss.base.domain.FsXskyClientExample;
import com.fit2cloud.oss.base.mapper.FsXskyClientMapper;
import com.fit2cloud.oss.dto.FsXskyClientDTO;
import com.fit2cloud.oss.dto.FsXskyQueryDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.Client;

import javax.annotation.Resource;
import java.util.*;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsClientService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsXskyClientMapper xskyClientMapper;
    @Resource
    ExtAccountService extAccountService;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsXskyClient> pagingClient(FsXskyClientDTO condition){
        FsXskyClientExample example = new FsXskyClientExample();
        FsXskyClientExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsXskyClientDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (StringUtils.isNotBlank(condition.getName())) {
            criteria.andNameLike("%" + condition.getName() + "%");
        }

        Optional.ofNullable(condition.getIp()).map(ip -> "%" + ip + "%").ifPresent(criteria::andIpLike);
        Optional.ofNullable(condition.getWorkspace()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(condition.getOrganization()).ifPresent(criteria::andOrganizationEqualTo);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return xskyClientMapper.selectByExampleWithBLOBs(example);
    }

    public List<FsXskyClient> listClientByAccount(String accountId){
        FsXskyClientExample example = new FsXskyClientExample();
        FsXskyClientExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        Optional.ofNullable(accountId).ifPresent(criteria::andAccountIdEqualTo);
        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);
        return xskyClientMapper.selectByExampleWithBLOBs(example);
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyClientExample example = new FsXskyClientExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyClientMapper.deleteByExample(example);
    }

   /* public void syncFsClient(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyClient> localClients = getLocalClients(account);
        Map<Long, Client> xskyClients = getXskyClients(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localClientId : localClients.keySet()){
            if(!xskyClients.containsKey(localClientId)){
                xskyClientMapper.deleteByPrimaryKey(localClients.get(localClientId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyClientId : xskyClients.keySet()){
            FsXskyClient xskyClient = convert(account.getId(), xskyClients.get(xskyClientId));

            if(!localClients.containsKey(xskyClientId)){
                xskyClientMapper.insert(xskyClient);
            }else{
                FsXskyClientExample example = new FsXskyClientExample();
                example.createCriteria().andClientIdEqualTo(xskyClient.getClientId())
                        .andAccountIdEqualTo(account.getId());
                xskyClientMapper.updateByExampleSelective(xskyClient, example);
            }
        }
    }*/

   /* @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public String createClient(FsXskyClientDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }

        if (checkNameExist(record.getAccountId(), record.getName(), null)) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FSClient resRecord = client.createFsClient(record);
        FsXskyClient fsXskyClient = convert(record.getAccountId(), resRecord);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(record::setWorkspace);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(record::setOrganization);
        fsXskyClient.setOrganization(record.getOrganization());
        fsXskyClient.setWorkspace(record.getWorkspace());

        xskyClientMapper.insert(fsXskyClient);
        return JSONObject.toJSONString(record);
    }

    *//**
     * 修改对象用户
     * @param record
     *//*
    public void updateCilent(FsXskyClientDTO record){
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (null == record.getId()) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyClient dbRecord = xskyClientMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        if (checkNameExist(record.getAccountId(), record.getName(), record.getClientId())) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FSClient resRecord = client.updateFsClient(record);
        FsXskyClient fsXskyClient = convert(record.getAccountId(), resRecord);
        fsXskyClient.setId(record.getId());
        xskyClientMapper.updateByPrimaryKeySelective(fsXskyClient);
    }

    public void bindWorkspace(Integer id, String workspaceId, String organizationId){
        FsXskyClient record = xskyClientMapper.selectByPrimaryKey(id);
        if (null == record) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        record.setWorkspace(workspaceId);
        record.setOrganization(organizationId);
        xskyClientMapper.updateByPrimaryKey(record);
    }

    *//**
     * 删除对象用户
     *
     * @param clientId
     *//*
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void deleteClient(Integer clientId) {
        if (null == clientId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyClient record = xskyClientMapper.selectByPrimaryKey(clientId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));

        if (!deletable(client, record.getClientId())) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.CLIENT_IN_SHARE);
        }

        client.deleteFsClient(record.getClientId());
        xskyClientMapper.deleteByPrimaryKey(record.getId());
    }

    private FsXskyClient convert(String accountId, Client fsClient) {
        FsXskyClient xskyClient = new FsXskyClient();
        xskyClient.setAccountId(accountId);
        xskyClient.setName(fsClient.getName());
        xskyClient.setIp(fsClient.getIp());
        xskyClient.setClientId(fsClient.getId());
        xskyClient.setClientGroupNum(fsClient.getFsClientGroupNum());

        xskyClient.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsClient.getUpdate()));
        xskyClient.setCreateTime(XskyCommonUtil.convertTime2Mills(fsClient.getCreate()));
        Optional.ofNullable(fsClient.getFsClientGroups()).map(group ->
                JSONObject.toJSONString(fsClient.getFsClientGroups().stream()
                .map(FSClientGroupNestview::getId).collect(Collectors.toList()))).ifPresent(xskyClient::setClientGroupIds);

        return xskyClient;
    }
*/
    private Map<Long, FsXskyClient> getLocalClients(FsXskyAccount account){
        FsXskyClientExample example = new FsXskyClientExample();
        FsXskyClientExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyClient> clients = xskyClientMapper.selectByExample(example);

        Map<Long, FsXskyClient> localClients =new HashMap<>();
        clients.forEach(client -> localClients.put(client.getClientId(), client));
        return localClients;
    }

    private Map<Long, Client> getXskyClients(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<Client> clients = client.getFsClient(page);

        Map<Long, Client> xskyClients =new HashMap <>();
        clients.forEach( c -> {
                xskyClients.put(c.getId(), c);
            }
        );
        return xskyClients;
    }

    public void modifyClientClientGroup(String accountId, Long clientGroupId, List<Long> clientIdList, boolean isAdd) {
        if (CollectionUtils.isEmpty(clientIdList)) {
            return;
        }
        FsXskyClientExample example = new FsXskyClientExample();
        example.createCriteria().andClientIdIn(clientIdList).andAccountIdEqualTo(accountId);
        List<FsXskyClient> clientList = xskyClientMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(clientList)) {
            return;
        }
        clientList.stream().forEach(u -> {
            List<Long> clientGroupIds = new ArrayList<>();
            if (u.getClientGroupIds() != null) {
                clientGroupIds = JSONArray.parseArray(u.getClientGroupIds()).toJavaList(Long.class);
            }
            if (isAdd) {
                if (!clientGroupIds.contains(clientGroupId)) {
                    clientGroupIds.add(clientGroupId);
                    u.setClientGroupIds(JSONObject.toJSONString(clientGroupIds));
                    u.setClientGroupNum(u.getClientGroupNum() + 1);
                }
            } else {
                if (clientGroupIds.contains(clientGroupId)) {
                    clientGroupIds.remove(clientGroupId);
                    u.setClientGroupIds(JSONObject.toJSONString(clientGroupIds));
                    u.setClientGroupNum(u.getClientGroupNum() - 1);
                }
            }
            xskyClientMapper.updateByPrimaryKeySelective(u);
        });
    }

    private boolean checkNameExist(String accountId, String name, Long recordId){
        FsXskyClientExample example = new FsXskyClientExample();
        FsXskyClientExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andNameEqualTo(name);
        Optional.ofNullable(recordId).ifPresent(criteria::andClientIdNotEqualTo);
        if (CollectionUtils.isNotEmpty(xskyClientMapper.selectByExample(example))) {
            return true;
        }
        return false;
    }

    private boolean deletable(FsClient fsClient, Long clientId) {
        FsXskyQueryDTO queryDTO = new FsXskyQueryDTO() {{
            setClientId(clientId);
        }};
       /* if (fsClient.getFolderNumWithCondition(queryDTO) > 0) {
            return false;
        }*/
        return true;
    }

}
