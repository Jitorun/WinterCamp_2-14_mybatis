package com.Jitorun.dao;

import com.Jitorun.pojo.student;
import com.Jitorun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class studentDaoTest {

    /**
     * 查询全部
     */
    @Test
    public void test(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        List<student> studentList = studentMapper.getstudentList();
        for (student stu : studentList){
            System.out.println(stu);
        }

        sqlSession.close();
    }

    /**
     * 根据ID查询
     */

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        studentMapper mapper=sqlSession.getMapper(studentMapper.class);
        student stu = mapper.getstudentByID(1);
        System.out.println(stu);
        sqlSession.close();
    }

    /**
     * 增
     */
    @Test
    public  void addstudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        studentMapper mapper=sqlSession.getMapper(studentMapper.class);
        int res = mapper.addstudent(new student(4,"王维","男"));
        //System.out.println(stu);
        if (res>0){
            System.out.println("插入成功！");
        }
        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 改
     */
    @Test
    public void updatestudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        studentMapper mapper=sqlSession.getMapper(studentMapper.class);
        int res = mapper.updatestudent(new student(4,"康熙","男"));
        //System.out.println(stu);
        if (res>0){
            System.out.println("修改成功！");
        }
        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 删
     */
    @Test
    public void deletestudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        studentMapper mapper=sqlSession.getMapper(studentMapper.class);
        int res = mapper.deletestudent(4);
        //System.out.println(stu);
        if (res>0){
            System.out.println("删除成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
