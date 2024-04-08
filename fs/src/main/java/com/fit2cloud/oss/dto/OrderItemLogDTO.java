package com.fit2cloud.oss.dto;


import com.fit2cloud.oss.base.domain.OrderItem;
import com.fit2cloud.oss.base.domain.OrderItemLog;

import java.util.List;

public class OrderItemLogDTO {
    private OrderItem orderItem;
    private List<OrderItemLog> orderItemLogList;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public List<OrderItemLog> getOrderItemLogList() {
        return orderItemLogList;
    }

    public void setOrderItemLogList(List<OrderItemLog> orderItemLogList) {
        this.orderItemLogList = orderItemLogList;
    }
}
