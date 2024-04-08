package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsSmbShare;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class FsSmbShareDTO extends FsSmbShare {
    private String sort;
    private List<Long> visitIdList;
    private List<Long> visitGroupIdList;
    private String visitGroupNames;
    private String visitNames;
    private List<String> sharedAddress;
    private String permission;
}