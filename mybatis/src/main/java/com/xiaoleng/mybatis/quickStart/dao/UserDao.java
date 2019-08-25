package com.xiaoleng.mybatis.quickStart.dao;

import com.xiaoleng.mybatis.common.domain.entity.User;

import java.util.List;

public interface UserDao {

    List<User> queryAll();
}
