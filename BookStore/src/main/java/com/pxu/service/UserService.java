package com.pxu.service;

import com.pxu.domain.User;

public interface UserService {

    User login(String loginname,String password);
}
