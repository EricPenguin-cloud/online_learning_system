package com.wanxiaoda.ols.Service;

import com.wanxiaoda.ols.domain.User;
import com.wanxiaoda.ols.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User userLogin(int user_id,String password){
        return userMapper.findUser(user_id,password);
    }
}
