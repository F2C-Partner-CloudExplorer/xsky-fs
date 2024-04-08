package com.fit2cloud.oss.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ResourcePriceDTO {
    private String id;
    private String resourceId;
    private BigDecimal price = BigDecimal.ZERO;
    private String workspaceId;
    private String organizationId;
    private String resourceName;
    private String resourceType;
    private Long share;
    private long resourceCreateTime;
    private String instanceType;
}
