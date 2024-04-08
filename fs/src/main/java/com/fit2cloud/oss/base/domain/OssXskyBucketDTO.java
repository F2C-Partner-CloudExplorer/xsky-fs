package com.fit2cloud.oss.base.domain;

public class OssXskyBucketDTO extends OssXskyBucket {
    private String sort;

    private String allocatedSizeStr;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAllocatedSizeStr() {
        return allocatedSizeStr;
    }

    public void setAllocatedSizeStr(String allocatedSizeStr) {
        this.allocatedSizeStr = allocatedSizeStr;
    }
}