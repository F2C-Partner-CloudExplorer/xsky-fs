package com.fit2cloud.oss.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.utils.EncryptUtils;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.dto.*;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import xio.sds.client.ApiClient;
import xio.sds.client.ApiException;
import xio.sds.client.Configuration;
import xio.sds.client.api.*;
import xio.sds.client.auth.ApiKeyAuth;
import xio.sds.client.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author upeoe
 * @create 2019/11/12
 * Object storage request client.
 */
public class FsClient {

    private static String xskyEndpoint;
    private static String xskyUsername;
    private static String xskyPassword;
    private static String xskyToken;
    private static String s3Endpoint;
    private static String s3Region;
    private String currentToken;

    public String getCurrentToken() {
        return currentToken;
    }

    public FsClient(String xskyEndpoint, String username, String password, String s3Endpoint, String s3Region) {
        FsClient.xskyEndpoint = xskyEndpoint;
        xskyUsername = username;
        xskyPassword = password;
        FsClient.s3Endpoint = s3Endpoint;
        FsClient.s3Region = s3Region;

        validateInitParams();
        initializeXskyClient();
    }

    public FsClient(FsXskyAccount account) {
        if (null == account) {
            throw new BusinessException(ReturnCode.E400000, "Invalid XSky account.");
        }
        xskyEndpoint = account.getXskyEndpoint();
        xskyUsername = account.getUsername();
//        xskyPassword = EncryptUtils.base64Decoding(account.getPassword());
        xskyToken = EncryptUtils.base64Decoding(account.getToken());

        validateInitParams();
        String token = initializeXskyClient();
        currentToken = token;
    }

    private void validateInitParams() {
        if (StringUtils.isBlank(xskyEndpoint)) {
            throw new BusinessException(ReturnCode.E400000, "Xsky endpoint could not be empty.");
        }
        if (StringUtils.isBlank(xskyUsername)) {
            throw new BusinessException(ReturnCode.E400000, "Xsky username could not be empty.");
        }
//        if (StringUtils.isBlank(xskyPassword)) {
//            throw new BusinessException(ReturnCode.E400000, "Xsky password could not be empty.");
//        }
        if (StringUtils.isBlank(xskyToken)) {
            throw new BusinessException(ReturnCode.E400000, "Xsky token could not be empty.");
        }
    }

    private String initializeXskyClient() {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath(xskyEndpoint);
        String currentToken = xskyToken;

        // Set access token
//        AuthApi api = new AuthApi();
//        AuthLoginReq req = new AuthLoginReq();
//        AuthLoginReqAuth auth = new AuthLoginReqAuth();
//        auth.setName(xskyUsername);
//        auth.setPassword(xskyPassword);
//        req.setAuth(auth);
        try {
//            TokenResp resp = api.login(req);
//            String token = resp.getToken().getUuid();
//            if (null == token) {
//                throw new BusinessException(ReturnCode.E402000, "Username or password is invalid.");
//            }
            ApiKeyAuth tokenInHeader = (ApiKeyAuth) client.getAuthentication("tokenInHeader");
            tokenInHeader.setApiKey(currentToken);
        } catch (Exception e) {
            LogUtil.error(String.format("Initialize Xsky client failed, os client params: %s.", this.toString()), e);
            throw new BusinessException(ReturnCode.E500001, "Error when calling AuthApi#login.");
        }
        return currentToken;
    }

