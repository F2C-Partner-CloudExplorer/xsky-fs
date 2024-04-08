package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OrderItem implements Serializable {
    @ApiModelProperty("")
    private String id;

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("资源类型")
    private String resourceType;

    @ApiModelProperty("数量")
    private Integer count;

    @ApiModelProperty("订单内容")
    private String details;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fs_order_item
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_order_item.id
     *
     * @return the value of fs_order_item.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_order_item.id
     *
     * @param id the value for fs_order_item.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_order_item.order_id
     *
     * @return the value of fs_order_item.order_id
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_order_item.order_id
     *
     * @param orderId the value for fs_order_item.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_order_item.status
     *
     * @return the value of fs_order_item.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_order_item.status
     *
     * @param status the value for fs_order_item.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_order_item.resource_type
     *
     * @return the value of fs_order_item.resource_type
     *
     * @mbg.generated
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_order_item.resource_type
     *
     * @param resourceType the value for fs_order_item.resource_type
     *
     * @mbg.generated
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_order_item.count
     *
     * @return the value of fs_order_item.count
     *
     * @mbg.generated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_order_item.count
     *
     * @param count the value for fs_order_item.count
     *
     * @mbg.generated
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_order_item.details
     *
     * @return the value of fs_order_item.details
     *
     * @mbg.generated
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_order_item.details
     *
     * @param details the value for fs_order_item.details
     *
     * @mbg.generated
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}