package com.xiaoleng.java.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class JavaTimeTask {


    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask timerTask1 = new TimerTask() {
            private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            @Override
            public void run() {
                System.out.println("timerTask1在" + LocalDateTime.now().format(dateTimeFormatter) + ",执行了！");
            }
        };

        TimerTask timerTask2 = new TimerTask() {
            private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            @Override
            public void run() {
                System.out.println("timerTask2在" + LocalDateTime.now().format(dateTimeFormatter) + ",执行了！");
            }
        };
        LocalDateTime customerDateTime = LocalDateTime.of(2019,9,11,15,21,0);
        timer.schedule(timerTask1,1000,1000);
        timer.scheduleAtFixedRate(timerTask2,1000,2000);

    }


}
