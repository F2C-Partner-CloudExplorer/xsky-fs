package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FsXskyFolder implements Serializable {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("文件系统id")
    private Long folderId;

    @ApiModelProperty("访问成员数")
    private Long accessMemberNum;

    @ApiModelProperty("访问路径名")
    private String accessPathName;

    @ApiModelProperty("状态")
    private String actionStatus;

    @ApiModelProperty("配额树数目")
    private Long fsQuotaTreeNum;

    @ApiModelProperty("存储池")
    private String poolName;

    @ApiModelProperty("存储池id")
    private Long poolId;

    @ApiModelProperty("文件网关组")
    private String gatewayGroupName;

    @ApiModelProperty("文件网关组id")
    private Long gatewayGroupId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("是否共享")
    private Boolean shared;

    @ApiModelProperty("大小")
    private Long size;

    @ApiModelProperty("使用大小")
    private Double usedKbyte;

    @ApiModelProperty("总带宽")
    private Double totalBandwidthKbyte;

    @ApiModelProperty("总IOPS")
    private Double totalIops;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("已共享类型")
    private String shareTypes;

    @ApiModelProperty("所属设备")
    private String accountId;

    @ApiModelProperty("工作空间")
    private String workspace;

    @ApiModelProperty("组织")
    private String organization;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fs_xsky_folder
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.id
     *
     * @return the value of fs_xsky_folder.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.id
     *
     * @param id the value for fs_xsky_folder.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.name
     *
     * @return the value of fs_xsky_folder.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.name
     *
     * @param name the value for fs_xsky_folder.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.folder_id
     *
     * @return the value of fs_xsky_folder.folder_id
     *
     * @mbg.generated
     */
    public Long getFolderId() {
        return folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.folder_id
     *
     * @param folderId the value for fs_xsky_folder.folder_id
     *
     * @mbg.generated
     */
    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.access_member_num
     *
     * @return the value of fs_xsky_folder.access_member_num
     *
     * @mbg.generated
     */
    public Long getAccessMemberNum() {
        return accessMemberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.access_member_num
     *
     * @param accessMemberNum the value for fs_xsky_folder.access_member_num
     *
     * @mbg.generated
     */
    public void setAccessMemberNum(Long accessMemberNum) {
        this.accessMemberNum = accessMemberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.access_path_name
     *
     * @return the value of fs_xsky_folder.access_path_name
     *
     * @mbg.generated
     */
    public String getAccessPathName() {
        return accessPathName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.access_path_name
     *
     * @param accessPathName the value for fs_xsky_folder.access_path_name
     *
     * @mbg.generated
     */
    public void setAccessPathName(String accessPathName) {
        this.accessPathName = accessPathName == null ? null : accessPathName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.action_status
     *
     * @return the value of fs_xsky_folder.action_status
     *
     * @mbg.generated
     */
    public String getActionStatus() {
        return actionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.action_status
     *
     * @param actionStatus the value for fs_xsky_folder.action_status
     *
     * @mbg.generated
     */
    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus == null ? null : actionStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.fs_quota_tree_num
     *
     * @return the value of fs_xsky_folder.fs_quota_tree_num
     *
     * @mbg.generated
     */
    public Long getFsQuotaTreeNum() {
        return fsQuotaTreeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.fs_quota_tree_num
     *
     * @param fsQuotaTreeNum the value for fs_xsky_folder.fs_quota_tree_num
     *
     * @mbg.generated
     */
    public void setFsQuotaTreeNum(Long fsQuotaTreeNum) {
        this.fsQuotaTreeNum = fsQuotaTreeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.pool_name
     *
     * @return the value of fs_xsky_folder.pool_name
     *
     * @mbg.generated
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.pool_name
     *
     * @param poolName the value for fs_xsky_folder.pool_name
     *
     * @mbg.generated
     */
    public void setPoolName(String poolName) {
        this.poolName = poolName == null ? null : poolName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.pool_id
     *
     * @return the value of fs_xsky_folder.pool_id
     *
     * @mbg.generated
     */
    public Long getPoolId() {
        return poolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.pool_id
     *
     * @param poolId the value for fs_xsky_folder.pool_id
     *
     * @mbg.generated
     */
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.gateway_group_name
     *
     * @return the value of fs_xsky_folder.gateway_group_name
     *
     * @mbg.generated
     */
    public String getGatewayGroupName() {
        return gatewayGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.gateway_group_name
     *
     * @param gatewayGroupName the value for fs_xsky_folder.gateway_group_name
     *
     * @mbg.generated
     */
    public void setGatewayGroupName(String gatewayGroupName) {
        this.gatewayGroupName = gatewayGroupName == null ? null : gatewayGroupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.gateway_group_id
     *
     * @return the value of fs_xsky_folder.gateway_group_id
     *
     * @mbg.generated
     */
    public Long getGatewayGroupId() {
        return gatewayGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.gateway_group_id
     *
     * @param gatewayGroupId the value for fs_xsky_folder.gateway_group_id
     *
     * @mbg.generated
     */
    public void setGatewayGroupId(Long gatewayGroupId) {
        this.gatewayGroupId = gatewayGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.status
     *
     * @return the value of fs_xsky_folder.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.status
     *
     * @param status the value for fs_xsky_folder.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.shared
     *
     * @return the value of fs_xsky_folder.shared
     *
     * @mbg.generated
     */
    public Boolean getShared() {
        return shared;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.shared
     *
     * @param shared the value for fs_xsky_folder.shared
     *
     * @mbg.generated
     */
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.size
     *
     * @return the value of fs_xsky_folder.size
     *
     * @mbg.generated
     */
    public Long getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.size
     *
     * @param size the value for fs_xsky_folder.size
     *
     * @mbg.generated
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.used_kbyte
     *
     * @return the value of fs_xsky_folder.used_kbyte
     *
     * @mbg.generated
     */
    public Double getUsedKbyte() {
        return usedKbyte;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.used_kbyte
     *
     * @param usedKbyte the value for fs_xsky_folder.used_kbyte
     *
     * @mbg.generated
     */
    public void setUsedKbyte(Double usedKbyte) {
        this.usedKbyte = usedKbyte;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.total_bandwidth_kbyte
     *
     * @return the value of fs_xsky_folder.total_bandwidth_kbyte
     *
     * @mbg.generated
     */
    public Double getTotalBandwidthKbyte() {
        return totalBandwidthKbyte;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.total_bandwidth_kbyte
     *
     * @param totalBandwidthKbyte the value for fs_xsky_folder.total_bandwidth_kbyte
     *
     * @mbg.generated
     */
    public void setTotalBandwidthKbyte(Double totalBandwidthKbyte) {
        this.totalBandwidthKbyte = totalBandwidthKbyte;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.total_iops
     *
     * @return the value of fs_xsky_folder.total_iops
     *
     * @mbg.generated
     */
    public Double getTotalIops() {
        return totalIops;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.total_iops
     *
     * @param totalIops the value for fs_xsky_folder.total_iops
     *
     * @mbg.generated
     */
    public void setTotalIops(Double totalIops) {
        this.totalIops = totalIops;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.description
     *
     * @return the value of fs_xsky_folder.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.description
     *
     * @param description the value for fs_xsky_folder.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.share_types
     *
     * @return the value of fs_xsky_folder.share_types
     *
     * @mbg.generated
     */
    public String getShareTypes() {
        return shareTypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.share_types
     *
     * @param shareTypes the value for fs_xsky_folder.share_types
     *
     * @mbg.generated
     */
    public void setShareTypes(String shareTypes) {
        this.shareTypes = shareTypes == null ? null : shareTypes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.account_id
     *
     * @return the value of fs_xsky_folder.account_id
     *
     * @mbg.generated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.account_id
     *
     * @param accountId the value for fs_xsky_folder.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.workspace
     *
     * @return the value of fs_xsky_folder.workspace
     *
     * @mbg.generated
     */
    public String getWorkspace() {
        return workspace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.workspace
     *
     * @param workspace the value for fs_xsky_folder.workspace
     *
     * @mbg.generated
     */
    public void setWorkspace(String workspace) {
        this.workspace = workspace == null ? null : workspace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.organization
     *
     * @return the value of fs_xsky_folder.organization
     *
     * @mbg.generated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.organization
     *
     * @param organization the value for fs_xsky_folder.organization
     *
     * @mbg.generated
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.create_time
     *
     * @return the value of fs_xsky_folder.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.create_time
     *
     * @param createTime the value for fs_xsky_folder.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_xsky_folder.update_time
     *
     * @return the value of fs_xsky_folder.update_time
     *
     * @mbg.generated
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_xsky_folder.update_time
     *
     * @param updateTime the value for fs_xsky_folder.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}