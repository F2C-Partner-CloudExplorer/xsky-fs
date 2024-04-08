package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.OrderItem;
import io.swagger.annotations.ApiModelProperty;

public class FsFolderRequest extends OrderItem {
    @ApiModelProperty(hidden = true)
    private String id;
    @ApiModelProperty(hidden = true)
    private String orderId;
    @ApiModelProperty("申请理由")
    private String description;
    @ApiModelProperty(hidden = true)
    private String status;
    @ApiModelProperty("详情")
    private FsXskyFolderDTO folder;

    public FsXskyFolderDTO getFolder() {
        return folder;
    }

    public void setFolder(FsXskyFolderDTO folder) {
        this.folder = folder;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
