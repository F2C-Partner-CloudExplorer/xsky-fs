package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FsFtpShare implements Serializable {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("共享id")
    private Long shareId;

    @ApiModelProperty("文件系统id")
    private Long folderId;

    @ApiModelProperty("文件系统名")
    private String folderName;

    @ApiModelProperty("文件网关组id")
    private Long gatewayGroupId;

    @ApiModelProperty("文件网关组名")
    private String gatewayGroupName;

    @ApiModelProperty("所属客户端组数目")
    private Long aclNum;

    @ApiModelProperty("所属设备")
    private String accountId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("文件目录id")
    private Long pathId;

    @ApiModelProperty("文件目录地址")
    private String pathName;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("工作空间")
    private String workspace;

    @ApiModelProperty("组织")
    private String organization;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fs_xsky_ftp_share
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.id
     *
     * @return the value of fs_xsky_ftp_share.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.id
     *
     * @param id the value for fs_xsky_ftp_share.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.share_id
     *
     * @return the value of fs_xsky_ftp_share.share_id
     *
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.share_id
     *
     * @param shareId the value for fs_xsky_ftp_share.share_id
     *
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.folder_id
     *
     * @return the value of fs_xsky_ftp_share.folder_id
     *
     * @mbg.generated
     */
    public Long getFolderId() {
        return folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.folder_id
     *
     * @param folderId the value for fs_xsky_ftp_share.folder_id
     *
     * @mbg.generated
     */
    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.folder_name
     *
     * @return the value of fs_xsky_ftp_share.folder_name
     *
     * @mbg.generated
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.folder_name
     *
     * @param folderName the value for fs_xsky_ftp_share.folder_name
     *
     * @mbg.generated
     */
    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.gateway_group_id
     *
     * @return the value of fs_xsky_ftp_share.gateway_group_id
     *
     * @mbg.generated
     */
    public Long getGatewayGroupId() {
        return gatewayGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.gateway_group_id
     *
     * @param gatewayGroupId the value for fs_xsky_ftp_share.gateway_group_id
     *
     * @mbg.generated
     */
    public void setGatewayGroupId(Long gatewayGroupId) {
        this.gatewayGroupId = gatewayGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.gateway_group_name
     *
     * @return the value of fs_xsky_ftp_share.gateway_group_name
     *
     * @mbg.generated
     */
    public String getGatewayGroupName() {
        return gatewayGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.gateway_group_name
     *
     * @param gatewayGroupName the value for fs_xsky_ftp_share.gateway_group_name
     *
     * @mbg.generated
     */
    public void setGatewayGroupName(String gatewayGroupName) {
        this.gatewayGroupName = gatewayGroupName == null ? null : gatewayGroupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.acl_num
     *
     * @return the value of fs_xsky_ftp_share.acl_num
     *
     * @mbg.generated
     */
    public Long getAclNum() {
        return aclNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.acl_num
     *
     * @param aclNum the value for fs_xsky_ftp_share.acl_num
     *
     * @mbg.generated
     */
    public void setAclNum(Long aclNum) {
        this.aclNum = aclNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.account_id
     *
     * @return the value of fs_xsky_ftp_share.account_id
     *
     * @mbg.generated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.account_id
     *
     * @param accountId the value for fs_xsky_ftp_share.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.status
     *
     * @return the value of fs_xsky_ftp_share.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.status
     *
     * @param status the value for fs_xsky_ftp_share.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.create_time
     *
     * @return the value of fs_xsky_ftp_share.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.create_time
     *
     * @param createTime the value for fs_xsky_ftp_share.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.update_time
     *
     * @return the value of fs_xsky_ftp_share.update_time
     *
     * @mbg.generated
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.update_time
     *
     * @param updateTime the value for fs_xsky_ftp_share.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.path_id
     *
     * @return the value of fs_xsky_ftp_share.path_id
     *
     * @mbg.generated
     */
    public Long getPathId() {
        return pathId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.path_id
     *
     * @param pathId the value for fs_xsky_ftp_share.path_id
     *
     * @mbg.generated
     */
    public void setPathId(Long pathId) {
        this.pathId = pathId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.path_name
     *
     * @return the value of fs_xsky_ftp_share.path_name
     *
     * @mbg.generated
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.path_name
     *
     * @param pathName the value for fs_xsky_ftp_share.path_name
     *
     * @mbg.generated
     */
    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.name
     *
     * @return the value of fs_xsky_ftp_share.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.name
     *
     * @param name the value for fs_xsky_ftp_share.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.workspace
     *
     * @return the value of fs_xsky_ftp_share.workspace
     *
     * @mbg.generated
     */
    public String getWorkspace() {
        return workspace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.workspace
     *
     * @param workspace the value for fs_xsky_ftp_share.workspace
     *
     * @mbg.generated
     */
    public void setWorkspace(String workspace) {
        this.workspace = workspace == null ? null : workspace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_ftp_share.organization
     *
     * @return the value of fs_xsky_ftp_share.organization
     *
     * @mbg.generated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_ftp_share.organization
     *
     * @param organization the value for fs_xsky_ftp_share.organization
     *
     * @mbg.generated
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }
}