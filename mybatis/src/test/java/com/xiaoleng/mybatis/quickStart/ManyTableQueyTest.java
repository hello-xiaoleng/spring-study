package com.xiaoleng.mybatis.quickStart;


import com.xiaoleng.mybatis.common.domain.entity.TUser;
import com.xiaoleng.mybatis.common.mapper.TUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ManyTableQueyTest {

    @Test
    public void queryTest() {

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

}
