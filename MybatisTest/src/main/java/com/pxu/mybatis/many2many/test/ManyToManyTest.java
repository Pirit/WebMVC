package com.pxu.mybatis.many2many.test;

import com.pxu.mybatis.many2many.domain.Article;
import com.pxu.mybatis.many2many.domain.Order;
import com.pxu.mybatis.many2many.domain.User;
import com.pxu.mybatis.many2many.mapper.OrderMapper;
import com.pxu.mybatis.many2many.mapper.UserMapper;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ManyToManyTest {


    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("many2many/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ManyToManyTest mtmt = new ManyToManyTest();

//        mtmt.testSelectUserById(sqlSession);

        mtmt.testSelectOrderById(sqlSession);
    }

    //    User <--> Order : One To Many
    public void testSelectUserById(SqlSession session) {
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(1);
        System.out.println(user.getId() + " " + user.getLoginname());

        List<Order> orders = user.getOrders();
        for (Order o : orders) {
            System.out.println(o);
        }
    }

//    Order <--> Articles: Many To Many
    public void  testSelectOrderById(SqlSession session){
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        Order order = orderMapper.selectOrderById(1);

        System.out.println(order);

        User user = order.getUser();
        System.out.println(user);

        List<Article> articles = order.getArticles();
        for (Article article :articles){
            System.out.println(article);
        }
    }
}
