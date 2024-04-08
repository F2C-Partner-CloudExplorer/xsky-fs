package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsXskyFolder;

public class FsXskyFolderDTO extends FsXskyFolder {
    private String sort;

    private String usedRate = "0%";
    private Integer usedRateInt = 0;
    private Long sizeGB;
    private Long originalSize;
    private Long originalSizeGB;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getUsedRate() {
        return usedRate;
    }

    public void setUsedRate(String usedRate) {
        this.usedRate = usedRate;
    }

    public Integer getUsedRateInt() {
        return usedRateInt;
    }

    public void setUsedRateInt(Integer usedRateInt) {
        this.usedRateInt = usedRateInt;
    }

    public Long getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(Long sizeGB) {
        this.sizeGB = sizeGB;
    }

    public Long getOriginalSize() {
        return originalSize;
    }

    public void setOriginalSize(Long originalSize) {
        this.originalSize = originalSize;
    }

    public Long getOriginalSizeGB() {
        return originalSizeGB;
    }

    public void setOriginalSizeGB(Long originalSizeGB) {
        this.originalSizeGB = originalSizeGB;
    }
}