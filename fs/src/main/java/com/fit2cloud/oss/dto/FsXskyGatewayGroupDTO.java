package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsXskyGatewayGroup;
import lombok.Data;

import java.util.List;

@Data
public class FsXskyGatewayGroupDTO extends FsXskyGatewayGroup {
    private String sort;

    private List<String> gatewayHosts;

    private List<String> gatewayNetworks;

    private List<String> gatewayStatus;

    private List<String> gatewayVipAndVipMasks;

    private String SMBEnabled = "NO";
    private String NFSEnabled = "NO";
    private String FTPEnabled = "NO";
}