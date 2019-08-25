package com.xiaoleng.mybatis.common.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String realName;

    private Byte sex;

    private String mobile;

    private String email;

    private String note;

    private Integer positionId;

    private TPosition tPosition;

}