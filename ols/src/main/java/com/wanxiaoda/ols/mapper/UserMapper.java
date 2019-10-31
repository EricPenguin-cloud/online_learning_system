package com.wanxiaoda.ols.mapper;

import com.wanxiaoda.ols.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM online_learning_system.user;")
    List<User> findAll();

    @Select("SELECT * FROM online_learning_system.user " +
                "where user_id = #{user_id} and password = #{password};")
    User findUser(@Param("user_id") int user_id, @Param("password") String password);
}
