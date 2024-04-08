package com.fit2cloud.oss.dto;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author ：qun.yu@fit2cloud.com
 * @date ：2022/11/10 10:59 上午
 * @description：
 */
@Data
public class FsFtpPermissionDTO {

    private Boolean listEnabled=false;
    private Boolean createEnabled=false;
    private Boolean uploadEnabled=false;
    private Long uploadBandwidth=0L;
    private Boolean downloadEnabled=false;
    private Long downloadBandwidth=0L;
    private Boolean deleteEnabled=false;
    private Boolean renameEnabled=false;
}
