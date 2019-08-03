package com.xiaoleng.aop;


import com.xiaoleng.aop.config.MainConfig;
import com.xiaoleng.aop.domain.OrderDto;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    @Test
    public void contextTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        OrderDto orderDto = (OrderDto) applicationContext.getBean("orderDto");

        System.out.println(orderDto);

        applicationContext.close();

    }
}
