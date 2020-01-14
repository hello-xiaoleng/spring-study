package com.xiaoleng.java.proxy;

/**
 * @author chen jia
 * @date 2020/1/13 14:40
 */
public class HelloImpl implements IHello {

    @Override
    public String sayHello(String message) {
        return message;
    }
}
