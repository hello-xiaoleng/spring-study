package com.xiaoleng.mybatis.common.mapper;

import com.xiaoleng.mybatis.common.domain.entity.TUser;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser findUserAndPositionByPrimaryKey(@Param("id") Integer userId);
}