package com.fit2cloud.oss.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -819216796235914046L;
    public static final String INVALID_REQUEST_PARAM_MSG = "无效的请求参数";
    public static final String REPEAT_REQUEST_PARAM_MSG = "名称不允许重复";
    public static final String TARGET_NOT_EXISTS_MSG = "请求目标不存在";
    public static final String USER_IN_GROUP = "用户在文件组中，不可删除";
    public static final String CLIENT_IN_GROUP = "客户端在客户端组中，不可删除";
    public static final String USER_IN_SHARE = "用户已被文件系统共享，不可修改";
    public static final String CLIENT_IN_SHARE = "客户端已被文件系统共享，不可修改";
    public static final String FOLDER_IN_SHARE = "文件系统已共享，不允许修改名称";
    public static final String USER_GROUP_IN_SHARE = "用户组已被文件系统共享，不可删除";
    public static final String USER_GROUP_IN_SHARE_NOT_MODIFIED_WORKSPACE = "用户组已被文件系统共享，不可更改组织或工作空间";
    public static final String CLIENT_GROUP_IN_SHARE = "客户端组已被文件系统共享，不可删除";
    public static final String CLIENT_GROUP_IN_SHARE_NOT_MODIFIED_WORKSPACE = "客户端组已被文件系统共享，不可更改组织或工作空间";




    protected String code = null;

    public BusinessException(ReturnCode returnCode) {
        super(returnCode.getDesc());
        this.code = returnCode.name();
    }

    public BusinessException(ReturnCode returnCode, String msg) {
        super(msg);
        this.code = returnCode.name();
    }

    public BusinessException(ReturnCode returnCode, Throwable ex) {
        super(ex);
        this.code = returnCode.name();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

