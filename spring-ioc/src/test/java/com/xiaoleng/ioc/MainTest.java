package com.xiaoleng.ioc;


import com.xiaoleng.ioc.config.MainConfig;
import com.xiaoleng.ioc.domain.OrderDto;
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
