package com.fit2cloud.oss.service;


import com.fit2cloud.commons.server.base.domain.Organization;
import com.fit2cloud.commons.server.base.domain.OrganizationExample;
import com.fit2cloud.commons.server.base.domain.Workspace;
import com.fit2cloud.commons.server.base.domain.WorkspaceExample;
import com.fit2cloud.commons.server.base.mapper.OrganizationMapper;
import com.fit2cloud.commons.server.base.mapper.UserMapper;
import com.fit2cloud.commons.server.base.mapper.WorkspaceMapper;
import com.fit2cloud.commons.utils.CommonThreadPool;
import com.fit2cloud.commons.utils.EncryptUtils;
import com.fit2cloud.commons.utils.UUIDUtil;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyAccountExample;
import com.fit2cloud.oss.base.mapper.FsXskyAccountMapper;
import com.fit2cloud.oss.common.constants.FsConstants;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.FsShareClient;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author upeoe
 * @create 2018/10/24 17:36
 * OSS account service.
 */
@Service
public class AccountService {

    private static final String ID_DESC = "id desc";
    private static final String INVALID_REQUEST_PARAM_MSG = "无效的请求参数";
    private static final String TARGET_NOT_EXISTS_MSG = "请求目标不存在";

    private enum OPTIONS {
        CREATE, UPDATE;

        public boolean equals(String str) {
            return StringUtils.equals(name(), str);
        }
    }

    @Resource
    private FsXskyAccountMapper accountMapper;
    @Resource
    private FsClientService fsClientService;
    @Resource
    private FsClientGroupService fsClientGroupService;
    @Resource
    private FsUserService fsUserService;
    @Resource
    private FsUserGroupService fsUserGroupService;
    @Resource
    private FsGatewayService fsGatewayService;
    @Resource
    private FsGatewayGroupService fsGatewayGroupService;
    @Resource
    private FsPoolService fsPoolService;
    @Resource
    private CommonThreadPool commonThreadPool;

    @Resource
    private FsFtpShareService fsFtpShareService;
    @Resource
    private FsFtpShareAclService fsFtpShareAclService;
    @Resource
    private FsNfsShareService fsNfsShareService;
    @Resource
    private FsNfsShareAclService fsNfsShareAclService;
    @Resource
    private FsSmbShareService fsSmbShareService;
    @Resource
    private FsSmbShareAclService fsSmbShareAclService;


    @Resource
    private OrganizationMapper organizationMapper;

    @Resource
    private WorkspaceMapper workspaceMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private FsXskyVipService fsXskyVipService;

    /**
     *账号页面展示
     * @param condition
     * @return
     */
    public List <FsXskyAccount> pagingAccount(FsXskyAccount condition) {

        FsXskyAccountExample example = new FsXskyAccountExample();
        FsXskyAccountExample.Criteria criteria = example.createCriteria();

        if (null != condition) {
            if (null != condition.getId()) {
                criteria.andIdEqualTo(condition.getId());
            }
            if (StringUtils.isNotBlank(condition.getXskyEndpoint())) {
                criteria.andXskyEndpointLike("%" + condition.getXskyEndpoint() + "%");
            }
            if (StringUtils.isNotBlank(condition.getUsername())) {
                criteria.andUsernameEqualTo(condition.getUsername());
            }
            if (StringUtils.isNotBlank(condition.getStatus())) {
                criteria.andStatusEqualTo(condition.getStatus());
            }
            if (StringUtils.isNotBlank(condition.getSyncStatus())) {
                criteria.andSyncStatusEqualTo(condition.getSyncStatus());
            }
            if (StringUtils.isNotBlank(condition.getName())) {
                criteria.andNameLike("%" + condition.getName() + "%");
            }
        }
        example.setOrderByClause(ID_DESC);

        return accountMapper.selectByExample(example);
    }

