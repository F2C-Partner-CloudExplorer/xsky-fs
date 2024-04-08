package com.fit2cloud.oss.dto;

public class OsBucketTabInfo {

    private String name;

    private Long create;

    private String status;

    private Long allocatedObjects;

    private Long allocatedSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreate() {
        return create;
    }

    public void setCreate(Long create) {
        this.create = create;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getAllocatedObjects() {
        return allocatedObjects;
    }

    public void setAllocatedObjects(Long allocatedObjects) {
        this.allocatedObjects = allocatedObjects;
    }

    public Long getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(Long allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    @Override
    public String toString() {
        return "OsBucketTabInfo{" +
                "name='" + name + '\'' +
                ", create=" + create +
                ", status='" + status + '\'' +
                ", allocatedObjects=" + allocatedObjects +
                ", allocatedSize=" + allocatedSize +
                '}';
    }
}
