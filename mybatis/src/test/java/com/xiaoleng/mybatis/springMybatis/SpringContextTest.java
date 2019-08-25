package com.xiaoleng.mybatis.springMybatis;


import com.xiaoleng.mybatis.common.domain.entity.TUser;
import com.xiaoleng.mybatis.common.mapper.TUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringContextTest {

    @Autowired
    private TUserMapper tUserMapper;

    @Test
    public void testMybatis(){

        TUser userAndPosition = tUserMapper.findUserAndPositionByPrimaryKey(3);

        System.out.println(userAndPosition);

    }
}
