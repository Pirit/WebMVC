package com.pxu.mybatis.one2one.mapper;

import com.pxu.mybatis.one2one.domain.Card;
import org.apache.ibatis.annotations.Param;

public interface CardMapper {
    Card selectCardById(@Param(value = "id") Integer id);
}
