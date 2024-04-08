package com.fit2cloud.oss.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.common.constants.FsAclConstants;
import com.fit2cloud.oss.dto.*;
import com.fit2cloud.oss.exception.BusinessException;
import com.fit2cloud.oss.exception.ReturnCode;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import xio.sds.client.ApiException;
import xio.sds.client.api.*;
import xio.sds.client.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author upeoe
 * @create 2019/11/12
 * Object storage request client.
 */
public class FsShareClient {
    private FsClient client;

    public FsShareClient(FsXskyAccount account) {
        client = new FsClient(account);
    }


    public List<DfsNFSShareRecord> getDfsNfsShares(OsPage page) {
        DfsNfsSharesApi api = new DfsNfsSharesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsNFSSharesResp response = api.listDfsNFSShares(page.getLimit(), page.getOffset(), null, null, null, null, page.getQ(), page.getSort(), null);
            return response.getDfsNfsShares();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs nfs shares failed, page params: %s, fs nfs shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public void deleteFsNfsShare(Long shareId) {
        DfsNfsSharesApi api = new DfsNfsSharesApi();

        try {
            DfsNFSShareResp response = api.deleteDfsNFSShare(shareId, true, true);
        } catch (ApiException e) {
            LogUtil.error(String.format("delete fs nfs shares failed, params: %s, fs nfs shares params: %s.",
                    shareId, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsFTPShareRecord> getFsFTPShare(OsPage page) {
        DfsFtpSharesApi api = new DfsFtpSharesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsFTPSharesResp response = api.listDfsFTPShares(page.getLimit(), page.getOffset(), null, null, null, null, null, null);
            return response.getDfsFtpShares();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs ftp shares failed, page params: %s, fs ftp shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public void deleteFsFTPShare(Long shareId) {
        DfsFtpSharesApi api = new DfsFtpSharesApi();

        try {
            DfsFTPShareResp response = api.deleteDfsFTPShare(shareId, true, true);
        } catch (ApiException e) {
            LogUtil.error(String.format("delete fs nfs shares failed, params: %s, fs nfs shares params: %s.",
                    shareId, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsSMBShareRecord> getFsSMBShare(OsPage page) {
        DfsSmbSharesApi api = new DfsSmbSharesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsSMBSharesResp response = api.listDfsSMBShares(page.getLimit(), page.getOffset(), null, null, null, page.getQ(), null, page.getSort());
            return response.getDfsSmbShares();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs ftp shares failed, page params: %s, fs ftp shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsSMBShareRecord> getDfsSmbShares(OsPage page) {
        DfsSmbSharesApi api = new DfsSmbSharesApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsSMBSharesResp response = api.listDfsSMBShares(page.getLimit(), page.getOffset(), null, null, null, null, null, null);
            return response.getDfsSmbShares();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs ftp shares failed, page params: %s, fs ftp shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public void deleteFsSMBShare(Long shareId) {
        DfsSmbSharesApi api = new DfsSmbSharesApi();
        try {
            DfsSMBShareResp response = api.deleteDfsSMBShare(shareId, true, true);
        } catch (ApiException e) {
            LogUtil.error(String.format("Delete fs smb shares failed, page params: %s, fs smb shares params: %s.",
                    shareId, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsSMBShareACL> getFsSMBShareACL(OsPage page, Long shareId) {
        DfsSmbShareAclsApi api = new DfsSmbShareAclsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsSMBShareACLsResp response = api.listDfsSMBShareACLs(page.getLimit(), page.getOffset(), null, shareId, null, null);
            return response.getDfsSmbShareAcls();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs smb shares failed, page params: %s, fs smb shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public DfsSMBShare deleteFsSMBShareACL(Long shareId, List<Long> aclIds) {
        DfsSmbSharesApi api = new DfsSmbSharesApi();
        try {
            DfsSMBShareRemoveACLsReq removeACLsReq = new DfsSMBShareRemoveACLsReq();
            DfsSMBShareRemoveACLsReqShare reqShare = new DfsSMBShareRemoveACLsReqShare();
            reqShare.setDfsSmbShareAclIds(aclIds);
            removeACLsReq.setDfsSmbShare(reqShare);
            DfsSMBShareResp response = api.removeDfsSMBShareACLs(removeACLsReq, shareId);
            return response.getDfsSmbShare();
        } catch (ApiException e) {
            LogUtil.error(String.format("Delete fs smb shares failed, shareId params: %s, aclId params: %s.",
                    shareId, aclIds), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsFTPShareACL> getFsFTPShareACL(OsPage page, Long shareId) {
        DfsFtpShareAclsApi api = new DfsFtpShareAclsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsFTPShareACLsResp response = api.listDfsFTPShareACLs(page.getLimit(), page.getOffset(), null, shareId, null, null);
            return response.getDfsFtpShareAcls();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs smb shares failed, page params: %s, fs smb shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public DfsFTPShare deleteFsFTPShareACL(Long shareId, List<Long> aclIds) {
        DfsFtpSharesApi api = new DfsFtpSharesApi();
        try {
            DfsFTPShareRemoveACLsReq removeACLsReq = new DfsFTPShareRemoveACLsReq();
            DfsFTPShareRemoveACLsReqShare reqShare = new DfsFTPShareRemoveACLsReqShare();
            reqShare.setDfsFtpShareAclIds(aclIds);
            removeACLsReq.setDfsFtpShare(reqShare);
            DfsFTPShareResp response = api.removeDfsFTPShareACLs(removeACLsReq, shareId);
            return response.getDfsFtpShare();
        } catch (ApiException e) {
            LogUtil.error(String.format("Delete fs ftp shares failed, shareId params: %s, aclId params: %s.",
                    shareId, aclIds), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsNFSShareACL> getFsNFSShareACL(OsPage page, Long shareId) {
        DfsNfsShareAclsApi api = new DfsNfsShareAclsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsNFSShareACLsResp response = api.listDfsNFSShareACLs(page.getLimit(), page.getOffset(), null, null, null, shareId);
            return response.getDfsNfsShareAcls();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs nfs shares failed, page params: %s, fs ftp shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public List<DfsNFSShareACL> getDfsNfsShareAcls(OsPage page, Long shareId) {
        DfsNfsShareAclsApi api = new DfsNfsShareAclsApi();
        if (null == page) {
            page = new OsPage();
            page.setLimit(OsPage.NO_LIMIT);
            page.setOffset(OsPage.NO_OFFSET);
        }
        try {
            DfsNFSShareACLsResp response = api.listDfsNFSShareACLs(page.getLimit(), page.getOffset(), null, null, null, shareId);
            return response.getDfsNfsShareAcls();
        } catch (ApiException e) {
            LogUtil.error(String.format("Paging fs nfs shares failed, page params: %s, fs ftp shares params: %s.",
                    page, ""), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public DfsNFSShare deleteFsNFSShareACL(Long shareId, List<Long> aclId) {
        DfsNfsSharesApi api = new DfsNfsSharesApi();
        try {
            DfsNFSShareRemoveACLsReq removeACLsReq = new DfsNFSShareRemoveACLsReq();
            DfsNFSShareRemoveACLsReqShare reqShare = new DfsNFSShareRemoveACLsReqShare();
            reqShare.setDfsNfsShareAclIds(aclId);
            removeACLsReq.setDfsNfsShare(reqShare);
            DfsNFSShareResp response = api.removeDfsNFSShareACLs(removeACLsReq, shareId);
            return response.getDfsNfsShare();
        } catch (ApiException e) {
            LogUtil.error(String.format("Delete fs nfs shares failed, shareId params: %s, aclId params: %s.",
                    shareId, aclId), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        }
    }

    public DfsNFSShare createFsNFSShare(FsNfsShareDTO shareDTO) {
        DfsNfsSharesApi api = new DfsNfsSharesApi();
        DfsNFSShareCreateReq createReq = new DfsNFSShareCreateReq();
        DfsNFSShareCreateReqShare createReqShare = new DfsNFSShareCreateReqShare();
        createReq.setDfsNfsShare(createReqShare);

        createReqShare.setPath(shareDTO.getPathName());
        createReqShare.setDfsRootfsId(1L);
        createReqShare.setName(shareDTO.getName());
        List<DfsNFSShareACLReq> aclReqList = new ArrayList<>();
        DfsNFSShareACLReq aclReq = new DfsNFSShareACLReq();
        aclReq.setClients(shareDTO.getClients());
        aclReq.setPermission(shareDTO.getPermission());
        aclReq.setType(FsAclConstants.AclType.client.name());
        aclReqList.add(aclReq);
        createReqShare.setDfsNfsShareAcls(aclReqList);
//        createReqShare.setFsGatewayGroupId(shareDTO.getGatewayGroupId());

       /* for (Long id : shareDTO.getVisitIdList()) {
            DfsNFSShareACLReq aclReq = new DfsNFSShareACLReq();
            aclReq.setFsClientId(id);
            aclReq.setPermission(shareDTO.getPermission());
            aclReq.setType(FsAclConstants.AclType.client.name());
            aclReqList.add(aclReq);
        }

        for (Long groupId : shareDTO.getVisitGroupIdList()) {
            DfsNFSShareACLReq aclReq = new DfsNFSShareACLReq();
            aclReq.setFsClientGroupId(groupId);
            aclReq.setPermission(shareDTO.getPermission());
            aclReq.setType(FsAclConstants.AclType.client_group.name());
            aclReqList.add(aclReq);
        }*/

        try {
            DfsNFSShareResp resp = api.createDfsNFSShare(createReq, true);
            DfsNFSShare share = resp.getDfsNfsShare();
            int count = 0;
            while (!StringUtils.equals("active", share.getStatus())
                    || !StringUtils.equals("active", share.getActionStatus())) {
                count++;
                if (count >= 20) {
                    break;
                }
                Thread.sleep(5 * 1000);
                share = api.getDfsNFSShare(share.getId()).getDfsNfsShare();
            }
            return share;
        } catch (ApiException e) {
            LogUtil.error(String.format("create nfs shares failed: %s, fs ftp shares params: %s.",
                    "", JSONObject.toJSONString(shareDTO)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("create nfs shares failed, fs folder params: %s.", JSONObject.toJSONString(createReq)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }

    public DfsNFSShare updateFsNFSShare(FsNfsShareDTO shareDTO) {
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        DfsNfsSharesApi api = new DfsNfsSharesApi();
        Map<String, List<DfsNFSShareACL>> aclMap = getFsNFSShareACL(page, shareDTO.getShareId())
                .stream().collect(Collectors.groupingBy(DfsNFSShareACL::getType));
        List<Long> idList = new ArrayList<>();
        List<Long> idGroupList = new ArrayList<>();
        List<Long> removeAclIds = new ArrayList<>();

        if (aclMap.containsKey(FsAclConstants.AclType.client.name())) {
            idList = aclMap.get(FsAclConstants.AclType.client.name())
                    .stream().map(DfsNFSShareACL::getDfsNfsShare).map(DfsNFSShareNestview::getId).collect(Collectors.toList());
        }
       /* if (aclMap.containsKey(FsAclConstants.AclType.client_group.name())) {
            idGroupList = aclMap.get(FsAclConstants.AclType.client_group.name()).stream()
                    .map(DfsNFSShareACL::getFsClientGroup).map(FSClientGroupNestview::getId).collect(Collectors.toList());
        }*/

       /* List<Long> addIds = (List<Long>) CollectionUtils.subtract(shareDTO.getVisitIdList(), idList);
        List<Long> addGroupIds = (List<Long>) CollectionUtils.subtract(shareDTO.getVisitGroupIdList(), idGroupList);*/

       /* List<Long> removeIds = (List<Long>) CollectionUtils.subtract(idList, shareDTO.getVisitIdList());
        List<Long> removeGroupIds = (List<Long>) CollectionUtils.subtract(idGroupList, shareDTO.getVisitGroupIdList());*/

        DfsNFSShare share = null;
        try {
           /* if (CollectionUtils.isNotEmpty(removeIds)) {
                removeAclIds.addAll(aclMap.get(FsAclConstants.AclType.client.name())
                        .stream().filter(acl -> removeIds.contains(acl.getDfsNfsShare().getId()))
                        .map(DfsNFSShareACL::getId).collect(Collectors.toList()));
            }*/

           /* if (CollectionUtils.isNotEmpty(removeGroupIds)) {
                removeAclIds.addAll(aclMap.get(FsAclConstants.AclType.client_group.name())
                        .stream().filter(acl -> removeGroupIds.contains(acl.getFsClientGroup().getId()))
                        .map(DfsNFSShareACL::getId).collect(Collectors.toList()));
            }
*/
            /*if (CollectionUtils.isNotEmpty(removeAclIds)) {
                share = deleteFsNFSShareACL(shareDTO.getShareId(), removeAclIds);
                int count = 0;
                while (!StringUtils.equals("active", share.getStatus())
                        || !StringUtils.equals("active", share.getActionStatus())) {
                    count++;
                    if (count >= 20) {
                        break;
                    }
                    Thread.sleep(5 * 1000);
                    share = api.getDfsNFSShare(share.getId()).getDfsNfsShare();
                }
            }*/

            List<DfsNFSShareACLReq> aclReqList = new ArrayList<>();
            DfsNFSShareACLReq aclReq = new DfsNFSShareACLReq();
            aclReq.setPermission(shareDTO.getPermission());
            aclReq.setType(FsAclConstants.AclType.client.name());
            aclReqList.add(aclReq);
           /* for (Long id : addIds) {
                DfsNFSShareACLReq aclReq = new DfsNFSShareACLReq();
                aclReq.setFsClientId(id);
                aclReq.setPermission(shareDTO.getPermission());
                aclReq.setType(FsAclConstants.AclType.client.name());
                aclReqList.add(aclReq);
            }*/
           /* for (Long groupId : addGroupIds) {
                DfsNFSShareACLReq aclReq = new DfsNFSShareACLReq();
                aclReq.setFsClientGroupId(groupId);
                aclReq.setPermission(shareDTO.getPermission());
                aclReq.setType(FsAclConstants.AclType.client_group.name());
                aclReqList.add(aclReq);
            }*/

            if (CollectionUtils.isNotEmpty(aclReqList)) {
                DfsNFSShareAddACLsReq aAcLsReqShare = new DfsNFSShareAddACLsReq();
                DfsNFSShareAddACLsReqShare addACLsReqShare = new DfsNFSShareAddACLsReqShare();
                addACLsReqShare.setDfsNfsShareAcls(aclReqList);
                aAcLsReqShare.setDfsNfsShare(addACLsReqShare);
                DfsNFSShareResp resp = api.addDfsNFSShareACLs(aAcLsReqShare, shareDTO.getShareId());
                share = resp.getDfsNfsShare();
            }
            return share;
        } catch (ApiException e) {
            LogUtil.error(String.format("update nfs shares failed: %s, fs smb shares params: %s.",
                    "", JSONObject.toJSONString(shareDTO)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (Exception ex) {
            LogUtil.error(String.format("create ftp shares failed, fs folder params: %s.", JSONObject.toJSONString(shareDTO)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }

    public DfsSMBShare createFsSMBShare(FsSmbShareDTO shareDTO) {
        DfsSmbSharesApi api = new DfsSmbSharesApi();
        DfsSMBShareCreateReq createReq = new DfsSMBShareCreateReq();
        DfsSMBShareCreateReqShare createReqShare = new DfsSMBShareCreateReqShare();
        createReq.setDfsSmbShare(createReqShare);
        createReqShare.setName(shareDTO.getName());
        createReqShare.setPath(shareDTO.getPathName());

        createReqShare.setDfsRootfsId(1L);
//        createReqShare.setFsGatewayGroupId(shareDTO.getGatewayGroupId());
        List<DfsSMBShareACLReq> aclReqList = new ArrayList<>();
        createReqShare.setDfsSmbShareAcls(aclReqList);

        for (Long id : shareDTO.getVisitIdList()) {
            DfsSMBShareACLReq aclReq = new DfsSMBShareACLReq();
            aclReq.setFsUserId(id);
            aclReq.setPermission(shareDTO.getPermission());
            aclReq.setSecurity("local");
            aclReq.setType(FsAclConstants.AclType.user.name());
            aclReqList.add(aclReq);
        }

        for (Long groupId : shareDTO.getVisitGroupIdList()) {
            DfsSMBShareACLReq aclReq = new DfsSMBShareACLReq();
            aclReq.setFsUserGroupId(groupId);
            aclReq.setPermission(shareDTO.getPermission());
            aclReq.setSecurity("local");
            aclReq.setType(FsAclConstants.AclType.user_group.name());
            aclReqList.add(aclReq);
        }

        System.out.println(JSON.toJSONString(createReq));
        try {
            DfsSMBShareResp resp = api.createDfsSMBShare(createReq, true);
            DfsSMBShare share = resp.getDfsSmbShare();
            int count = 0;
            while (!StringUtils.equals("active", share.getStatus())
                    || !StringUtils.equals("active", share.getActionStatus())) {
                count++;
                if (count >= 20) {
                    break;
                }
                Thread.sleep(5 * 1000);
                share = api.getDfsSMBShare(share.getId()).getDfsSmbShare();
            }
            return resp.getDfsSmbShare();
        } catch (ApiException e) {
            LogUtil.error(String.format("create smb shares failed: %s, fs smb shares params: %s.",
                    "", JSONObject.toJSONString(shareDTO)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("create smb shares failed, fs folder params: %s.", JSONObject.toJSONString(createReq)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }

    public DfsSMBShare updateFsSMBShare(FsSmbShareDTO shareDTO) {
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        DfsSmbSharesApi api = new DfsSmbSharesApi();
        Map<String, List<DfsSMBShareACL>> aclMap = getFsSMBShareACL(page, shareDTO.getShareId())
                .stream().collect(Collectors.groupingBy(DfsSMBShareACL::getType));
        List<Long> idList = new ArrayList<>();
        List<Long> idGroupList = new ArrayList<>();
        List<Long> removeAclIds = new ArrayList<>();

        if (aclMap.containsKey(FsAclConstants.AclType.user.name())) {
            idList = aclMap.get(FsAclConstants.AclType.user.name())
                    .stream().map(DfsSMBShareACL::getFsUser).map(FSUserNestview::getId).collect(Collectors.toList());
        }
        if (aclMap.containsKey(FsAclConstants.AclType.user_group.name())) {
            idGroupList = aclMap.get(FsAclConstants.AclType.user_group.name())
                    .stream().map(DfsSMBShareACL::getFsUserGroup).map(FSUserGroupNestview::getId).collect(Collectors.toList());
        }
        List<Long> addIds = (List<Long>) CollectionUtils.subtract(shareDTO.getVisitIdList(), idList);
        List<Long> addGroupIds = (List<Long>) CollectionUtils.subtract(shareDTO.getVisitGroupIdList(), idGroupList);

        List<Long> removeIds = (List<Long>) CollectionUtils.subtract(idList, shareDTO.getVisitIdList());
        List<Long> removeGroupIds = (List<Long>) CollectionUtils.subtract(idGroupList, shareDTO.getVisitGroupIdList());

        DfsSMBShare share = null;
        try {

            if (CollectionUtils.isNotEmpty(removeIds)) {
                removeAclIds.addAll(aclMap.get(FsAclConstants.AclType.user.name())
                        .stream().filter(acl -> removeIds.contains(acl.getFsUser().getId()))
                        .map(DfsSMBShareACL::getId).collect(Collectors.toList()));
            }

            if (CollectionUtils.isNotEmpty(removeGroupIds)) {
                removeAclIds.addAll(aclMap.get(FsAclConstants.AclType.user_group.name())
                        .stream().filter(acl -> removeGroupIds.contains(acl.getFsUserGroup().getId()))
                        .map(DfsSMBShareACL::getId).collect(Collectors.toList()));
            }

            if (CollectionUtils.isNotEmpty(removeAclIds)) {
                share = deleteFsSMBShareACL(shareDTO.getShareId(), removeAclIds);
                int count = 0;
                while (!StringUtils.equals("active", share.getStatus())
                        || !StringUtils.equals("active", share.getActionStatus())) {
                    count++;
                    if (count >= 20) {
                        break;
                    }
                    Thread.sleep(5 * 1000);
                    share = api.getDfsSMBShare(share.getId()).getDfsSmbShare();
                }
            }

            List<DfsSMBShareACLReq> aclReqList = new ArrayList<>();
            for (Long id : addIds) {
                DfsSMBShareACLReq aclReq = new DfsSMBShareACLReq();
                aclReq.setFsUserId(id);
                aclReq.setPermission(shareDTO.getPermission());
                aclReq.setSecurity("local");
                aclReq.setType(FsAclConstants.AclType.user.name());
                aclReqList.add(aclReq);
            }

            for (Long groupId : addGroupIds) {
                DfsSMBShareACLReq aclReq = new DfsSMBShareACLReq();
                aclReq.setFsUserGroupId(groupId);
                aclReq.setPermission(shareDTO.getPermission());
                aclReq.setSecurity("local");
                aclReq.setType(FsAclConstants.AclType.user_group.name());
                aclReqList.add(aclReq);
            }

            if (CollectionUtils.isNotEmpty(aclReqList)) {
                DfsSMBShareAddACLsReq aAcLsReqShare = new DfsSMBShareAddACLsReq();
                DfsSMBShareAddACLsReqShare addACLsReqShare = new DfsSMBShareAddACLsReqShare();
                addACLsReqShare.setDfsSmbShareAcls(aclReqList);
                aAcLsReqShare.setDfsSmbShare(addACLsReqShare);
                DfsSMBShareResp resp = api.addDfsSMBShareACLs(aAcLsReqShare, shareDTO.getShareId());
                share = resp.getDfsSmbShare();
            }
            return share;
        } catch (ApiException e) {
            LogUtil.error(String.format("update smb shares failed: %s, fs ftp shares params: %s.",
                    "", JSONObject.toJSONString(shareDTO)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("create ftp shares failed, fs folder params: %s.", JSONObject.toJSONString(shareDTO)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }

    public DfsFTPShare createFsFTPShare(FsFtpShareDTO shareDTO) {
        DfsFtpSharesApi api = new DfsFtpSharesApi();
        DfsFTPShareCreateReq createReq = new DfsFTPShareCreateReq();
        DfsFTPShareCreateReqShare createReqShare = new DfsFTPShareCreateReqShare();
        createReq.setDfsFtpShare(createReqShare);
        createReqShare.setName(shareDTO.getName());

        createReqShare.setDfsRootfsId(1L);
        createReqShare.setPath(shareDTO.getPathName());
//        createReqShare.setFsGatewayGroupId(shareDTO.getGatewayGroupId());
        List<DfsFTPShareACLReq> aclReqList = new ArrayList<>();
        createReqShare.setDfsFtpShareAcls(aclReqList);

        for (Long id : shareDTO.getVisitIdList()) {
            FsFtpPermissionDTO permission = shareDTO.getPermission();
            DfsFTPShareACLReq aclReq = new DfsFTPShareACLReq();
            aclReq.setFsUserId(id);
            aclReq.setDownloadBandwidth(permission.getDownloadBandwidth() * 1024);
            aclReq.setDownloadEnabled(permission.getDownloadEnabled());
            aclReq.setListEnabled(permission.getListEnabled());
            aclReq.setUploadEnabled(permission.getUploadEnabled());
            aclReq.setCreateEnabled(permission.getCreateEnabled());
            aclReq.setDeleteEnabled(permission.getDeleteEnabled());
            aclReq.setUploadBandwidth(permission.getUploadBandwidth() * 1024);
            aclReq.setType(FsAclConstants.AclType.user.name());
            aclReqList.add(aclReq);
        }

//        for (Long groupId : shareDTO.getVisitGroupIdList()) {
//            DfsFTPShareACLReq aclReq = new DfsFTPShareACLReq();
//            aclReq.setFsUserGroupId(groupId);
//            aclReq.setDownloadBandwidth(0L);
//            aclReq.setDownloadEnabled(true);
//            aclReq.setListEnabled(true);
//            aclReq.setUploadEnabled(true);
//            aclReq.setCreateEnabled(true);
//            aclReq.setDeleteEnabled(true);
//            aclReq.setUploadBandwidth(0L);
//            aclReq.setType(FsAclConstants.AclType.user_group.name());
//            aclReqList.add(aclReq);
//        }

        try {
            LogUtil.info(JSON.toJSONString(createReq));
            DfsFTPShareResp resp = api.createDfsFTPShare(createReq, true);
            DfsFTPShare share = resp.getDfsFtpShare();
            int count = 0;
            while (!StringUtils.equals("active", share.getStatus())
                    || !StringUtils.equals("active", share.getActionStatus())) {
                count++;
                if (count >= 20) {
                    break;
                }
                Thread.sleep(5 * 1000);
                share = api.getDfsFTPShare(share.getId()).getDfsFtpShare();
            }
            return resp.getDfsFtpShare();
        } catch (ApiException e) {
            LogUtil.error(String.format("create ftp shares failed: %s, fs ftp shares params: %s.",
                    "", JSONObject.toJSONString(shareDTO)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("create ftp shares failed, fs folder params: %s.", JSONObject.toJSONString(createReq)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }

    public DfsFTPShare updateFsFTPShare(FsFtpShareDTO shareDTO) {
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        DfsFtpSharesApi api = new DfsFtpSharesApi();
        Map<String, List<DfsFTPShareACL>> aclMap = getFsFTPShareACL(page, shareDTO.getShareId())
                .stream().collect(Collectors.groupingBy(DfsFTPShareACL::getType));
        List<Long> idList = new ArrayList<>();
        List<Long> idGroupList = new ArrayList<>();
        List<Long> removeAclIds = new ArrayList<>();

        if (aclMap.containsKey(FsAclConstants.AclType.user.name())) {
            idList = aclMap.get(FsAclConstants.AclType.user.name())
                    .stream().map(DfsFTPShareACL::getFsUser).map(FSUserNestview::getId).collect(Collectors.toList());
        }
//        if (aclMap.containsKey(FsAclConstants.AclType.user_group.name())) {
//            idGroupList = aclMap.get(FsAclConstants.AclType.user_group.name())
//                    .stream().map(DfsFTPShareACL::getFsUserGroup).map(FSUserGroupNestview::getId).collect(Collectors.toList());
//        }
        List<Long> addIds = (List<Long>) CollectionUtils.subtract(shareDTO.getVisitIdList(), idList);
        List<Long> addGroupIds = (List<Long>) CollectionUtils.subtract(shareDTO.getVisitGroupIdList(), idGroupList);

        List<Long> removeIds = (List<Long>) CollectionUtils.subtract(idList, shareDTO.getVisitIdList());
        List<Long> removeGroupIds = (List<Long>) CollectionUtils.subtract(idGroupList, shareDTO.getVisitGroupIdList());

        DfsFTPShare share = null;
        try {

            if (CollectionUtils.isNotEmpty(removeIds)) {
                removeAclIds.addAll(aclMap.get(FsAclConstants.AclType.user.name())
                        .stream().filter(acl -> removeIds.contains(acl.getFsUser().getId()))
                        .map(DfsFTPShareACL::getId).collect(Collectors.toList()));
            }

//            if (CollectionUtils.isNotEmpty(removeGroupIds)) {
//                removeAclIds.addAll(aclMap.get(FsAclConstants.AclType.user_group.name())
//                        .stream().filter(acl -> removeGroupIds.contains(acl.getFsUserGroup().getId()))
//                        .map(DfsFTPShareACL::getId).collect(Collectors.toList()));
//            }

            if (CollectionUtils.isNotEmpty(removeAclIds)) {
                share = deleteFsFTPShareACL(shareDTO.getShareId(), removeAclIds);
                int count = 0;
                while (!StringUtils.equals("active", share.getStatus())
                        || !StringUtils.equals("active", share.getActionStatus())) {
                    count++;
                    if (count >= 20) {
                        break;
                    }
                    Thread.sleep(5 * 1000);
                    share = api.getDfsFTPShare(share.getId()).getDfsFtpShare();
                }
            }

            List<DfsFTPShareACLReq> aclReqList = new ArrayList<>();
            FsFtpPermissionDTO permission = shareDTO.getPermission();
            for (Long id : addIds) {
                DfsFTPShareACLReq aclReq = new DfsFTPShareACLReq();
                aclReq.setFsUserId(id);
                aclReq.setDownloadBandwidth(permission.getDownloadBandwidth());
                aclReq.setDownloadEnabled(permission.getDownloadEnabled());
                aclReq.setCreateEnabled(permission.getCreateEnabled());
                aclReq.setDeleteEnabled(permission.getDeleteEnabled());
                aclReq.setListEnabled(permission.getListEnabled());
                aclReq.setUploadEnabled(permission.getUploadEnabled());
                aclReq.setUploadBandwidth(permission.getUploadBandwidth());
                aclReq.setType(FsAclConstants.AclType.user.name());
                aclReqList.add(aclReq);
            }

            for (Long groupId : addGroupIds) {
                DfsFTPShareACLReq aclReq = new DfsFTPShareACLReq();
//                aclReq.setFsUserGroupId(groupId);
                aclReq.setDownloadBandwidth(permission.getDownloadBandwidth());
                aclReq.setDownloadEnabled(permission.getDownloadEnabled());
                aclReq.setListEnabled(permission.getListEnabled());
                aclReq.setUploadEnabled(permission.getUploadEnabled());
                aclReq.setCreateEnabled(permission.getCreateEnabled());
                aclReq.setDeleteEnabled(permission.getDeleteEnabled());
                aclReq.setUploadBandwidth(permission.getUploadBandwidth());
                aclReq.setType(FsAclConstants.AclType.user_group.name());
                aclReqList.add(aclReq);
            }

            if (CollectionUtils.isNotEmpty(aclReqList)) {
                DfsFTPShareAddACLsReq aAcLsReqShare = new DfsFTPShareAddACLsReq();
                DfsFTPShareAddACLsReqShare addACLsReqShare = new DfsFTPShareAddACLsReqShare();
                addACLsReqShare.setDfsFtpShareAcls(aclReqList);
                aAcLsReqShare.setDfsFtpShare(addACLsReqShare);
                DfsFTPShareResp resp = api.addDfsFTPShareACLs(aAcLsReqShare, shareDTO.getShareId());
                share = resp.getDfsFtpShare();
            }
            return share;
        } catch (ApiException e) {
            LogUtil.error(String.format("update smb shares failed: %s, fs ftp shares params: %s.",
                    "", JSONObject.toJSONString(shareDTO)), e);
            throw new BusinessException(ReturnCode.E500001, e.getMessage() + ", " + e.getResponseBody());
        } catch (InterruptedException ex) {
            LogUtil.error(String.format("create ftp shares failed, fs folder params: %s.", JSONObject.toJSONString(shareDTO)), ex);
            throw new BusinessException(ReturnCode.E500001, ex.getMessage());
        }
    }
}
