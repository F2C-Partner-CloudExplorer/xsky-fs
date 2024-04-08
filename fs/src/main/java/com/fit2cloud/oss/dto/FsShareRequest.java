package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.OrderItem;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FsShareRequest extends OrderItem {
    @ApiModelProperty(hidden = true)
    private String id;
    @ApiModelProperty(hidden = true)
    private String orderId;
    @ApiModelProperty("申请理由")
    private String description;
    @ApiModelProperty(hidden = true)
    private String status;
    @ApiModelProperty("详情")
    private String shareType;
    @ApiModelProperty("详情")
    private FsNfsShareDTO nfsShareDTO;
    @ApiModelProperty("详情")
    private FsFtpShareDTO ftpShareDTO;
    @ApiModelProperty("详情")
    private FsSmbShareDTO smbShareDTO;
}
