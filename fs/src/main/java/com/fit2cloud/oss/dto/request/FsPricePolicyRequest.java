package com.fit2cloud.oss.dto.request;

import lombok.Data;

@Data
public class FsPricePolicyRequest {
    private String name;
    private String accountId;
    private String platform;
    private String workspaceId;
    private Integer fileShare;
}
