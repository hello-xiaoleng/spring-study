package com.xiaoleng.java.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SchedulEexecutorService {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(5);

        Runnable task1 = () -> System.out.println("timerTask1在" + LocalDateTime.now().format(DATE_TIME_FORMATTER) + ",执行了！");


        Runnable task2 = () -> System.out.println("timerTask2在" + LocalDateTime.now().format(DATE_TIME_FORMATTER) + ",执行了！");
        scheduledExecutorService.schedule(task1, 1, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(task2, 1, 1, TimeUnit.SECONDS);

    }
}
