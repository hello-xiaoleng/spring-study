package com.xiaoleng.ioc.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;


@Service
public class CalculatorServiceImpl {


    public BigDecimal div(BigDecimal i, BigDecimal j) {

        return i.divide(j, MathContext.DECIMAL32);
    }
}
