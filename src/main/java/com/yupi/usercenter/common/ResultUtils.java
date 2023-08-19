package com.yupi.usercenter.common;

/**
 * 封装ResultUtils是为了简化以下繁杂的写法
 *
 * // return new BaseResponse<Long>(0,result,"用户注册成功");
 */
public class ResultUtils {

    /**
     * 成功
     *
     * 成功的话就不需要返回其他值了，返回0,ok证明成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<T>(0,data,"ok");
    }

    /**
     * 失败
     *
     * 因为不成功的原因可能有多种，所以通过定义枚举ErrorCode来返回各种错误的信息
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode){
        return new BaseResponse<T>(errorCode);
    }

    /**
     * 失败
     *
     * 因为不成功的原因可能有多种，所以通过定义枚举ErrorCode来返回各种错误的信息
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> error(int code,ErrorCode errorCode,String description){
        return new BaseResponse<T>(code, null,errorCode.getMessage(),description);
    }
    /**
     * 失败
     *
     * 因为不成功的原因可能有多种，所以通过定义枚举ErrorCode来返回各种错误的信息
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> error(int code,String message,String description){
        return new BaseResponse<T>(code, null,message,description);
    }
    /**
     * 失败
     *
     * 因为不成功的原因可能有多种，所以通过定义枚举ErrorCode来返回各种错误的信息
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode,String message, String description){
        return new BaseResponse<T>(errorCode.getCode(),null, message, description);
    }
    /**
     * 失败
     *
     * 因为不成功的原因可能有多种，所以通过定义枚举ErrorCode来返回各种错误的信息
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode,String description){
        return new BaseResponse<T>(errorCode.getCode(),null, description);
    }

}
