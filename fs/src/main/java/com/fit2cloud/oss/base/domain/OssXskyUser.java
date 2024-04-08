package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OssXskyUser implements Serializable {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("对象存储用户ID")
    private Long userId;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("用户状态")
    private String status;

    @ApiModelProperty("是否停用")
    private Boolean suspended;

    @ApiModelProperty("用户权限")
    private String opMask;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("组织id")
    private String costcenterId;

    @ApiModelProperty("工作空间id")
    private String groupId;

    @ApiModelProperty("所属账号")
    private Integer accountId;

    @ApiModelProperty("创建时间")
    private Long createdAt;

    @ApiModelProperty("同步时间")
    private Long syncedAt;

    @ApiModelProperty("是否由XSKY同步的用户(1:是,0:否)")
    private Long isSync;

    @ApiModelProperty("用户凭证")
    private Integer bucketNum;

    @ApiModelProperty("用户凭证")
    private String credential;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss_xsky_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.id
     *
     * @return the value of oss_xsky_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.id
     *
     * @param id the value for oss_xsky_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.user_id
     *
     * @return the value of oss_xsky_user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.user_id
     *
     * @param userId the value for oss_xsky_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.name
     *
     * @return the value of oss_xsky_user.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.name
     *
     * @param name the value for oss_xsky_user.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.email
     *
     * @return the value of oss_xsky_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.email
     *
     * @param email the value for oss_xsky_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.status
     *
     * @return the value of oss_xsky_user.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.status
     *
     * @param status the value for oss_xsky_user.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.suspended
     *
     * @return the value of oss_xsky_user.suspended
     *
     * @mbg.generated
     */
    public Boolean getSuspended() {
        return suspended;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.suspended
     *
     * @param suspended the value for oss_xsky_user.suspended
     *
     * @mbg.generated
     */
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.op_mask
     *
     * @return the value of oss_xsky_user.op_mask
     *
     * @mbg.generated
     */
    public String getOpMask() {
        return opMask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.op_mask
     *
     * @param opMask the value for oss_xsky_user.op_mask
     *
     * @mbg.generated
     */
    public void setOpMask(String opMask) {
        this.opMask = opMask == null ? null : opMask.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.created_by
     *
     * @return the value of oss_xsky_user.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.created_by
     *
     * @param createdBy the value for oss_xsky_user.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.costcenter_id
     *
     * @return the value of oss_xsky_user.costcenter_id
     *
     * @mbg.generated
     */
    public String getCostcenterId() {
        return costcenterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.costcenter_id
     *
     * @param costcenterId the value for oss_xsky_user.costcenter_id
     *
     * @mbg.generated
     */
    public void setCostcenterId(String costcenterId) {
        this.costcenterId = costcenterId == null ? null : costcenterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.group_id
     *
     * @return the value of oss_xsky_user.group_id
     *
     * @mbg.generated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.group_id
     *
     * @param groupId the value for oss_xsky_user.group_id
     *
     * @mbg.generated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.account_id
     *
     * @return the value of oss_xsky_user.account_id
     *
     * @mbg.generated
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.account_id
     *
     * @param accountId the value for oss_xsky_user.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.created_at
     *
     * @return the value of oss_xsky_user.created_at
     *
     * @mbg.generated
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.created_at
     *
     * @param createdAt the value for oss_xsky_user.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.synced_at
     *
     * @return the value of oss_xsky_user.synced_at
     *
     * @mbg.generated
     */
    public Long getSyncedAt() {
        return syncedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.synced_at
     *
     * @param syncedAt the value for oss_xsky_user.synced_at
     *
     * @mbg.generated
     */
    public void setSyncedAt(Long syncedAt) {
        this.syncedAt = syncedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.is_sync
     *
     * @return the value of oss_xsky_user.is_sync
     *
     * @mbg.generated
     */
    public Long getIsSync() {
        return isSync;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.is_sync
     *
     * @param isSync the value for oss_xsky_user.is_sync
     *
     * @mbg.generated
     */
    public void setIsSync(Long isSync) {
        this.isSync = isSync;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.bucket_num
     *
     * @return the value of oss_xsky_user.bucket_num
     *
     * @mbg.generated
     */
    public Integer getBucketNum() {
        return bucketNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.bucket_num
     *
     * @param bucketNum the value for oss_xsky_user.bucket_num
     *
     * @mbg.generated
     */
    public void setBucketNum(Integer bucketNum) {
        this.bucketNum = bucketNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_user.credential
     *
     * @return the value of oss_xsky_user.credential
     *
     * @mbg.generated
     */
    public String getCredential() {
        return credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_user.credential
     *
     * @param credential the value for oss_xsky_user.credential
     *
     * @mbg.generated
     */
    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }
}