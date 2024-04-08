package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsXskyClientGroup;

import java.util.List;

public class FsXskyClientGroupDTO extends FsXskyClientGroup {
    private String sort;
    private List<Long> clientIdList;
    private boolean deletable = true;
    private boolean editable = true;

    public List<Long> getClientIdList() {
        return clientIdList;
    }

    public void setClientIdList(List<Long> clientIdList) {
        this.clientIdList = clientIdList;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}