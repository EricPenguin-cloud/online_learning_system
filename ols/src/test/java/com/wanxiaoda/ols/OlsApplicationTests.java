package com.wanxiaoda.ols;

import com.wanxiaoda.ols.Service.UserService;
import com.wanxiaoda.ols.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OlsApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        System.out.printf(userService.userLogin(1,"123").toString());
    }

}
