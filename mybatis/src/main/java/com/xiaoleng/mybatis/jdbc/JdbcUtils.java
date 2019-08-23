package com.xiaoleng.mybatis.jdbc;


import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JdbcUtils {


    private static final String USER_NAME = "root";

    private static final String PASSWORD = "Ctcf1805";

    private static final String DRIVER_MANAGEMANT = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://101.132.143.173:3306/study?characterEncoding=utf8";

    private static Connection getConnection() {

        Connection connection = null;

        //注册数据库驱动
        try {
            Class.forName(DRIVER_MANAGEMANT);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            //获取数据库连接
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }


    /**
     * 查询
     */
    public static <T> List<T> querySql(Class<T> tClass, String sql) {
        //获取数据库连接
        Connection connection = getConnection();

        if (connection == null) {
            throw new RuntimeException("error get sql connection");
        }

        //查询结果集
        List<T> resultList = new ArrayList<T>();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Field[] fields = tClass.getDeclaredFields();
                for (Field field : fields) {
                    T t = null;
                    try {
                        t = tClass.newInstance();
                    } catch (InstantiationException | IllegalAccessException e) {
                        throw new RuntimeException("object instantiation error");
                    }

                    String s = resultSet.getString(field.getName());
                    try {
                        field.setAccessible(true);
                        field.set(t, s);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    resultList.add(t);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultList;

    }
}
