package com.fit2cloud.oss.controller.helper;

import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FsXskyVipMapper;
import com.fit2cloud.oss.common.constants.FsAclConstants;
import com.fit2cloud.oss.dto.*;
import com.fit2cloud.oss.service.*;
import com.fit2cloud.oss.service.ext.ExtAccountService;
import com.fit2cloud.oss.utils.FsClient;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import xio.sds.client.model.DNSDomainName;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FsShareControllerHelper {

    @Resource
    private FsSmbShareAclService fsSmbShareAclService;
    @Resource
    private FsFtpShareAclService fsFtpShareAclService;
    @Resource
    private FsNfsShareAclService fsNfsShareAclService;
    @Resource
    FsGatewayGroupService fsGatewayGroupService;
    @Resource
    FsXskyVipMapper fsXskyVipMapper;
    @Resource
    private ExtAccountService extAccountService;

    public FsFtpShareAclDTO convert2DTO(FsFtpShareAcl shareAcl) {
        FsFtpShareAclDTO dto = new FsFtpShareAclDTO();
        BeanUtils.copyProperties(shareAcl, dto);
        StringBuilder cn = new StringBuilder();
        if (shareAcl.getListEnabled()) {
            cn.append("查看文件列表, ");
        }
        if (shareAcl.getCreateEnabled()) {
            cn.append("创建文件夹, ");
        }
        if (shareAcl.getDeleteEnabled()) {
            cn.append("删除文件, ");
        }
        if (shareAcl.getRenameEnabled()) {
            cn.append("重命名, ");
        }
        if (shareAcl.getUploadEnabled()) {
            cn.append("上传文件, ");
        }
        if (shareAcl.getDownloadEnabled()) {
            cn.append("下载文件, ");
        }
        String permissionCN = cn.toString();
        if (cn.length() > 0) {
            permissionCN = cn.substring(0, cn.length() - 2);
        }
        dto.setPermissionCN(permissionCN);
        Optional.ofNullable(FsAclConstants.AclType.getByName(shareAcl.getType()))
                .ifPresent(dto::setTypeCN);
        return dto;
    }

    public FsFtpShareDTO convert2DTO(FsFtpShare share) {
        FsFtpShareDTO dto = new FsFtpShareDTO();
        BeanUtils.copyProperties(share, dto);
        List<FsFtpShareAcl> fsFtpShareAcls = fsFtpShareAclService.listAclByShare(share.getAccountId(), share.getShareId());
        if (CollectionUtils.isEmpty(fsFtpShareAcls)) {
            return dto;
        }
        Map<String, List<FsFtpShareAcl>> aclMap = fsFtpShareAcls
                .stream().collect(Collectors.groupingBy(FsFtpShareAcl::getType));
        dto.setVisitIdList(new ArrayList<>());
        dto.setVisitGroupIdList(new ArrayList<>());
        if (aclMap.containsKey(FsAclConstants.AclType.user_group.name())) {
            dto.setVisitGroupIdList(aclMap.get(FsAclConstants.AclType.user_group.name())
                    .stream().map(FsFtpShareAcl::getUserGroupId).collect(Collectors.toList()));
        }
        if (aclMap.containsKey(FsAclConstants.AclType.user.name())) {
            dto.setVisitIdList(aclMap.get(FsAclConstants.AclType.user.name())
                    .stream().map(FsFtpShareAcl::getUserId).collect(Collectors.toList()));
        }

        String domain = getDnsDomainByAccountId(share.getAccountId());
        Optional.ofNullable(fsGatewayGroupService.getFsGatewayGroupByName(share.getAccountId(),
                        share.getGatewayGroupName(), share.getGatewayGroupId()))
                .map(item -> {
                    FsXskyVipExample fsXskyVipExample = new FsXskyVipExample();
                    fsXskyVipExample.createCriteria().andGatewayGroupIdEqualTo(item.getGatewayGroupId()).andAccountIdEqualTo(item.getAccountId());
                    List<FsXskyVip> fsXskyVipList = fsXskyVipMapper.selectByExample(fsXskyVipExample);
                    List<String> vipList = fsXskyVipList.stream().map(FsXskyVip::getVip).collect(Collectors.toList());
                    if (StringUtils.isNotEmpty(domain)) {
                        vipList.add(domain);
                    }
                    dto.setSharedAddress(vipList);
                    return item.getGatewayGroupId();
                }).ifPresent(dto::setGatewayGroupId);

        FsFtpPermissionDTO permissionDTO = new FsFtpPermissionDTO();
        BeanUtils.copyProperties(fsFtpShareAcls.get(0), permissionDTO);
        dto.setPermission(permissionDTO);
        return dto;
    }

    public FsNfsShareAclDTO convert2DTO(FsNfsShareAcl shareAcl) {
        FsNfsShareAclDTO dto = new FsNfsShareAclDTO();
        BeanUtils.copyProperties(shareAcl, dto);
        if (StringUtils.equals("RW", shareAcl.getPermission())) {
            dto.setPermissionCN("读写");
            dto.setReadableAndWritable(true);
        } else if (StringUtils.equals("RO", shareAcl.getPermission())) {
            dto.setPermissionCN("只读");
            dto.setReadable(true);
        } else if (StringUtils.equals("full_control", shareAcl.getPermission())) {
            dto.setPermissionCN("完全控制");
            dto.setReadable(true);
        } else {
            dto.setPermissionCN("");
        }
        Optional.ofNullable(FsAclConstants.AclType.getByName(shareAcl.getType()))
                .ifPresent(dto::setTypeCN);
        return dto;
    }

    public FsNfsShareDTO convert2DTO(FsNfsShare share) {
        FsNfsShareDTO dto = new FsNfsShareDTO();
        BeanUtils.copyProperties(share, dto);
        dto.setVisitIdList(new ArrayList<>());
        dto.setVisitGroupIdList(new ArrayList<>());

        List<FsNfsShareAcl> fsNfsShareAcls = fsNfsShareAclService.listAclByShare(share.getAccountId(), share.getShareId());
       if(CollectionUtils.isEmpty(fsNfsShareAcls)){
           return dto;
       }
        Map<String, List<FsNfsShareAcl>> aclMap = fsNfsShareAcls
                .stream().collect(Collectors.groupingBy(FsNfsShareAcl::getType));

        if (aclMap.containsKey(FsAclConstants.AclType.client_group.name())) {
            dto.setVisitGroupIdList(aclMap.get(FsAclConstants.AclType.client_group.name())
                    .stream().map(FsNfsShareAcl::getClientGroupId).collect(Collectors.toList()));
        }
        if (aclMap.containsKey(FsAclConstants.AclType.client.name())) {
            dto.setVisitIdList(aclMap.get(FsAclConstants.AclType.client.name())
                    .stream().map(FsNfsShareAcl::getClientId).collect(Collectors.toList()));
        }
        String domain = getDnsDomainByAccountId(share.getAccountId());
        Optional.ofNullable(fsGatewayGroupService.getFsGatewayGroupByName(share.getAccountId(),
                        share.getGatewayGroupName(), share.getGatewayGroupId()))
                .map(item -> {
                    FsXskyVipExample fsXskyVipExample = new FsXskyVipExample();
                    fsXskyVipExample.createCriteria().andGatewayGroupIdEqualTo(item.getGatewayGroupId()).andAccountIdEqualTo(item.getAccountId());
                    List<FsXskyVip> fsXskyVipList = fsXskyVipMapper.selectByExample(fsXskyVipExample);
                    List<String> vipList = fsXskyVipList.stream().map(FsXskyVip::getVip).collect(Collectors.toList());
                    if (StringUtils.isNotEmpty(domain)) {
                        vipList.add(domain);
                    }
                    dto.setSharedAddress(vipList);
                    return item.getGatewayGroupId();
                }).ifPresent(dto::setGatewayGroupId);
        dto.setPermission(fsNfsShareAcls.get(0).getPermission());
        return dto;
    }

    public FsSmbShareAclDTO convert2DTO(FsSmbShareAcl shareAcl) {
        FsSmbShareAclDTO dto = new FsSmbShareAclDTO();
        BeanUtils.copyProperties(shareAcl, dto);
        if (StringUtils.equals("RW", shareAcl.getPermission())) {
            dto.setPermissionCN("读写");
            dto.setReadableAndWritable(true);
        } else if (StringUtils.equals("RO", shareAcl.getPermission())) {
            dto.setPermissionCN("只读");
            dto.setReadable(true);
        } else if (StringUtils.equals("full_control", shareAcl.getPermission())) {
            dto.setPermissionCN("完全控制");
            dto.setReadable(true);
        } else {
            dto.setPermissionCN("");
        }
        Optional.ofNullable(FsAclConstants.AclType.getByName(shareAcl.getType()))
                .ifPresent(dto::setTypeCN);
        return dto;
    }

    public FsSmbShareDTO convert2DTO(FsSmbShare share) {
        FsSmbShareDTO dto = new FsSmbShareDTO();
        BeanUtils.copyProperties(share, dto);
        List<FsSmbShareAcl> fsSmbShareAcls = fsSmbShareAclService.listAclByShare(share.getAccountId(), share.getShareId());
        if(CollectionUtils.isEmpty(fsSmbShareAcls)){
            return dto;
        }
        Map<String, List<FsSmbShareAcl>> aclMap = fsSmbShareAcls
                .stream().collect(Collectors.groupingBy(FsSmbShareAcl::getType));
        dto.setVisitIdList(new ArrayList<>());
        dto.setVisitGroupIdList(new ArrayList<>());
        if (aclMap.containsKey(FsAclConstants.AclType.user_group.name())) {
            dto.setVisitGroupIdList(aclMap.get(FsAclConstants.AclType.user_group.name())
                    .stream().map(FsSmbShareAcl::getUserGroupId).collect(Collectors.toList()));
        }
        if (aclMap.containsKey(FsAclConstants.AclType.user.name())) {
            dto.setVisitIdList(aclMap.get(FsAclConstants.AclType.user.name())
                    .stream().map(FsSmbShareAcl::getUserId).collect(Collectors.toList()));
        }

        String domain = getDnsDomainByAccountId(share.getAccountId());
        Optional.ofNullable(fsGatewayGroupService.getFsGatewayGroupByName(share.getAccountId(),
                        share.getGatewayGroupName(), share.getGatewayGroupId()))
                .map(item -> {
                    FsXskyVipExample fsXskyVipExample = new FsXskyVipExample();
                    fsXskyVipExample.createCriteria().andGatewayGroupIdEqualTo(item.getGatewayGroupId()).andAccountIdEqualTo(item.getAccountId());
                    List<FsXskyVip> fsXskyVipList = fsXskyVipMapper.selectByExample(fsXskyVipExample);
                    List<String> vipList = fsXskyVipList.stream().map(FsXskyVip::getVip).collect(Collectors.toList());
                    if (StringUtils.isNotEmpty(domain)) {
                        vipList.add(domain);
                    }
                    dto.setSharedAddress(vipList);
                    return item.getGatewayGroupId();
                }).ifPresent(dto::setGatewayGroupId);

        dto.setPermission(fsSmbShareAcls.get(0).getPermission());
        return dto;
    }

    public String getDnsDomainByAccountId(String accountId) {
        FsClient client = new FsClient(extAccountService.getXskyAccount(accountId));
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DNSDomainName> dnsDomainNameList = client.getDnsDomainByAccountId(page);
        if (CollectionUtils.isNotEmpty(dnsDomainNameList)) {
            DNSDomainName dnsDomainName = dnsDomainNameList.get(0);
            String name = dnsDomainName.getName();
            String origin = dnsDomainName.getDnsZone().getOrigin();
            return name + "." + origin;
        }
        return null;
    }
}
