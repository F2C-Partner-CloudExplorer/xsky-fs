package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OssXskyAccount implements Serializable {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("xsky endpoint")
    private String xskyEndpoint;

    @ApiModelProperty("xsky username")
    private String username;

    @ApiModelProperty("xsky password")
    private String password;

    @ApiModelProperty("租户数目")
    private Integer tenantNum;

    @ApiModelProperty("aws s3 endpoint")
    private String s3Endpoint;

    @ApiModelProperty("aws s3 region")
    private String s3Region;

    @ApiModelProperty("OSS账号状态")
    private String status;

    @ApiModelProperty("OSS资源同步状态")
    private String syncStatus;

    @ApiModelProperty("OSS账号备注")
    private String description;

    @ApiModelProperty("上次资源同步时间")
    private Long syncdAt;

    @ApiModelProperty("")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss_xsky_account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.id
     *
     * @return the value of oss_xsky_account.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.id
     *
     * @param id the value for oss_xsky_account.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.xsky_endpoint
     *
     * @return the value of oss_xsky_account.xsky_endpoint
     *
     * @mbg.generated
     */
    public String getXskyEndpoint() {
        return xskyEndpoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.xsky_endpoint
     *
     * @param xskyEndpoint the value for oss_xsky_account.xsky_endpoint
     *
     * @mbg.generated
     */
    public void setXskyEndpoint(String xskyEndpoint) {
        this.xskyEndpoint = xskyEndpoint == null ? null : xskyEndpoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.username
     *
     * @return the value of oss_xsky_account.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.username
     *
     * @param username the value for oss_xsky_account.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.password
     *
     * @return the value of oss_xsky_account.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.password
     *
     * @param password the value for oss_xsky_account.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.tenant_num
     *
     * @return the value of oss_xsky_account.tenant_num
     *
     * @mbg.generated
     */
    public Integer getTenantNum() {
        return tenantNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.tenant_num
     *
     * @param tenantNum the value for oss_xsky_account.tenant_num
     *
     * @mbg.generated
     */
    public void setTenantNum(Integer tenantNum) {
        this.tenantNum = tenantNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.s3_endpoint
     *
     * @return the value of oss_xsky_account.s3_endpoint
     *
     * @mbg.generated
     */
    public String getS3Endpoint() {
        return s3Endpoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.s3_endpoint
     *
     * @param s3Endpoint the value for oss_xsky_account.s3_endpoint
     *
     * @mbg.generated
     */
    public void setS3Endpoint(String s3Endpoint) {
        this.s3Endpoint = s3Endpoint == null ? null : s3Endpoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.s3_region
     *
     * @return the value of oss_xsky_account.s3_region
     *
     * @mbg.generated
     */
    public String getS3Region() {
        return s3Region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.s3_region
     *
     * @param s3Region the value for oss_xsky_account.s3_region
     *
     * @mbg.generated
     */
    public void setS3Region(String s3Region) {
        this.s3Region = s3Region == null ? null : s3Region.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.status
     *
     * @return the value of oss_xsky_account.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.status
     *
     * @param status the value for oss_xsky_account.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.sync_status
     *
     * @return the value of oss_xsky_account.sync_status
     *
     * @mbg.generated
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.sync_status
     *
     * @param syncStatus the value for oss_xsky_account.sync_status
     *
     * @mbg.generated
     */
    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.description
     *
     * @return the value of oss_xsky_account.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.description
     *
     * @param description the value for oss_xsky_account.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.syncd_at
     *
     * @return the value of oss_xsky_account.syncd_at
     *
     * @mbg.generated
     */
    public Long getSyncdAt() {
        return syncdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.syncd_at
     *
     * @param syncdAt the value for oss_xsky_account.syncd_at
     *
     * @mbg.generated
     */
    public void setSyncdAt(Long syncdAt) {
        this.syncdAt = syncdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss_xsky_account.type
     *
     * @return the value of oss_xsky_account.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss_xsky_account.type
     *
     * @param type the value for oss_xsky_account.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}