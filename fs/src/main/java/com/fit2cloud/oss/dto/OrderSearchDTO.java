package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.Order;
import lombok.Data;

@Data
public class OrderSearchDTO extends Order {
    private String account;
}
