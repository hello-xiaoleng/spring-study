package com.xiaoleng.ioc;


import com.xiaoleng.ioc.config.MainConfig;
import com.xiaoleng.ioc.service.CalculatorServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class MainTest {

    @Test
    public void contexTest(){

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);

        CalculatorServiceImpl calculateService = applicationContext.getBean(CalculatorServiceImpl.class);

        BigDecimal result = calculateService.div(new BigDecimal("100"), new BigDecimal("50"));

    }
}
