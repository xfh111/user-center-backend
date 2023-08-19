package com.yupi.usercenter.exception;

import com.yupi.usercenter.common.ErrorCode;

/**
 * 自定义异常
 */
public class BusinessException extends RuntimeException{

    private int code;

    private String description;

    /**
     * 通过自己传入信息
     *
     * @param message
     * @param code
     * @param description
     */
    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    /**
     * 自拟异常描述信息
     *
     * @param errorCode
     * @param description
     */
    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    /**
     * 异常描述信息都来自ErrorCode
     *
     * @param errorCode
     */
    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
