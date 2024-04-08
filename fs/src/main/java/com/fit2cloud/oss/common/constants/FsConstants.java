package com.fit2cloud.oss.common.constants;

/**
 * @author upeoe
 * @create 2018/12/6 16:48
 * Object storage constants.
 */
public class FsConstants {
    public enum ACCOUNT_STATUS {
        VALID,   // 验证成功
        INVALID, // 验证失败
        PENDING; // 等待验证

        public boolean equals(String name) {
            return this.name().equals(name);
        }
    }

    public enum ACCOUNT_SYNC_STATUS {
        PENDING, // 等待同步
        SUCCESS, // 同步完成
        FAILED,   // 同步失败
        SYNCING, // 同步中
    }

    public enum ORDER_TYPE {
        FOLDER_CREATE, // 文件系统创建
        FOLDER_REMOVE, // 文件系统删除
        FOLDER_UPDATE,   // 文件系统更新
        SHARE_CREATE, // 共享创建
        SHARE_REMOVE, // 共享删除
        SHARE_UPDATE,   // 共享更新
    }

    public enum RESOURCE_TYPE {
        FOLDER, // 文件系统创建
        NFS_SHARE,
        FTP_SHARE,
        SMB_SHARE
    }
}
