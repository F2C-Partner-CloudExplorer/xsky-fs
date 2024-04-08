package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.OssXskyAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author upeoe
 * @create 2018/10/25 11:16
 */
@ApiModel(parent = OssXskyAccount.class)
public class AccountDTO extends OssXskyAccount {

    @ApiModelProperty(value = "插件图标")
    private String icon;
    @ApiModelProperty(value = "插件描述")
    private String pluginDesc;
    @ApiModelProperty(value = "存储桶数量")
    private int bucketNum = 0;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPluginDesc() {
        return pluginDesc;
    }

    public void setPluginDesc(String pluginDesc) {
        this.pluginDesc = pluginDesc;
    }

    public int getBucketNum() {
        return bucketNum;
    }

    public void setBucketNum(int bucketNum) {
        this.bucketNum = bucketNum;
    }

}
