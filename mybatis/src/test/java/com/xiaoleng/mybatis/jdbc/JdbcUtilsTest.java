package com.xiaoleng.mybatis.jdbc;

import com.xiaoleng.mybatis.domain.User;
import org.junit.Test;

import java.util.List;

public class JdbcUtilsTest {

    @Test
    public void sqlTest(){

        List<User> users = JdbcUtils.querySql(User.class, "select * from user limit 10");

        users.forEach(System.out::println);
    }


}
