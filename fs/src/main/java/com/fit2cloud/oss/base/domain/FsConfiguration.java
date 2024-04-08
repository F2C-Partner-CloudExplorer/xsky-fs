package com.fit2cloud.oss.base.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FsConfiguration implements Serializable {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("工作空间ID")
    private String workspaceId;

    @ApiModelProperty("标识")
    private String key;

    @ApiModelProperty("上次更新人")
    private String lastUpdateBy;

    @ApiModelProperty("上次更新时间")
    private Long lastUpdateTime;

    @ApiModelProperty("值")
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fs_configuration
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_configuration.id
     *
     * @return the value of fs_configuration.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_configuration.id
     *
     * @param id the value for fs_configuration.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_configuration.workspace_id
     *
     * @return the value of fs_configuration.workspace_id
     *
     * @mbg.generated
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_configuration.workspace_id
     *
     * @param workspaceId the value for fs_configuration.workspace_id
     *
     * @mbg.generated
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId == null ? null : workspaceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_configuration._key
     *
     * @return the value of fs_configuration._key
     *
     * @mbg.generated
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_configuration._key
     *
     * @param key the value for fs_configuration._key
     *
     * @mbg.generated
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_configuration.last_update_by
     *
     * @return the value of fs_configuration.last_update_by
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_configuration.last_update_by
     *
     * @param lastUpdateBy the value for fs_configuration.last_update_by
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_configuration.last_update_time
     *
     * @return the value of fs_configuration.last_update_time
     *
     * @mbg.generated
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_configuration.last_update_time
     *
     * @param lastUpdateTime the value for fs_configuration.last_update_time
     *
     * @mbg.generated
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fs_configuration._value
     *
     * @return the value of fs_configuration._value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fs_configuration._value
     *
     * @param value the value for fs_configuration._value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}