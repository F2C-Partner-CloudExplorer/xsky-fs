package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.server.model.SessionUser;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyUserGroup;
import com.fit2cloud.oss.base.domain.FsXskyUserGroupExample;
import com.fit2cloud.oss.base.mapper.FsXskyUserGroupMapper;
import com.fit2cloud.oss.dto.FsXskyQueryDTO;
import com.fit2cloud.oss.dto.FsXskyUpdateUserGroupDTO;
import com.fit2cloud.oss.dto.FsXskyUserGroupDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.FSUserGroup;
import xio.sds.client.model.FSUserNestview;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.fit2cloud.oss.exception.BusinessException.INVALID_REQUEST_PARAM_MSG;
import static com.fit2cloud.oss.exception.BusinessException.REPEAT_REQUEST_PARAM_MSG;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsUserGroupService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsXskyUserGroupMapper xskyUserGroupMapper;
    @Resource
    private FsUserService fsUserService;
    @Resource
    ExtAccountService extAccountService;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsXskyUserGroup> pagingUserGroup(FsXskyUserGroupDTO condition){
        FsXskyUserGroupExample example = new FsXskyUserGroupExample();
        FsXskyUserGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsXskyUserGroupDTO();

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

        return xskyUserGroupMapper.selectByExampleWithBLOBs(example);
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyUserGroupExample example = new FsXskyUserGroupExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyUserGroupMapper.deleteByExample(example);
    }

    public void syncFsUserGroup(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyUserGroup> localUserGroups = getLocalUserGroup(account);
        Map<Long, FSUserGroup> xskyUserGroups = getXskyUserGroup(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localUserGroupId : localUserGroups.keySet()){
            if(!xskyUserGroups.containsKey(localUserGroupId)){
                xskyUserGroupMapper.deleteByPrimaryKey(localUserGroups.get(localUserGroupId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyUserGroupId : xskyUserGroups.keySet()){
            FsXskyUserGroup xskyUserGroup = convert(account.getId(), xskyUserGroups.get(xskyUserGroupId));

            if(!localUserGroups.containsKey(xskyUserGroupId)){
                xskyUserGroupMapper.insert(xskyUserGroup);
            }else{
                FsXskyUserGroupExample example = new FsXskyUserGroupExample();
                example.createCriteria().andUserGroupIdEqualTo(xskyUserGroup.getUserGroupId())
                        .andAccountIdEqualTo(account.getId());
                xskyUserGroupMapper.updateByExampleSelective(xskyUserGroup, example);
            }
        }
    }

    private FsXskyUserGroup convert(String accountId, FSUserGroup fsUserGroup) {
        FsXskyUserGroup xskyUserGroup = new FsXskyUserGroup();
        xskyUserGroup.setAccountId(accountId);
        xskyUserGroup.setName(fsUserGroup.getName());
        xskyUserGroup.setActionStatus(fsUserGroup.getActionStatus());
        xskyUserGroup.setUserGroupId(fsUserGroup.getId());

        xskyUserGroup.setUserNum(fsUserGroup.getUserNum());
        xskyUserGroup.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsUserGroup.getUpdate()));
        xskyUserGroup.setCreateTime(XskyCommonUtil.convertTime2Mills(fsUserGroup.getCreate()));
        Optional.ofNullable(fsUserGroup.getFsUsers()).map(group ->
                JSONObject.toJSONString(fsUserGroup.getFsUsers().stream()
                .map(FSUserNestview::getId).collect(Collectors.toList()))).ifPresent(xskyUserGroup::setUserIds);

        return xskyUserGroup;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public String createUserGroup(FsXskyUserGroupDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (checkNameExist(record.getAccountId(), record.getName(), null)) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FSUserGroup resRecord = client.createFsUserGroup(record);

        FsXskyUserGroup userGroup = convert(record.getAccountId(), resRecord);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(record::setWorkspace);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(record::setOrganization);
        userGroup.setOrganization(record.getOrganization());
        userGroup.setWorkspace(record.getWorkspace());

        xskyUserGroupMapper.insert(userGroup);

        fsUserService.modifyUserUserGroup(record.getAccountId(), userGroup.getUserGroupId(), record.getUserIdList(), true);

        return JSONObject.toJSONString(record);
    }

    /**
     * 修改对象用户
     * @param record
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void updateUserGroup(FsXskyUserGroupDTO record){
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (null == record.getId()) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyUserGroup dbRecord = xskyUserGroupMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        if (checkNameExist(record.getAccountId(), record.getName(), record.getUserGroupId())) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FsXskyUpdateUserGroupDTO resRecord = client.updateFsUserGroup(record);
        FsXskyUserGroup userGroup = convert(record.getAccountId(), resRecord.getFsUserGroup());
        userGroup.setId(record.getId());
        xskyUserGroupMapper.updateByPrimaryKeySelective(userGroup);
        fsUserService.modifyUserUserGroup(record.getAccountId(), userGroup.getUserGroupId(),
                resRecord.getAddUserIds(), true);
        fsUserService.modifyUserUserGroup(record.getAccountId(), userGroup.getUserGroupId(),
                resRecord.getRemoveUserIds(), false);
    }

    public void bindWorkspace(Integer id, String workspaceId, String organizationId){
        FsXskyUserGroup record = xskyUserGroupMapper.selectByPrimaryKey(id);
        if (null == record) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        if (!deletable(client, record.getUserGroupId())) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.USER_GROUP_IN_SHARE_NOT_MODIFIED_WORKSPACE);
        }

        record.setWorkspace(workspaceId);
        record.setOrganization(organizationId);
        xskyUserGroupMapper.updateByPrimaryKey(record);
    }

    public List<FsXskyUserGroup> listUserGroupByAccount(String accountId){
        FsXskyUserGroupExample example = new FsXskyUserGroupExample();
        FsXskyUserGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        Optional.ofNullable(accountId).ifPresent(criteria::andAccountIdEqualTo);
        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);
        return xskyUserGroupMapper.selectByExampleWithBLOBs(example);
    }

    /**
     * 删除对象用户
     *
     * @param userGroupId
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void deleteUserGroup(Integer userGroupId) {
        if (null == userGroupId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyUserGroup record = xskyUserGroupMapper.selectByPrimaryKey(userGroupId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        if (!deletable(client, record.getUserGroupId())) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.USER_GROUP_IN_SHARE);
        }
        client.deleteFsUserGroup(record.getUserGroupId());
        xskyUserGroupMapper.deleteByPrimaryKey(record.getId());
        fsUserService.modifyUserUserGroup(record.getAccountId(), record.getUserGroupId(),
                JSONArray.parseArray(record.getUserIds()).toJavaList(Long.class), false);
    }

    private Map<Long, FsXskyUserGroup> getLocalUserGroup(FsXskyAccount account){
        FsXskyUserGroupExample example = new FsXskyUserGroupExample();
        FsXskyUserGroupExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyUserGroup> Users = xskyUserGroupMapper.selectByExample(example);

        Map<Long, FsXskyUserGroup> localUsers =new HashMap<>();
        Users.forEach(UserGroup -> localUsers.put(UserGroup.getUserGroupId(), UserGroup));
        return localUsers;
    }

    private boolean checkNameExist(String accountId, String name, Long recordId){
        FsXskyUserGroupExample example = new FsXskyUserGroupExample();
        FsXskyUserGroupExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andNameEqualTo(name);
        Optional.ofNullable(recordId).ifPresent(criteria::andUserGroupIdNotEqualTo);
        if (CollectionUtils.isNotEmpty(xskyUserGroupMapper.selectByExample(example))) {
            return true;
        }
        return false;
    }

    private Map<Long, FSUserGroup> getXskyUserGroup(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<FSUserGroup> Users = client.getFsUserGroup(page);

        Map<Long, FSUserGroup> xskyUserGroups =new HashMap <>();
        Users.forEach( c -> {
            xskyUserGroups.put(c.getId(), c);
            }
        );
        return xskyUserGroups;
    }

    private boolean deletable(FsClient fsClient, Long userGroupId) {
        FsXskyQueryDTO queryDTO = new FsXskyQueryDTO() {{
            setUserGroupId(userGroupId);
        }};
       /* if (fsClient.getFolderNumWithCondition(queryDTO) > 0) {
            return false;
        }*/
        return true;
    }
}
