package com.pxu.mybatis.one2many.test;

import com.pxu.mybatis.one2many.domain.Clazz;
import com.pxu.mybatis.one2many.domain.Student;
import com.pxu.mybatis.one2many.mapper.ClazzMapper;
import com.pxu.mybatis.one2many.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OneToManyTest {

    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("one2many/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        Clazz:
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = clazzMapper.selectClazzById(1);
        System.out.println(clazz.getId() + " " + clazz.getCode() + " " + clazz.getName());
        System.out.println(clazz.getStudents());

//        Student
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectStudentById(3);
        System.out.println(student);

        List<Student> students = studentMapper.selectStudentByClazzId(1);
        System.out.println(students);

    }

}
