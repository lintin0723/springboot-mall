package com.lintin0723.springbootmall.service;

import com.lintin0723.springbootmall.dto.UserRegisterRequest;
import com.lintin0723.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);


}
