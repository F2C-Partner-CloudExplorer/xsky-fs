package com.fit2cloud.oss.dto;

import com.alibaba.fastjson.JSON;

/**
 * @author upeoe
 * @create 2018/7/16 20:14
 */
public class GTMErrorDTO {
    private Integer code;
    private String message;
    private Long apiError;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getApiError() {
        return apiError;
    }

    public void setApiError(Long apiError) {
        this.apiError = apiError;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
