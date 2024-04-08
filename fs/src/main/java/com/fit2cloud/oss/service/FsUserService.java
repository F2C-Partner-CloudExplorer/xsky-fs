package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyUser;
import com.fit2cloud.oss.base.domain.FsXskyUserExample;
import com.fit2cloud.oss.base.mapper.FsXskyUserMapper;
import com.fit2cloud.oss.dto.FsXskyQueryDTO;
import com.fit2cloud.oss.dto.FsXskyUserDTO;
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
import xio.sds.client.model.FSUser;
import xio.sds.client.model.FSUserGroupNestview;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

import static com.fit2cloud.oss.exception.BusinessException.INVALID_REQUEST_PARAM_MSG;
import static com.fit2cloud.oss.exception.BusinessException.REPEAT_REQUEST_PARAM_MSG;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsUserService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsXskyUserMapper xskyUserMapper;
    @Resource
    ExtAccountService extAccountService;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsXskyUser> pagingUser(FsXskyUserDTO condition){
        FsXskyUserExample example = new FsXskyUserExample();
        FsXskyUserExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsXskyUserDTO();

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

        return xskyUserMapper.selectByExampleWithBLOBs(example);
    }

    public List<FsXskyUser> listUserByAccount(String accountId){
        FsXskyUserExample example = new FsXskyUserExample();
        FsXskyUserExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        Optional.ofNullable(accountId).ifPresent(criteria::andAccountIdEqualTo);
        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(criteria::andWorkspaceEqualTo);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(criteria::andOrganizationEqualTo);
        return xskyUserMapper.selectByExampleWithBLOBs(example);
    }

    public void syncFsUser(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyUser> localUsers = getLocalUsers(account);
        Map<Long, FSUser> xskyUsers = getXskyUsers(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localUserId : localUsers.keySet()){
            if(!xskyUsers.containsKey(localUserId)){
                xskyUserMapper.deleteByPrimaryKey(localUsers.get(localUserId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyUserId : xskyUsers.keySet()){
            FsXskyUser xskyUser = convert(account.getId(), xskyUsers.get(xskyUserId));

            if(!localUsers.containsKey(xskyUserId)){
                xskyUserMapper.insert(xskyUser);
            }else{
                FsXskyUserExample example = new FsXskyUserExample();
                example.createCriteria().andUserIdEqualTo(xskyUser.getUserId())
                        .andAccountIdEqualTo(account.getId());
                xskyUserMapper.updateByExampleSelective(xskyUser, example);
            }
        }
    }

    private FsXskyUser convert(String accountId, FSUser fsUser) {
        FsXskyUser xskyUser = new FsXskyUser();
        xskyUser.setAccountId(accountId);
        xskyUser.setName(fsUser.getName());
       /* xskyUser.setPassword(fsUser.getPassword());*/
        xskyUser.setUserId(fsUser.getId());
        xskyUser.setFsUserGroupNum(fsUser.getFsUserGroupNum());

        xskyUser.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsUser.getUpdate()));
        xskyUser.setCreateTime(XskyCommonUtil.convertTime2Mills(fsUser.getCreate()));
        Optional.ofNullable(fsUser.getFsUserGroups()).map(group ->
                JSONObject.toJSONString(fsUser.getFsUserGroups().stream()
                .map(FSUserGroupNestview::getId).collect(Collectors.toList()))).ifPresent(xskyUser::setFsUserGroupIds);

        return xskyUser;
    }

    private Map<Long, FsXskyUser> getLocalUsers(FsXskyAccount account){
        FsXskyUserExample example = new FsXskyUserExample();
        FsXskyUserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyUser> clients = xskyUserMapper.selectByExample(example);

        Map<Long, FsXskyUser> localUsers =new HashMap<>();
        clients.forEach(client -> localUsers.put(client.getUserId(), client));
        return localUsers;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public String createUser(FsXskyUserDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }

        if (checkNameExist(record.getAccountId(), record.getName(), null)) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FSUser resRecord = client.createFsUser(record);

        FsXskyUser user = convert(record.getAccountId(), resRecord);

        Optional.ofNullable(SessionUtils.getWorkspaceId()).ifPresent(record::setWorkspace);
        Optional.ofNullable(SessionUtils.getOrganizationId()).ifPresent(record::setOrganization);
        user.setOrganization(record.getOrganization());
        user.setWorkspace(record.getWorkspace());

        xskyUserMapper.insert(user);
        return JSONObject.toJSONString(record);
    }

    /**
     * 修改对象用户
     * @param record
     */
    public void updateUser(FsXskyUserDTO record) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (null == record.getId()) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyUser dbRecord = xskyUserMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        if (checkNameExist(record.getAccountId(), record.getName(), record.getUserId())) {
            throw new BusinessException(ReturnCode.E400000, REPEAT_REQUEST_PARAM_MSG);
        }

        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));
        FSUser resRecord = client.updateFsUser(record);
        FsXskyUser user = convert(record.getAccountId(), resRecord);
        user.setId(record.getId());
        xskyUserMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 删除对象用户
     *
     * @param userId
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public void deleteUser(Integer userId) {
        if (null == userId) {
            throw new BusinessException(ReturnCode.E400000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsXskyUser record = xskyUserMapper.selectByPrimaryKey(userId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, BusinessException.TARGET_NOT_EXISTS_MSG);
        }
        FsClient client = new FsClient(extAccountService.getXskyAccount(record.getAccountId()));

        if (!deletable(client, record.getUserId())) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.CLIENT_IN_SHARE);
        }

        client.deleteFsUser(record.getUserId());
        xskyUserMapper.deleteByPrimaryKey(record.getId());
    }

    public void bindWorkspace(Integer id, String workspaceId, String organizationId){
        FsXskyUser record = xskyUserMapper.selectByPrimaryKey(id);
        if (null == record) {
            throw new BusinessException(ReturnCode.E500001, BusinessException.TARGET_NOT_EXISTS_MSG);
        }

        record.setWorkspace(workspaceId);
        record.setOrganization(organizationId);
        xskyUserMapper.updateByPrimaryKey(record);
    }

    private boolean checkNameExist(String accountId, String name, Long recordId){
        FsXskyUserExample example = new FsXskyUserExample();
        FsXskyUserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andNameEqualTo(name);
        Optional.ofNullable(recordId).ifPresent(criteria::andUserIdNotEqualTo);
        if (CollectionUtils.isNotEmpty(xskyUserMapper.selectByExample(example))) {
            return true;
        }
        return false;
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyUserExample example = new FsXskyUserExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyUserMapper.deleteByExample(example);
    }

    public void modifyUserUserGroup(String accountId, Long userGroupId, List<Long> userIdList, boolean isAdd) {
        if (CollectionUtils.isEmpty(userIdList)) {
            return;
        }
        FsXskyUserExample example = new FsXskyUserExample();
        example.createCriteria().andUserIdIn(userIdList).andAccountIdEqualTo(accountId);
        List<FsXskyUser> userList = xskyUserMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(userList)) {
            return;
        }
        userList.stream().forEach(u -> {
            List<Long> userGroupIds = new ArrayList<>();
            if (u.getFsUserGroupIds() != null) {
                userGroupIds = JSONArray.parseArray(u.getFsUserGroupIds()).toJavaList(Long.class);
            }

            if (isAdd) {
                if (!userGroupIds.contains(userGroupId)) {
                    userGroupIds.add(userGroupId);
                    u.setFsUserGroupIds(JSONObject.toJSONString(userGroupIds));
                    u.setFsUserGroupNum(u.getFsUserGroupNum() + 1);
                }
            } else {
                if (userGroupIds.contains(userGroupId)) {
                    userGroupIds.remove(userGroupId);
                    u.setFsUserGroupIds(JSONObject.toJSONString(userGroupIds));
                    u.setFsUserGroupNum(u.getFsUserGroupNum() - 1);
                }
            }
            xskyUserMapper.updateByPrimaryKeySelective(u);
        });
    }

    private Map<Long, FSUser> getXskyUsers(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<FSUser> users = client.getFsUser(page);
        LogUtil.info("user ==> " + JSONObject.toJSONString(users));

        Map<Long, FSUser> xskyUsers =new HashMap <>();
        users.forEach( c -> {
            xskyUsers.put(c.getId(), c);
            }
        );
        return xskyUsers;
    }

    private boolean deletable(FsClient fsClient, Long userId) {
        FsXskyQueryDTO queryDTO = new FsXskyQueryDTO() {{
            setUserId(userId);
        }};
       /* if (fsClient.getFolderNumWithCondition(queryDTO) > 0) {
            return false;
        }*/
        return true;
    }

}
