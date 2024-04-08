package com.fit2cloud.oss.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author liuhao
 * @Classname SharedFileDTO
 * @Description TODO
 * @Date 2020/12/9 下午2:49
 */
@Data
public class SharedFileDTO {

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("共享路径")
    private String sharedPath;

    @ApiModelProperty("共享地址")
    private List<String> sharedAddress;

    @ApiModelProperty("网关")
    private String gatewayGroupName;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("文件类型")
    private String fileType;
    @ApiModelProperty("网关组id")
    private Long gatewayGroupId;
    private String accountId;
}
