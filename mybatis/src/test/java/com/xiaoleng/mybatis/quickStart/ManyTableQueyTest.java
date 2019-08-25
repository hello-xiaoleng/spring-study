package com.xiaoleng.mybatis.quickStart;


import com.xiaoleng.mybatis.common.domain.entity.TUser;
import com.xiaoleng.mybatis.common.mapper.TUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ManyTableQueyTest {

    @Test
    public void oneToOneTest() {

        SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSession();

        TUser userAndPostion;
        try {
            TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
            userAndPostion = mapper.findUserAndPositionByPrimaryKey(2);
        } finally {
            sqlSession.close();
        }

        System.out.println(userAndPostion);

    }

    @Test
    public void oneToManyTest() {

        SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSession();

        List<TUser> userAndPostionList;
        try {
            TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
            userAndPostionList = mapper.findUserAndJobHistoryBy(null);
        } finally {
            sqlSession.close();
        }

        System.out.println(userAndPostionList);

    }

}
