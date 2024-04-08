package com.fit2cloud.oss.common.constants;

/**
 * @author upeoe
 * @create 2018/10/24 14:34
 */
public interface PermissionConstants {

    //start OSS账号相关权限
    String OSS_ACCOUNT_READ = "OSS_ACCOUNT:READ";
    String OSS_ACCOUNT_CREATE = "OSS_ACCOUNT:READ+CREATE";
    String OSS_ACCOUNT_UPDATE = "OSS_ACCOUNT:READ+UPDATE";
    String OSS_ACCOUNT_DELETE = "OSS_ACCOUNT:READ+DELETE";
    String OSS_ACCOUNT_SYNC = "OSS_ACCOUNT:READ+SYNC";
    String OSS_ACCOUNT_VALIDATE = "OSS_ACCOUNT:READ+VALIDATE";
    //end  OSS账号相关权限

    //start 对象存储桶相关权限
    String BUCKET_READ = "BUCKET:READ";
    String BUCKET_AUTH = "BUCKET:READ+AUTH";
    //end  对象存储桶相关权限

    //start 插件管理
    String PLUGIN_READ = "PLUGIN:READ";
    //end 插件管理

    // start 配额
    public static final String QUOTA_READ = "QUOTA:READ";
    public static final String QUOTA_EDIT = "QUOTA:READ+EDIT";
    public static final String QUOTA_EDIT_DEFAULT = "QUOTA:READ+EDIT_DEFAULT";
    public static final String QUOTA_WORKSPACE_READ = "QUOTA_WORKSPACE:READ";
    public static final String QUOTA_WORKSPACE_EDIT = "QUOTA_WORKSPACE:READ+EDIT";
    public static final String QUOTA_WORKSPACE_EDIT_DEFAULT = "QUOTA_WORKSPACE:READ+EDIT_DEFAULT";
    public static final String QUOTA_USER_READ = "QUOTA_USER:READ";
    // end  配额

    //start 价格策略
    public static final String POLICY_READ = "POLICY:READ";
    public static final String POLICY_DELETE = "POLICY:READ+DELETE";
    public static final String POLICY_CREATE = "POLICY:READ+CREATE";
    public static final String POLICY_EDIT = "POLICY:READ+EDIT";
    //end 价格策略

}
