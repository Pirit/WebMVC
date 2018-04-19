package com.pxu.service.impl;

import com.pxu.domain.User;
import com.pxu.mapper.UserMapper;
import com.pxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String loginname, String password) {
        return userMapper.findWithLoginnameAndPassword(loginname,password);
    }
}