    public void validate() {
        VersionApi api = new VersionApi();
        try {
            String version = api.getVersion().getVersion();
            if (StringUtils.isBlank(version)) {
                throw new BusinessException(ReturnCode.E500001, "验证失败");
            }
        } catch (ApiException e) {
            LogUtil.error(String.format("Validate Xsky failed, os client params: %s.", this.toString()), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<Client> getFsClient(OsPage page) {
        ClientsApi api = new ClientsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            ClientsResp response = api.listClients(page.getLimit(), page.getOffset(), page.getQ(), page.getSort(), null);
            return response.getClients();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs clients failed, page params: %s, fs client params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<ClientGroup> getFsClientGroup(OsPage page) {
        ClientGroupsApi api = new ClientGroupsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            ClientGroupsResp response = api.listClientGroups(page.getLimit(), page.getOffset(), null, null, page.getQ(), page.getSort());
            return response.getClientGroups();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs client groups failed, page params: %s, fs client group params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }


    public List<DfsGatewayGroup> getGatewayGroup(OsPage page) {
        DfsGatewayGroupsApi api = new DfsGatewayGroupsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsGatewayGroupsResp response = api.listDfsGatewayGroups(page.getLimit(), page.getOffset(), null, null, page.getQ(), null, page.getSort());
            return response.getDfsGatewayGroups();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging gateway groups failed, page params: %s, gateway group params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsGatewayGroup> getDfsGatewayGroups(OsPage page) {
        DfsGatewayGroupsApi api = new DfsGatewayGroupsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsGatewayGroupsResp response = api.listDfsGatewayGroups(page.getLimit(), page.getOffset(), null, null, null, page.getQ(), page.getSort());
            return response.getDfsGatewayGroups();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging gateway groups failed, page params: %s, gateway group params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsGatewayRecord> getGateway(OsPage page) {
        DfsGatewaysApi api = new DfsGatewaysApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsGatewaysResp response = api.listDfsGateways(page.getLimit(), page.getOffset(), page.getQ(), page.getSort(), null, null);
            return response.getDfsGateways();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging os users failed, page params: %s, fs client params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsGatewayNetworkAddressRecord> GatewayNetworkAddresses(OsPage page) {
        DfsGatewayNetworkAddressesApi api = new DfsGatewayNetworkAddressesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsGatewayNetworkAddressesResp response = api.listDfsGatewayNetworkAddresses(page.getLimit(), page.getOffset(), page.getQ(), page.getSort(), null, null, null);
            return response.getDfsGatewayNetworkAddresses();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging os users failed, page params: %s, fs client params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsVIP> getDfsVIPs(OsPage page) {
        DfsVipsApi api = new DfsVipsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsVIPsResp response = api.listDfsVIPs(page.getLimit(), page.getOffset(), null, null, null, null);
            return response.getDfsVips();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging os users failed, page params: %s, fs client params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<FSUser> getFsUser(OsPage page) {
        FsUsersApi api = new FsUsersApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            FSUsersResp response = api.listFSUsers(page.getLimit(), page.getOffset(), page.getQ(),
                    page.getSort(), null, null, null, null, null, null, null, null, null, null);
            return response.getFsUsers();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs users failed, page params: %s, fs user params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public FSUser createFsUser(FsXskyUserDTO dto) {
        FsUsersApi api = new FsUsersApi();
        FSUserCreateReq createReq = new FSUserCreateReq();
        FSUserCreateReqUser createReqUser = new FSUserCreateReqUser();
        createReqUser.setName(dto.getName());
        createReqUser.setPassword(dto.getPassword());
        createReq.setFsUser(createReqUser);
        try {
            FSUserResp response = api.createFSUser(createReq, null, null);
            return response.getFsUser();
        } catch (ApiException e) {
            LogUtil.error(String.format("create fs user failed, fs user params: %s.", JSONObject.toJSONString(dto)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public FSUser updateFsUser(FsXskyUserDTO dto) {
        FsUsersApi api = new FsUsersApi();
        FSUserUpdateReq updateReq = new FSUserUpdateReq();
        FSUserUpdateReqUser updateReqUser = new FSUserUpdateReqUser();
        updateReqUser.setName(dto.getName());
        updateReqUser.setPassword(dto.getPassword());
        updateReq.setFsUser(updateReqUser);
        try {
            FSUserResp response = api.updateFSUser(updateReq, dto.getUserId(), null);
            return response.getFsUser();
        } catch (ApiException e) {
            LogUtil.error(String.format("create fs user failed, fs user params: %s.", JSONObject.toJSONString(dto)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public void deleteFsUser(Long id) {
        FsUsersApi api = new FsUsersApi();
        try {
            api.deleteFSUser(id);
        } catch (ApiException e) {
            LogUtil.error(String.format("delete fs user failed, fs user params: %s.", id), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<FSUserGroup> getFsUserGroup(OsPage page) {
        FsUserGroupsApi api = new FsUserGroupsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            FSUserGroupsResp response = api.listFSUserGroups(page.getLimit(), page.getOffset(), page.getQ(),
                    page.getSort(), null, null, null, null, null);
            return response.getFsUserGroups();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs user groups failed, page params: %s, fs user group params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public FSUserGroup createFsUserGroup(FsXskyUserGroupDTO dto) {
        FsUserGroupsApi api = new FsUserGroupsApi();
        FSUserGroupCreateReq createReq = new FSUserGroupCreateReq();
        FSUserGroupCreateReqUserGroup createReqUserGroup = new FSUserGroupCreateReqUserGroup();

        createReqUserGroup.setName(dto.getName());
        Optional.ofNullable(dto.getUserIds()).map(ids ->
                JSONArray.parseArray(ids).toJavaList(Long.class)).ifPresent(createReqUserGroup::setFsUserIds);

        createReq.setFsUserGroup(createReqUserGroup);
        try {
            FSUserGroupResp response = api.createFSUserGroup(createReq, null);
            return response.getFsUserGroup();
        } catch (ApiException e) {
            LogUtil.error(String.format("create fs user group failed, fs user group params: %s.", JSONObject.toJSONString(dto)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public FsXskyUpdateUserGroupDTO updateFsUserGroup(FsXskyUserGroupDTO dto) {
        FsUserGroupsApi api = new FsUserGroupsApi();

        try {
            FSUserGroupUpdateReq updateReq = new FSUserGroupUpdateReq();
            FSUserGroupUpdateReqUserGroup updateReqUserGroup = new FSUserGroupUpdateReqUserGroup();
            updateReqUserGroup.setName(dto.getName());
            updateReq.setFsUserGroup(updateReqUserGroup);
            FSUserGroupResp response = api.updateFSUserGroup(updateReq, dto.getUserGroupId());
            FSUserGroup userGroup = response.getFsUserGroup();
            List<Long> dtoUserIds =dto.getUserIdList();
            List<Long> userIds = new ArrayList<>();
            Optional.ofNullable(userGroup.getFsUsers()).map(group ->
                    group.stream().map(FSUserNestview::getId).collect(Collectors.toList())).ifPresent(userIds::addAll);
            FsXskyUpdateUserGroupDTO updateUserGroupDTO = new FsXskyUpdateUserGroupDTO();

            if (!CollectionUtils.isEqualCollection(userIds, dtoUserIds)) {
                List<Long> addIds = (List<Long>) CollectionUtils.subtract(dtoUserIds, userIds);
                List<Long> removeIds = (List<Long>) CollectionUtils.subtract(userIds, dtoUserIds);
                if (CollectionUtils.isNotEmpty(addIds)) {
                    userGroup = addFsUserGroupUser(dto.getUserGroupId(), addIds);
                    updateUserGroupDTO.setAddUserIds(addIds);
                }

                if (CollectionUtils.isNotEmpty(removeIds)) {
                    userGroup = removeFsUserGroupUser(dto.getUserGroupId(), removeIds);
                    updateUserGroupDTO.setRemoveUserIds(removeIds);
                }
            }

            updateUserGroupDTO.setFsUserGroup(userGroup);

            return updateUserGroupDTO;
        } catch (ApiException e) {
            LogUtil.error(String.format("create fs user failed, fs user group params: %s.", JSONObject.toJSONString(dto)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public void deleteFsUserGroup(Long id) {
        FsUserGroupsApi api = new FsUserGroupsApi();
        try {
            api.deleteFSUserGroup(id);
        } catch (ApiException e) {
            LogUtil.error(String.format("delete fs user group failed, fs user group params: %s.", JSONObject.toJSONString(id)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public FSUserGroup addFsUserGroupUser(Long userGroupId, List<Long> userIds) {
        FsUserGroupsApi api = new FsUserGroupsApi();
        FSUserGroupAddUsersReq addReq = new FSUserGroupAddUsersReq();
        FSUserGroupAddUsersReqUserGroup addUsersReqUserGroup = new FSUserGroupAddUsersReqUserGroup();
        addUsersReqUserGroup.setFsUserIds(userIds);
        addReq.setFsUserGroup(addUsersReqUserGroup);
        try {
            FSUserGroup userGroup = api.getFSUserGroup(userGroupId).getFsUserGroup();
            int count = 0;
            while (!StringUtils.equals("active", userGroup.getActionStatus())) {
                count++;
                if (count >= 30) {
                    break;
                }
                Thread.sleep(1 * 1000);
                userGroup = api.getFSUserGroup(userGroup.getId()).getFsUserGroup();
            }
            FSUserGroupResp response = api.addFSUsers(addReq, userGroupId);
            return response.getFsUserGroup();
        } catch (ApiException e) {
            LogUtil.error(String.format("add fs user group user failed, page params: %s, fs user group user params: %s.", JSONObject.toJSONString(userIds)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("remove fs user group client failed, fs user group params: %s.", JSONObject.toJSONString(userGroupId)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }

    public FSUserGroup removeFsUserGroupUser(Long userGroupId, List<Long> userIds) {
        FsUserGroupsApi api = new FsUserGroupsApi();
        FSUserGroupRemoveUsersReq removeReq = new FSUserGroupRemoveUsersReq();
        FSUserGroupRemoveUsersReqUserGroup removeUsersReqUserGroup = new FSUserGroupRemoveUsersReqUserGroup();
        removeUsersReqUserGroup.setFsUserIds(userIds);
        removeReq.setFsUserGroup(removeUsersReqUserGroup);
        try {
            FSUserGroup userGroup = api.getFSUserGroup(userGroupId).getFsUserGroup();
            int count = 0;
            while (!StringUtils.equals("active", userGroup.getActionStatus())) {
                count++;
                if (count >= 30) {
                    break;
                }
                Thread.sleep(1 * 1000);
                userGroup = api.getFSUserGroup(userGroup.getId()).getFsUserGroup();
            }
            FSUserGroupResp response = api.removeFSUsers(removeReq, userGroupId);
            return response.getFsUserGroup();
        } catch (ApiException e) {
            LogUtil.error(String.format("remove fs user group user failed, fs user group user params: %s.", JSONObject.toJSONString(userIds)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("remove fs user group user failed, fs client group params: %s.", JSONObject.toJSONString(userGroupId)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }


    public List<PoolRecord> getStoragePool(OsPage page) {
        PoolsApi api = new PoolsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            PoolsResp response = api.listPools(page.getLimit(), page.getOffset(),
                    null, null, null, null, null, null,
                    null, null, null, null, null, null,
                    null, null, null, null, page.getQ(), page.getSort(), null);
            return response.getPools();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs folders failed, page params: %s, fs folder params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }


    @Override
    public String toString() {
        return String.format("FsClient:" +
                        " XskyEndpoint: %s, XskyUsername: %s," +
                        " S3Endpoint: %s, S3Region: %s",
                xskyEndpoint, xskyUsername, s3Endpoint, s3Region);
    }

    public List<DfsRootfsRecord> DfsRootfsesInfo(OsPage page) {
        DfsRootfsesApi api = new DfsRootfsesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsRootfsesResp dfsRootfsesResp = api.listDfsRootfses(page.getLimit(), page.getOffset(), page.getQ(), page.getSort(),
                    null, null, null, null);
            return dfsRootfsesResp.getDfsRootfses();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs folders failed, page params: %s, fs folder params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DNSDomainName> getDnsDomainByAccountId(OsPage page) {
        DnsDomainNamesApi api = new DnsDomainNamesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DNSDomainNamesResp dnsDomainNamesResp = api.listDNSDomainNames(page.getLimit(), page.getOffset(), null, null);
            return dnsDomainNamesResp.getDnsDomainNames();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs folders failed, page params: %s, fs folder params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }
}
