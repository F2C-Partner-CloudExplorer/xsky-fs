package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FsSmbShareAcl implements Serializable {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("Acl id")
    private Long aclId;

    @ApiModelProperty("名称")
    private String aclName;

    @ApiModelProperty("客户端id")
    private Long shareId;

    @ApiModelProperty("权限")
    private String permission;

    @ApiModelProperty("客户端id")
    private Long userId;

    @ApiModelProperty("客户端组id")
    private Long userGroupId;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("所属设备")
    private String accountId;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.id
     *
     * @return the value of fs_xsky_smb_share_acl.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.id
     *
     * @param id the value for fs_xsky_smb_share_acl.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.acl_id
     *
     * @return the value of fs_xsky_smb_share_acl.acl_id
     *
     * @mbg.generated
     */
    public Long getAclId() {
        return aclId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.acl_id
     *
     * @param aclId the value for fs_xsky_smb_share_acl.acl_id
     *
     * @mbg.generated
     */
    public void setAclId(Long aclId) {
        this.aclId = aclId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.acl_name
     *
     * @return the value of fs_xsky_smb_share_acl.acl_name
     *
     * @mbg.generated
     */
    public String getAclName() {
        return aclName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.acl_name
     *
     * @param aclName the value for fs_xsky_smb_share_acl.acl_name
     *
     * @mbg.generated
     */
    public void setAclName(String aclName) {
        this.aclName = aclName == null ? null : aclName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.share_id
     *
     * @return the value of fs_xsky_smb_share_acl.share_id
     *
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.share_id
     *
     * @param shareId the value for fs_xsky_smb_share_acl.share_id
     *
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.permission
     *
     * @return the value of fs_xsky_smb_share_acl.permission
     *
     * @mbg.generated
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.permission
     *
     * @param permission the value for fs_xsky_smb_share_acl.permission
     *
     * @mbg.generated
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.user_id
     *
     * @return the value of fs_xsky_smb_share_acl.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.user_id
     *
     * @param userId the value for fs_xsky_smb_share_acl.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.user_group_id
     *
     * @return the value of fs_xsky_smb_share_acl.user_group_id
     *
     * @mbg.generated
     */
    public Long getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.user_group_id
     *
     * @param userGroupId the value for fs_xsky_smb_share_acl.user_group_id
     *
     * @mbg.generated
     */
    public void setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.type
     *
     * @return the value of fs_xsky_smb_share_acl.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.type
     *
     * @param type the value for fs_xsky_smb_share_acl.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.account_id
     *
     * @return the value of fs_xsky_smb_share_acl.account_id
     *
     * @mbg.generated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.account_id
     *
     * @param accountId the value for fs_xsky_smb_share_acl.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.create_time
     *
     * @return the value of fs_xsky_smb_share_acl.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.create_time
     *
     * @param createTime the value for fs_xsky_smb_share_acl.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_smb_share_acl.update_time
     *
     * @return the value of fs_xsky_smb_share_acl.update_time
     *
     * @mbg.generated
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_smb_share_acl.update_time
     *
     * @param updateTime the value for fs_xsky_smb_share_acl.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}