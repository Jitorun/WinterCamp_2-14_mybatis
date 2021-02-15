package com.Jitorun.dao;

import com.Jitorun.pojo.student;
import com.Jitorun.pojo.teacher;
import com.Jitorun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class teacherDaoTest {

    /**
     * 查询全部
     */
    @Test
    public void test(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        teacherMapper teacherMapper = sqlSession.getMapper(teacherMapper.class);
        List<teacher> teacherList = teacherMapper.getteacherList();
        for (teacher tea : teacherList){
            System.out.println(tea);
        }

        sqlSession.close();
    }

    /**
     * 根据ID查询
     */

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper=sqlSession.getMapper(teacherMapper.class);
        teacher tea = mapper.getteacherByID(1);
        System.out.println(tea);
        sqlSession.close();
    }

    /**
     * 增
     */
    @Test
    public  void addteacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper=sqlSession.getMapper(teacherMapper.class);
        int res = mapper.addteacher(new teacher(4,"王维",40));
        //System.out.println(tea);
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
    public void updateteacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper=sqlSession.getMapper(teacherMapper.class);
        int res = mapper.updateteacher(new teacher(4,"康熙",40));
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
    public void deleteteacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper=sqlSession.getMapper(teacherMapper.class);
        int res = mapper.deleteteacher(4);
        //System.out.println(stu);
        if (res>0){
            System.out.println("删除成功！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
