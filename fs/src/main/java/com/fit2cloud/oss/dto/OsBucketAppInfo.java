package com.fit2cloud.oss.dto;

import java.util.List;

public class OsBucketAppInfo {

    private String appName;//业务应用名称

    private String appOwner;//业务应用研发负责人

    private String appOperator;//业务应用运维负责人

    private List<OssBucketIpAssignName> ossBucketIpAssignNames;

    private List<OssBucketUserNameAssign> ossBucketUserNameAssigns;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppOwner() {
        return appOwner;
    }

    public void setAppOwner(String appOwner) {
        this.appOwner = appOwner;
    }

    public String getAppOperator() {
        return appOperator;
    }

    public void setAppOperator(String appOperator) {
        this.appOperator = appOperator;
    }

    public List<OssBucketIpAssignName> getOssBucketIpAssignNames() {
        return ossBucketIpAssignNames;
    }

    public void setOssBucketIpAssignNames(List<OssBucketIpAssignName> ossBucketIpAssignNames) {
        this.ossBucketIpAssignNames = ossBucketIpAssignNames;
    }

    public List<OssBucketUserNameAssign> getOssBucketUserNameAssigns() {
        return ossBucketUserNameAssigns;
    }

    public void setOssBucketUserNameAssigns(List<OssBucketUserNameAssign> ossBucketUserNameAssigns) {
        this.ossBucketUserNameAssigns = ossBucketUserNameAssigns;
    }
}
