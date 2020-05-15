package com.xiaoleng.mybatis.springMybatis;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoleng.mybatis.common.domain.entity.TUser;
import com.xiaoleng.mybatis.common.mapper.TUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringContextTest {

    @Autowired
    private TUserMapper tUserMapper;

    @Test
    public void testMybatis() {

        PageHelper.startPage(1, 1000);

        List<TUser> all = tUserMapper.findAll();

        PageInfo<TUser> pageInfo = new PageInfo<>(all);

        System.out.println(all.size());

    }
}
