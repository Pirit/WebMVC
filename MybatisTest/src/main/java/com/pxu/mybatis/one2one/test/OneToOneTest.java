package com.pxu.mybatis.one2one.test;

import com.pxu.mybatis.one2one.domain.Person;
import com.pxu.mybatis.one2one.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class OneToOneTest {

    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("one2one/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        PersonMapper pm = sqlSession.getMapper(PersonMapper.class);

        Person p = pm.selectPersonById(1);

        System.out.println(p);
        System.out.println(p.getCard());

        sqlSession.commit();
        sqlSession.close();
    }
}