    /**
     * 创建对接XSKY的账号信息
     *
     * @param record
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class})
    public FsXskyAccount createAccount(FsXskyAccount record) {
        validateAccountParams(record, OPTIONS.CREATE);

        FsXskyAccountExample example = new FsXskyAccountExample();
        example.createCriteria()
                .andXskyEndpointEqualTo(record.getXskyEndpoint());
        if (accountMapper.countByExample(example) > 0) {
            throw new BusinessException(ReturnCode.E500001, "账号已存在");
        }

        //名称不能重复
        example.clear();
        example.createCriteria().andNameEqualTo(record.getName());
        if (accountMapper.countByExample(example)>0){
            throw new BusinessException(ReturnCode.E500001,"名称已存在");
        }

//        record.setPassword(EncryptUtils.base64Encoding(record.getPassword()));
        record.setToken(EncryptUtils.base64Encoding(record.getToken()));
        validateXskyAccount(record);
        record.setStatus(FsConstants.ACCOUNT_STATUS.VALID.name());
        record.setSyncStatus(FsConstants.ACCOUNT_SYNC_STATUS.PENDING.name());
        record.setId(UUIDUtil.newUUID());
        try {
            accountMapper.insertSelective(record);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return record;
    }


    /**
     * 更新对接XSKY的账号信息
     *
     * @param record
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class}, noRollbackFor = {BusinessException.class})
    public void updateAccount(FsXskyAccount record) {
        validateAccountParams(record, OPTIONS.UPDATE);
        FsXskyAccount dbRecord = accountMapper.selectByPrimaryKey(record.getId());
        if (null == dbRecord) {
            throw new BusinessException(ReturnCode.E500001, TARGET_NOT_EXISTS_MSG);
        }
        if (!StringUtils.equals(record.getToken(), dbRecord.getToken())) {
            record.setToken(EncryptUtils.base64Encoding(record.getToken()));
        }

        //验证名称
        FsXskyAccountExample example = new FsXskyAccountExample();
        example.createCriteria().andNameEqualTo(record.getName());
        List<FsXskyAccount> fsXskyAccounts = accountMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(fsXskyAccounts)){
            FsXskyAccount fsXskyAccount = fsXskyAccounts.get(0);
            if (!StringUtils.equals(fsXskyAccount.getId(),record.getId())){
                throw new BusinessException(ReturnCode.E500001,"名称已存在");
            }
        }

        validateXskyAccount(record);
        record.setStatus(FsConstants.ACCOUNT_STATUS.VALID.name());
        record.setSyncStatus(FsConstants.ACCOUNT_SYNC_STATUS.PENDING.name());
        accountMapper.updateByPrimaryKey(record);
    }


    /**
     * 检查对接XSKY的账号信息参数
     *
     * @param record
     * @param option
     */
    private void validateAccountParams(FsXskyAccount record, OPTIONS option) {
        if (null == record) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        switch (option) {
            case UPDATE:
                if (null == record.getId()) {
                    throw new BusinessException(ReturnCode.E402000, "Invalid XSky account id");
                }
                break;
        }
        if (StringUtils.isBlank(record.getXskyEndpoint())) {
            throw new BusinessException(ReturnCode.E402000, "XSKY地址不能为空");
        }
        if (StringUtils.isBlank(record.getUsername())) {
            throw new BusinessException(ReturnCode.E402000, "XSKY用户名不能为空");
        }
        if (StringUtils.isBlank(record.getToken())) {
            throw new BusinessException(ReturnCode.E402000, "XSKY用户token不能为空");
        }
        if (StringUtils.isBlank(record.getName())) {
            throw new BusinessException(ReturnCode.E402000, "名称不能为空");
        }
    }

    /**
     * Validate is xsky account accessible.
     *
     * @param record
     */
    private void validateXskyAccount(FsXskyAccount record) {
        new FsClient(record).validate();
    }

