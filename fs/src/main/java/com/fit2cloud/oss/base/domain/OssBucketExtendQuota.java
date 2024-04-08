package com.fit2cloud.oss.base.domain;

public class OssBucketExtendQuota extends OssXskyBucketQuota {

    /**
     * 已使用存储桶个数
     */
    private Integer bucketNum;

    /**
     * 已使用存储桶容量
     */
    private Long bucketCapacity;

    public Integer getBucketNum() {
        return bucketNum;
    }

    public void setBucketNum(Integer bucketNum) {
        this.bucketNum = bucketNum;
    }

    public Long getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(Long bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }
}
