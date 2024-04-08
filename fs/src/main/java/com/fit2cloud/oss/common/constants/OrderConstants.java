package com.fit2cloud.oss.common.constants;

/**
 *
 */
public class OrderConstants {
    public enum Status {
        DRAFT, UNCHECKED, APPROVED, FINISHED, TERMINATED, CANCELED, REJECTED, PROCESSING, ERROR, WARNING
    }

    public static final String ORDER_ID_PREFIX = "fs";

    public enum Type {
        CREATE_FOLDER, UPDATE_FOLDER, DELETE_FOLDER, CREATE_SHARE, UPDATE_SHARE, DELETE_SHARE
    }

    public enum MODEL_ID {
        folder_create, folder_update, folder_delete, share_create, share_update, share_delete
    }
}
