package com.xiaoleng.java.proxy;

/**
 * @author chen jia
 * @date 2020/1/13 14:46
 */
public class StaticMainClass {

    public static void main(String[] args) {
        IHello proxy = new HelloProxy(new HelloImpl());

        proxy.sayHello("chenjia");
    }
}
