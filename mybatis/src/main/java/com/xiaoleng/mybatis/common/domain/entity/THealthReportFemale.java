package com.xiaoleng.mybatis.common.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class THealthReportFemale implements Serializable {
    private Integer id;

    private String item;

    private BigDecimal score;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}