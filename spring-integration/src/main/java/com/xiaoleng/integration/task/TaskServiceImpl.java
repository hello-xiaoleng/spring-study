package com.xiaoleng.integration.task;

public class TaskServiceImpl implements TaskService {

    @Override
    public void execute() {
        System.out.println("我被执行了！");
    }
}
