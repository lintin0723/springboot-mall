package com.lintin0723.springbootmall.service.impl;

import com.lintin0723.springbootmall.dao.UserDao;
import com.lintin0723.springbootmall.dto.UserRegisterRequest;
import com.lintin0723.springbootmall.model.User;
import com.lintin0723.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
