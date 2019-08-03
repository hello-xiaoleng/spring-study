package com.xiaoleng.aop.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;


@Service
public class CalculateServiceImpl {


    public BigDecimal div(BigDecimal i, BigDecimal j) {

        return i.divide(j, MathContext.DECIMAL32);
    }
}
