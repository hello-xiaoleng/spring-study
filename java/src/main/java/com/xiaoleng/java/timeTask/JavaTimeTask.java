package com.xiaoleng.java.timeTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class JavaTimeTask {


    public static void main(String[] args) {
        Timer timer1 = new Timer();

        TimerTask timerTask = new TimerTask() {
            private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            @Override
            public void run() {
                System.out.println("我在" + LocalDateTime.now().format(dateTimeFormatter) + ",执行了！");
            }
        };
        LocalDateTime customerDateTime = LocalDateTime.of(2019,9,11,15,21,0);
        timer1.schedule(timerTask,1000,1000);

    }


}
