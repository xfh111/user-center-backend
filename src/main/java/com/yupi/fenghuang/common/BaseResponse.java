package com.yupi.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * 前后端统一协议信息
 *
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {
    /**
     * 状态码
     */
    private int code;
    /**
     * T 泛型 使用是因为 data数据的返回值各式各样
     * 增加通用性
     */
    private T data;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 描述
     */
    private String description;


    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "","");
    }

    /**
     * 异常状态码信息
     * @param errorCode
     */
    //因为是某种错误，所以data数据都肯定为null，其他参数从ErrorCode中获取默认的枚举值
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(),null,errorCode.getMessage(),errorCode.getDescription());
    }

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
}
