package com.yupi.usercenter.service;

import com.yupi.usercenter.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkedPassword 校验密码
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkedPassword, String IDCode);

    /**
     * 用户登录
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param user
     * @return
     */
    User getSafetyUser(User user);

    int userLogout(HttpServletRequest request);

}
