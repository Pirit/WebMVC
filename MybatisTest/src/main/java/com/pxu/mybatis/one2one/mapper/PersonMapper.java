package com.pxu.mybatis.one2one.mapper;

import com.pxu.mybatis.one2one.domain.Person;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    Person selectPersonById(@Param(value = "id") Integer id);
}
