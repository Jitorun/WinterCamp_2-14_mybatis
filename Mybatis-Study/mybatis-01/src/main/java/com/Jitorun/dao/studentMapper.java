package com.Jitorun.dao;

import com.Jitorun.pojo.student;

import java.util.List;

public interface studentMapper {
    //查询全部
    List<student> getstudentList();

    //根据id查询
    student getstudentByID(int id);

    //增加
    int addstudent(student stu);

    //修改
    int updatestudent(student stu);

    //删除
    int deletestudent(int id);
}
