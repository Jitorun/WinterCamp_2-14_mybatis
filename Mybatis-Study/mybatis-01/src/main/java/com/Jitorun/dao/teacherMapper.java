package com.Jitorun.dao;

import com.Jitorun.pojo.student;
import com.Jitorun.pojo.teacher;

import java.util.List;

public interface teacherMapper {
    //查询全部
    List<teacher> getteacherList();

    //根据id查询
    teacher getteacherByID(int id);

    //增加
    int addteacher(teacher tea);

    //修改
    int updateteacher(teacher tea);

    //删除
    int deleteteacher(int id);
}
