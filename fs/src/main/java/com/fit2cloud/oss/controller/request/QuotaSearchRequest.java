package com.fit2cloud.oss.controller.request;

import io.swagger.annotations.ApiModelProperty;

public class QuotaSearchRequest {
    @ApiModelProperty("组织/工作空间 ID")
    private String workspaceId;
    @ApiModelProperty("默认配额")
    private String defaultQuota;
    @ApiModelProperty("超额申请")
    private String resourceIfExceed;
    @ApiModelProperty("是否超配")
    private String exceedQuota;

    public String getExceedQuota() {
        return exceedQuota;
    }

    public void setExceedQuota(String exceedQuota) {
        this.exceedQuota = exceedQuota;
    }



    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getDefaultQuota() {
        return defaultQuota;
    }

    public void setDefaultQuota(String defaultQuota) {
        this.defaultQuota = defaultQuota;
    }

    public String getResourceIfExceed() {
        return resourceIfExceed;
    }

    public void setResourceIfExceed(String resourceIfExceed) {
        this.resourceIfExceed = resourceIfExceed;
    }
}
