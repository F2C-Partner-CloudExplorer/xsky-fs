package com.fit2cloud.oss.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FsPricePolicyDTO {
    private String name;
    private BigDecimal totalPrice;
}
