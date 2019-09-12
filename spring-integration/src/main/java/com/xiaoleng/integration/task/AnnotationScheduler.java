package com.xiaoleng.integration.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AnnotationScheduler {

    @Scheduled(cron = "0/1 * * * * ?")
    public void run() {
        System.out.println("注解定时任务执行了！");
    }
}
