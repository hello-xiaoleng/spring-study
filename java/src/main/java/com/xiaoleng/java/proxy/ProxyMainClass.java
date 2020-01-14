package com.xiaoleng.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author chen jia
 * @date 2020/1/13 16:34
 */
public class ProxyMainClass {
    public static void main(String[] args) {
        //我们要代理的真实对象
        HelloImpl hello = new HelloImpl();
        //我们要代理哪个真实对象，就将该对象传进去，最后通过该真实的对象调用该方法
        InvocationHandler handler = new DynamicProxyHello(hello);

        IHello iHello = (IHello) Proxy.newProxyInstance(handler.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);
        iHello.sayHello("chen jia");
        System.out.println(iHello.getClass().getName());
    }

}
