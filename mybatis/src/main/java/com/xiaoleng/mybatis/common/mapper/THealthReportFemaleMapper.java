package com.xiaoleng.mybatis.common.mapper;

import com.xiaoleng.mybatis.common.domain.entity.THealthReportFemale;

public interface THealthReportFemaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THealthReportFemale record);

    int insertSelective(THealthReportFemale record);

    THealthReportFemale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(THealthReportFemale record);

    int updateByPrimaryKey(THealthReportFemale record);
}