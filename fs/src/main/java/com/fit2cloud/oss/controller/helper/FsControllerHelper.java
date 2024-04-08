package com.fit2cloud.oss.controller.helper;

import com.alibaba.fastjson.JSONArray;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FsXskyVipMapper;
import com.fit2cloud.oss.common.constants.GeneralConstants;
import com.fit2cloud.oss.dto.*;
import com.fit2cloud.oss.service.FsGatewayService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FsControllerHelper {
    @Resource
    private FsGatewayService fsGatewayService;

    @Resource
    private FsXskyVipMapper fsXskyVipMapper;

    public FsXskyFolderDTO convert2DTO(FsXskyFolder folder) {
        FsXskyFolderDTO dto = new FsXskyFolderDTO();
        BeanUtils.copyProperties(folder, dto);

        if (folder.getUsedKbyte() != null) {
            String num = String.format("%.2f", folder.getUsedKbyte() * 100 * 1024 / folder.getSize());
            dto.setUsedRate(num + "%");
            dto.setUsedRateInt(new Double(num).intValue());
        }

        dto.setSizeGB(folder.getSize() / 1024 / 1024 / 1024);
        dto.setOriginalSizeGB(dto.getSizeGB());
        dto.setOriginalSize(folder.getSize());
        return dto;
    }

    public FsXskyClientGroupDTO convert2DTO(FsXskyClientGroup clientGroup) {
        FsXskyClientGroupDTO dto = new FsXskyClientGroupDTO();
        BeanUtils.copyProperties(clientGroup, dto);
        dto.setClientIdList(JSONArray.parseArray(clientGroup.getClientIds()).toJavaList(Long.class));
        return dto;
    }

    public FsXskyClientDTO convert2DTO(FsXskyClient client) {
        FsXskyClientDTO dto = new FsXskyClientDTO();
        BeanUtils.copyProperties(client, dto);
        if (client.getClientGroupNum() > 0) {
            dto.setEditable(false);
        }
        return dto;
    }

    public FsXskyGatewayGroupDTO convert2DTO(FsXskyGatewayGroup gatewayGroup) {
        FsXskyGatewayGroupDTO dto = new FsXskyGatewayGroupDTO();
        BeanUtils.copyProperties(gatewayGroup, dto);

        List<FsXskyGateway> gatewayList = fsGatewayService.listGatewayByGroupId(gatewayGroup.getAccountId(),
                gatewayGroup.getGatewayGroupId());

        if (CollectionUtils.isNotEmpty(gatewayList)) {
            dto.setGatewayHosts(gatewayList.stream().map(h ->
                    h.getName() + " (" + h.getHostIp() + ')').collect(Collectors.toList()));
            dto.setGatewayNetworks(gatewayList.stream().map(FsXskyGateway::getNetworkIp).collect(Collectors.toList()));
            dto.setGatewayStatus(gatewayList.stream().map(FsXskyGateway::getStatus).collect(Collectors.toList()));
            //获取虚拟ip和掩码
            List<FsXskyVipDTO> fsXskyVipList = gatewayList.stream().map(item -> {
                Long gatewayId = item.getGatewayId();
                FsXskyVipExample fsXskyVipExample = new FsXskyVipExample();
                fsXskyVipExample.createCriteria().andAccountIdEqualTo(gatewayGroup.getAccountId())
                        .andGatewayIdEqualTo(gatewayId).andGatewayGroupIdEqualTo(gatewayGroup.getGatewayGroupId());
                List<FsXskyVip> fsXskyVips = fsXskyVipMapper.selectByExample(fsXskyVipExample);
                if (CollectionUtils.isNotEmpty(fsXskyVips)) {
                    if (fsXskyVips.size() > 1) {
                        String vipAndVipMask = "";
                        for (FsXskyVip fsXskyVip : fsXskyVips) {
                            vipAndVipMask += fsXskyVip.getVip() + "/" + fsXskyVip.getVipMask() + "；";
                        }
                        FsXskyVip xskyVip = fsXskyVips.get(0);
                        FsXskyVipDTO xskyVipDTO = new FsXskyVipDTO();
                        BeanUtils.copyProperties(xskyVip, xskyVipDTO);
                        xskyVipDTO.setVipAndVipMask(vipAndVipMask);
                        return xskyVipDTO;
                    } else {
                        FsXskyVip xskyVip = fsXskyVips.get(0);
                        FsXskyVipDTO xskyVipDTO = new FsXskyVipDTO();
                        BeanUtils.copyProperties(xskyVip, xskyVipDTO);
                        xskyVipDTO.setVipAndVipMask(xskyVipDTO.getVip() + "/" + xskyVipDTO.getVipMask());
                        return xskyVipDTO;
                    }
                }
                return null;
            }).collect(Collectors.toList());
            dto.setGatewayVipAndVipMasks(fsXskyVipList.stream().map(item -> {
                if (ObjectUtils.isNotEmpty(item)) {
                    return item.getVipAndVipMask();
                }
                return null;
            }).collect(Collectors.toList()));
        }

        List<String> types = JSONArray.parseArray(gatewayGroup.getTypes()).toJavaList(String.class);

        if (types.contains(GeneralConstants.PROTOCOL.nfs.name())) {
            dto.setNFSEnabled("YES");
        }

        if (types.contains(GeneralConstants.PROTOCOL.smb.name())) {
            dto.setSMBEnabled("YES");
        }

        if (types.contains(GeneralConstants.PROTOCOL.ftp.name())) {
            dto.setFTPEnabled("YES");
        }

        return dto;
    }

    public FsXskyGatewayDTO convert2DTO(FsXskyGateway gateway) {
        FsXskyGatewayDTO dto = new FsXskyGatewayDTO();
        BeanUtils.copyProperties(gateway, dto);
        return dto;
    }

    public FsXskyPoolDTO convert2DTO(FsXskyPool pool) {
        FsXskyPoolDTO dto = new FsXskyPoolDTO();
        BeanUtils.copyProperties(pool, dto);
        return dto;
    }

    public FsXskyUserDTO convert2DTO(FsXskyUser user) {
        FsXskyUserDTO dto = new FsXskyUserDTO();
        BeanUtils.copyProperties(user, dto);
        if (user.getFsUserGroupNum() > 0) {
            dto.setEditable(false);
        }
        return dto;
    }

    public FsXskyUserGroupDTO convert2DTO(FsXskyUserGroup userGroup) {
        FsXskyUserGroupDTO dto = new FsXskyUserGroupDTO();
        BeanUtils.copyProperties(userGroup, dto);
        dto.setUserIdList(JSONArray.parseArray(userGroup.getUserIds()).toJavaList(Long.class));
        return dto;
    }
}