    /**
     * 判断ossaccount是否为空
     *
     * @param accountId
     */
    public void validateAccount(String accountId) {
        if (null == accountId) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        FsXskyAccount record = accountMapper.selectByPrimaryKey(accountId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E402000, TARGET_NOT_EXISTS_MSG);
        }
        try {
            validateXskyAccount(record);
            record.setStatus(FsConstants.ACCOUNT_STATUS.VALID.name());
        }catch (Exception e){
            record.setStatus(FsConstants.ACCOUNT_STATUS.INVALID.name());
            throw new BusinessException(ReturnCode.E600000, e.getMessage());
        }finally {
            accountMapper.updateByPrimaryKey(record);
        }
    }


    /**
     * 删除对接XSKY的账号信息
     *
     * @param accountId
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED,
            rollbackFor = {RuntimeException.class, Exception.class}, noRollbackFor = {BusinessException.class})
    public void deleteAccount(String accountId) {
        FsXskyAccount record = accountMapper.selectByPrimaryKey(accountId);
        if (null == record) {
            throw new BusinessException(ReturnCode.E500001, TARGET_NOT_EXISTS_MSG);
        }

        try {
            fsClientService.deleteLocalData(accountId);
            fsClientGroupService.deleteLocalData(accountId);
            fsUserService.deleteLocalData(accountId);
            fsUserGroupService.deleteLocalData(accountId);
            fsGatewayService.deleteLocalData(accountId);
            fsGatewayGroupService.deleteLocalData(accountId);
            //fsFolderService.deleteLocalData(accountId);
            fsPoolService.deleteLocalData(accountId);

            fsFtpShareService.deleteLocalData(accountId);
            fsFtpShareAclService.deleteLocalData(accountId);
            fsSmbShareService.deleteLocalData(accountId);
            fsSmbShareAclService.deleteLocalData(accountId);
            fsNfsShareService.deleteLocalData(accountId);
            fsNfsShareAclService.deleteLocalData(accountId);

            accountMapper.deleteByPrimaryKey(accountId);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 获取所有的组织信息
     * @return
     */
    public List<Organization> getOrgModels(){
        OrganizationExample example = new OrganizationExample();
        List<Organization> organizations = organizationMapper.selectByExample(example);
        return organizations;
    }

    public List<FsXskyAccount> getAllAccounts(){
        FsXskyAccountExample example = new FsXskyAccountExample();
        FsXskyAccountExample.Criteria criteria = example.createCriteria();
        List<FsXskyAccount> accounts = accountMapper.selectByExample(example);
        return accounts;
    }

    public List<FsXskyAccount> getAllValidAccounts(){
        FsXskyAccountExample example = new FsXskyAccountExample();
        FsXskyAccountExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("VALID");
        List<FsXskyAccount> accounts = accountMapper.selectByExample(example);
        return accounts;
    }

    /**
     * 获取所有的工作空间账号信息
     * @return
     */
    public List<Workspace> getAllWorkspace(){
        WorkspaceExample example = new WorkspaceExample();
        List<Workspace> workspaces = workspaceMapper.selectByExample(example);
        return workspaces;
    }

    /**
     * 根据组织获取所有的工作空间账号信息
     * @return
     */
    public List<Workspace> getAllWorkSpaceByOrgId(String orgId){
        WorkspaceExample example = new WorkspaceExample();
        WorkspaceExample.Criteria criteria = example.createCriteria();
        criteria.andOrganizationIdEqualTo(orgId);
        List<Workspace> workspaces = workspaceMapper.selectByExample(example);
        return workspaces;
    }


    public void syncResources(String accountId) {
        FsXskyAccount account =  accountMapper.selectByPrimaryKey(accountId);
        if (null == account) {
            throw new BusinessException(ReturnCode.E400000, INVALID_REQUEST_PARAM_MSG);
        }
        if (FsConstants.ACCOUNT_STATUS.VALID.equals(account.getStatus())) {
            account.setSyncStatus(FsConstants.ACCOUNT_SYNC_STATUS.SYNCING.name());
            accountMapper.updateByPrimaryKeySelective(account);
            //final CountDownLatch countDownLatch = new CountDownLatch(2);


            try {
                FsClient client = new FsClient(account);
                FsShareClient shareClient = new FsShareClient(account);
                //commonThreadPool.addTask(() -> {
                    fsUserGroupService.syncFsUserGroup(account,client);
                    fsUserService.syncFsUser(account,client);
                    //目前去掉文件系统
//                    fsFolderService.syncFsFolder(account, client);
                    //同步虚拟ip
                    fsXskyVipService.syncDfsVipsApi(account,client);
                    fsGatewayService.syncDfsGatewayNetworkAddresses(account,client);
                    fsGatewayGroupService.syncDfsGatewayGroupsApi(account,client);
//                    fsGatewayService.syncFsGateway(account, client);
//                    fsGatewayGroupService.syncGatewayGroup(account, client);
                   // fsClientGroupService.syncFsClientGroup(account, client);
                   // fsClientService.syncFsClient(account, client);
                    fsPoolService.syncFsPool(account, client);
                    //countDownLatch.countDown();
                //});

//                commonThreadPool.addTask(() -> {
                    fsFtpShareAclService.syncFsFtpShareAcl(account, shareClient, null);
                    fsFtpShareService.syncFtpShare(account, shareClient);

                    fsNfsShareAclService.syncFsNfsShareAcl(account, shareClient, null);
                    fsNfsShareService.syncNfsShare(account, shareClient);
                    fsSmbShareService.syncSmbShare(account, shareClient);
                    fsSmbShareAclService.syncFsSmbShareAcl(account,shareClient, null);

//                    countDownLatch.countDown();
//                });

                //countDownLatch.await();
                account.setSyncStatus(FsConstants.ACCOUNT_SYNC_STATUS.SUCCESS.name());
            } catch (Exception e) {
                account.setSyncStatus(FsConstants.ACCOUNT_SYNC_STATUS.FAILED.name());
                throw new BusinessException(ReturnCode.E400000, e.getMessage());
            } finally {
                account.setSyncdAt(System.currentTimeMillis());
                accountMapper.updateByPrimaryKeySelective(account);
            }
        }
    }
}
