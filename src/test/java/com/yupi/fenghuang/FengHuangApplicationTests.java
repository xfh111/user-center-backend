package com.yupi.usercenter;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {
//    @Resource
//    private UserMapper userMapper;

    @Test
    void testSelect() {
//        List<User> userList = userMapper.selectList(null);
////        Assert.assertEquals(5,userList.size());
//        userList.forEach(e -> System.out.println(e));
    }

    @Test
    void testSalt(){
        String userPassword = "xufenghua";
        String salt = "sssss";
        // 基于spring框架中的DigestUtils工具类进行密码加密
        String encryptPassword = DigestUtils.md5DigestAsHex((salt+ userPassword).getBytes());
        System.out.println(encryptPassword);
    }
}
