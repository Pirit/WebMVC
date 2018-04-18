package com.pxu.mybatis.many2many.mapper;

import com.pxu.mybatis.many2many.domain.User;

public interface UserMapper {
    User selectUserById(int id);
}
