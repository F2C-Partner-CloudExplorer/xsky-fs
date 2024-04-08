package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsXskyUserGroup;

import java.util.List;

public class FsXskyUserGroupDTO extends FsXskyUserGroup {
    private String sort;
    private boolean deletable = true;
    private boolean editable = true;
    private List<Long> userIdList;

    public boolean isDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    public List<Long> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<Long> userIdList) {
        this.userIdList = userIdList;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}