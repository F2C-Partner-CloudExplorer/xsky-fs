package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FsXskyOrder implements Serializable {
    @ApiModelProperty("")
    private String id;

    @ApiModelProperty("工作空间ID")
    private String workspaceId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("申请人")
    private String applyUser;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("流程ID")
    private String processId;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("订单内容")
    private String content;

    @ApiModelProperty("组织id")
    private String organizationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.id
     *
     * @return the value of fs_xsky_order.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.id
     *
     * @param id the value for fs_xsky_order.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.workspace_id
     *
     * @return the value of fs_xsky_order.workspace_id
     *
     * @mbg.generated
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.workspace_id
     *
     * @param workspaceId the value for fs_xsky_order.workspace_id
     *
     * @mbg.generated
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId == null ? null : workspaceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.status
     *
     * @return the value of fs_xsky_order.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.status
     *
     * @param status the value for fs_xsky_order.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.apply_user
     *
     * @return the value of fs_xsky_order.apply_user
     *
     * @mbg.generated
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.apply_user
     *
     * @param applyUser the value for fs_xsky_order.apply_user
     *
     * @mbg.generated
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.create_time
     *
     * @return the value of fs_xsky_order.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.create_time
     *
     * @param createTime the value for fs_xsky_order.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.process_id
     *
     * @return the value of fs_xsky_order.process_id
     *
     * @mbg.generated
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.process_id
     *
     * @param processId the value for fs_xsky_order.process_id
     *
     * @mbg.generated
     */
    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.type
     *
     * @return the value of fs_xsky_order.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.type
     *
     * @param type the value for fs_xsky_order.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.content
     *
     * @return the value of fs_xsky_order.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.content
     *
     * @param content the value for fs_xsky_order.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_order.organization_id
     *
     * @return the value of fs_xsky_order.organization_id
     *
     * @mbg.generated
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_order.organization_id
     *
     * @param organizationId the value for fs_xsky_order.organization_id
     *
     * @mbg.generated
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }
}