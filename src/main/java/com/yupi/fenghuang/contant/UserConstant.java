package com.yupi.usercenter.contant;

public interface UserConstant {

    //盐值
    String SALT = "xufenghua";
    //session 用户登录态键
    String USER_LOGIN_STATE = "userLoginState";
    /**
     * 用户权限 0 - 正常用户
     */
    Integer DEFAULT_ROLE = 0;
    /**
     * 管理员权限 1 - 正常用户
     */
    Integer ADMIN_ROLE = 1;
}
