package com.pxu.mybatis.many2many.mapper;

import com.pxu.mybatis.many2many.domain.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> selectOrderByUserId(int id);

    Order selectOrderById(int id);
}
