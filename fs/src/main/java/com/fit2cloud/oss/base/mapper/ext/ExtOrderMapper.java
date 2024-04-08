package com.fit2cloud.oss.base.mapper.ext;


import com.fit2cloud.oss.dto.OrderDTO;
import org.apache.ibatis.annotations.Param;

public interface ExtOrderMapper {
//    OrderDTO getOrderExtendInfo(@Param("orderId") String orderId);

    OrderDTO getOrderDetail(@Param("orderId") String orderId);

    OrderDTO getOrderProcessInfo(@Param("orderId") String orderId);
}
