package com.xiaoleng.mybatis.common.mapper;

import com.xiaoleng.mybatis.common.domain.entity.TUserRole;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("userId") Integer userId);

    int insert(TUserRole record);

    int insertSelective(TUserRole record);
}