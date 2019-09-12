package com.xiaoleng.integration.task;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class TaskServiceTest {

    @Test
    public void taskTest() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplication.xml");

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
