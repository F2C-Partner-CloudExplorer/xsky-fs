package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsSmbShareAcl;

public class FsSmbShareAclDTO extends FsSmbShareAcl {
    private String sort;
    private String permissionCN;
    private String typeCN;
    private Boolean readable = false;
    private Boolean readableAndWritable = false;
    private String aclType = "smb";

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

    public Boolean getReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public Boolean getReadableAndWritable() {
        return readableAndWritable;
    }

    public void setReadableAndWritable(Boolean readableAndWritable) {
        this.readableAndWritable = readableAndWritable;
    }

    public String getAclType() {
        return aclType;
    }

    public void setAclType(String aclType) {
        this.aclType = aclType;
    }
}