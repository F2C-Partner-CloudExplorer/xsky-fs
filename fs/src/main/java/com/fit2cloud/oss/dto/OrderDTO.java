package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.Order;
import com.fit2cloud.oss.base.domain.OrderItem;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class OrderDTO extends Order {
    private List<String> workspaceIds;
    private List<OrderItem> orderItemList;
    private String modelId;
    private Integer bucketCount;

    @ApiModelProperty("申请时间 Start")
    private Long createTimeStart;
    @ApiModelProperty("申请时间 End")
    private Long createTimeEnd;

    public List<String> getWorkspaceIds() {
        return workspaceIds;
    }

    public void setWorkspaceIds(List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Integer getBucketCount() {
        return bucketCount;
    }

    public void setBucketCount(Integer bucketCount) {
        this.bucketCount = bucketCount;
    }

    public Long getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Long getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }
}