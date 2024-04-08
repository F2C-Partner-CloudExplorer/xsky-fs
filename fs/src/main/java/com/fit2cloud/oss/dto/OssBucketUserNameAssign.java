package com.fit2cloud.oss.dto;


import com.fit2cloud.oss.base.domain.OssXskyBucketUserAssign;

public class OssBucketUserNameAssign extends OssXskyBucketUserAssign {

    private String userName;//授权用户(包括拥有者和只读用户)

    private String assignUserName;//授权人

    public String getAssignUserName() {
        return assignUserName;
    }

    public void setAssignUserName(String assignUserName) {
        this.assignUserName = assignUserName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
