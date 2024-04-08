package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsFtpShareAcl;

public class FsFtpShareAclDTO extends FsFtpShareAcl {
    private String sort;
    private String permissionCN;
    private String typeCN;
    private String aclType = "ftp";

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getPermissionCN() {
        return permissionCN;
    }

    public void setPermissionCN(String permissionCN) {
        this.permissionCN = permissionCN;
    }

    public String getTypeCN() {
        return typeCN;
    }

    public void setTypeCN(String typeCN) {
        this.typeCN = typeCN;
    }

    public String getAclType() {
        return aclType;
    }

    public void setAclType(String aclType) {
        this.aclType = aclType;
    }
}