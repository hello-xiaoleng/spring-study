package com.xiaoleng.mybatis.common.mapper;

import com.xiaoleng.mybatis.common.domain.entity.THealthReportMale;

public interface THealthReportMaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THealthReportMale record);

    int insertSelective(THealthReportMale record);

    THealthReportMale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(THealthReportMale record);

    int updateByPrimaryKey(THealthReportMale record);
}