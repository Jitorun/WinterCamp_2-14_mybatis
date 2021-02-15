package com.Jitorun.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.apache.ibatis.io.Resources;
import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory --> sqlSession
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {

        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();

    }
}
