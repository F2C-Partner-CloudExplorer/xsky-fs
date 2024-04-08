package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsXskyClient;

public class FsXskyClientDTO extends FsXskyClient {
    private String sort;
    private boolean editable = true;

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