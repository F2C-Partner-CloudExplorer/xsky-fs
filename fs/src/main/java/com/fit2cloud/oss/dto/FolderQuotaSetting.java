package com.fit2cloud.oss.dto;


import com.fit2cloud.oss.common.constants.GeneralConstants;

public class FolderQuotaSetting {

    public static final String WORKSPACE_KEY = "workspace_quota_setting";
    public static final String WORKSPACE_DEFAULT_KEY = "workspace_default_quota_setting";
    public static final String ORG_KEY = "org_quota_setting";
    public static final String ORG_DEFAULT_KEY = "org_default_quota_setting";

    /**
     * 配额个数
     */
    private long folderCount;
    /**
     * 实际已使用个数
     */
    private long folderCountUsed;

    /**
     * 配额容量
     */
    private long folderSize;
    /**
     * 实际已使用容量
     */
    private long folderSizeUsed;

    private long folderTotalCount;
    private long folderTotalSize;

    private boolean fsDefaultSetting = false;

    private GeneralConstants.Options folderAllocateResourceIfExceed = GeneralConstants.Options.DEFAULT;

    public long getFolderCount() {
        return folderCount;
    }

    public void setFolderCount(long folderCount) {
        this.folderCount = folderCount;
    }

    public long getFolderTotalCount() {
        return folderTotalCount;
    }

    public void setFolderTotalCount(long folderTotalCount) {
        this.folderTotalCount = folderTotalCount;
    }

    public long getFolderTotalSize() {
        return folderTotalSize;
    }

    public void setFolderTotalSize(long folderTotalSize) {
        this.folderTotalSize = folderTotalSize;
    }

    public long getFolderCountUsed() {
        return folderCountUsed;
    }

    public void setFolderCountUsed(long folderCountUsed) {
        this.folderCountUsed = folderCountUsed;
    }

    public long getFolderSize() {
        return folderSize;
    }

    public void setFolderSize(long folderSize) {
        this.folderSize = folderSize;
    }

    public long getFolderSizeUsed() {
        return folderSizeUsed;
    }

    public void setFolderSizeUsed(long folderSizeUsed) {
        this.folderSizeUsed = folderSizeUsed;
    }

    public boolean isFsDefaultSetting() {
        return fsDefaultSetting;
    }

    public void setFsDefaultSetting(boolean fsDefaultSetting) {
        this.fsDefaultSetting = fsDefaultSetting;
    }

    public GeneralConstants.Options getFolderAllocateResourceIfExceed() {
        return folderAllocateResourceIfExceed;
    }

    public void setFolderAllocateResourceIfExceed(GeneralConstants.Options folderAllocateResourceIfExceed) {
        this.folderAllocateResourceIfExceed = folderAllocateResourceIfExceed;
    }

    public boolean isDefault() {
        return isFsDefaultSetting() && getFolderAllocateResourceIfExceed() == GeneralConstants.Options.DEFAULT;
    }

    public void clearUsed() {
        this.setFolderCountUsed(0L);
        this.setFolderSizeUsed(0L);
    }

    public static FolderQuotaSetting getDefault() {
        FolderQuotaSetting quotaSetting = new FolderQuotaSetting();
        quotaSetting.setFsDefaultSetting(true);
        return quotaSetting;
    }

    public FolderQuotaSetting sum(FolderQuotaSetting another) {
        folderCount += another.getFolderCount();
        folderSize += another.getFolderSize();
        return this;
    }
}
