package com.yupi.usercenter.service;
import java.util.Date;

import com.yupi.usercenter.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    public void testRegister(){
        String userAccount = "xufenghua";
        String userPassword = "";
        String checkedPassword = "xufenghua";
        String IDCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertEquals(-1,result);
        userAccount = "xu";
        result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertEquals(-1,result);
        userAccount = "xufenghua";
        userPassword = "xufe";
        result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertEquals(-1,result);
        userAccount = "xuf usdfas";
        result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertEquals(-1,result);
        userPassword = "xufenghua";
        checkedPassword = "xufenghua1";
        result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertEquals(-1,result);
        userAccount = "xufenghua1787";
        userPassword = "xufenghua5";
        checkedPassword = "xufenghua5";
        result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertEquals(-1,result);
        userAccount = "xufenghua5";
        result = userService.userRegister(userAccount, userPassword, checkedPassword,IDCode);
        Assertions.assertTrue(result > 0);
    }


    @Test
    public void testAdd(){
        User user = new User();
//        user.setId(0L);不需要 自动生成id
        user.setUsername("许烽桦");
        user.setUserAccount("xufenghua1787");
        user.setAvatarUrl("https://images.zsxq.com/FsdsoAhFmNzLbZHeAFG8WZT58a8B?e=1696089599&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:aGuG0Kyv5T2lfPLgm_44atns9sM=");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);
        boolean result = userService.save(user);
        Assertions.assertTrue(result);

        System.out.println("userId:" + user.getId());
    }

}