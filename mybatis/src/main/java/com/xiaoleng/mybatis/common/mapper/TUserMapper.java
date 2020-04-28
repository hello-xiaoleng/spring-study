package com.xiaoleng.mybatis.common.mapper;

import com.xiaoleng.mybatis.common.domain.entity.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    List<TUser> findAll();

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser findUserAndPositionByPrimaryKey(@Param("id") Integer userId);

    List<TUser> findUserAndJobHistoryBy(@Param("id") Integer userId);
}