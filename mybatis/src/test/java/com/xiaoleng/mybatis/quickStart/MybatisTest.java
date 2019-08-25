package com.xiaoleng.mybatis.quickStart;

import com.xiaoleng.mybatis.common.domain.entity.User;
import com.xiaoleng.mybatis.quickStart.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest {

    @Test
    public void queryTest() {

        SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSession();

        List<User> users = new ArrayList<>();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
             users = userDao.queryAll();
        } finally {
            sqlSession.close();
        }

        for (User user : users) {
            System.out.println(user);
        }

    }
}
