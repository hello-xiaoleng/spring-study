package com.xiaoleng.aop;


import com.xiaoleng.aop.config.MainConfig;
import com.xiaoleng.aop.service.CalculateServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class MainTest {

    @Test
    public void contexTest(){

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);

        CalculateServiceImpl calculateService = applicationContext.getBean(CalculateServiceImpl.class);

        BigDecimal result = calculateService.div(new BigDecimal("100"), new BigDecimal("50"));

    }
}
