package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.Order;

public class OrderRequest {
    private Order order;
    private String taskId;
    private String remarks;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
