package com.fit2cloud.oss.dto;

import xio.sds.client.model.FSUserGroup;

import java.util.List;

public class FsXskyUpdateUserGroupDTO {
    private FSUserGroup fsUserGroup;
    private List<Long> addUserIds;
    private List<Long> removeUserIds;

    public FSUserGroup getFsUserGroup() {
        return fsUserGroup;
    }

    public void setFsUserGroup(FSUserGroup fsUserGroup) {
        this.fsUserGroup = fsUserGroup;
    }

    public List<Long> getAddUserIds() {
        return addUserIds;
    }

    public void setAddUserIds(List<Long> addUserIds) {
        this.addUserIds = addUserIds;
    }

    public List<Long> getRemoveUserIds() {
        return removeUserIds;
    }

    public void setRemoveUserIds(List<Long> removeUserIds) {
        this.removeUserIds = removeUserIds;
    }
}