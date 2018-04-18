package com.pxu.mybatis.one2many.mapper;

import com.pxu.mybatis.one2many.domain.Student;

import java.util.List;

public interface StudentMapper {

    Student selectStudentById(int id);

    List<Student> selectStudentByClazzId(int id);
}
