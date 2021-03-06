package com.xiaoleng.java.log;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author chen jia
 * @date 2020/1/7 14:53
 */
public class Log {


    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger("lavasoft");
        log.setLevel(Level.INFO);
        Logger log1 = Logger.getLogger("lavasoft");
        System.out.println(log == log1);     //true
        Logger log2 = Logger.getLogger("lavasoft.blog");
//        log2.setLevel(Level.WARNING);
//控制台控制器
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
//        log.addHandler(consoleHandler);
//文件控制器
        FileHandler fileHandler = new FileHandler("D:\\log\\test.txt");
        fileHandler.setLevel(Level.INFO);
//        log.addHandler(fileHandler);
        log.info("aaa");
        log2.info("bbb");
        log2.fine("fine");
    }


}
