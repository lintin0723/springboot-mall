package com.lintin0723.springbootmall.dao;

import com.lintin0723.springbootmall.dto.UserRegisterRequest;
import com.lintin0723.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
