package com.xiaoleng.mybatis.common.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TPosition implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String postName;

    private String note;
}