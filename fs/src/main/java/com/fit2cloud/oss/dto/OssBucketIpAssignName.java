package com.fit2cloud.oss.dto;


import com.fit2cloud.oss.base.domain.OssXskyBucketIpAssign;

public class OssBucketIpAssignName extends OssXskyBucketIpAssign {

    private String assignUserName;//授权人

    public String getAssignUserName() {
        return assignUserName;
    }

    public void setAssignUserName(String assignUserName) {
        this.assignUserName = assignUserName;
    }
}
