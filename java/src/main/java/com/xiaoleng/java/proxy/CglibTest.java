package com.xiaoleng.java.proxy;

/**
 * @author chen jia
 * @date 2020/1/14 17:18
 */
public class CglibTest {

    public static void main(String[] args) {

        MyInterceptor interceptor = new MyInterceptor();

        CglibTest cglibTest = (CglibTest) interceptor.getProxy(CglibTest.class);
        cglibTest.operate1();
        System.out.println();
        cglibTest.operate2();
    }

    public void operate1() {
        System.out.println("操作数据库1");
    }

    public void operate2() {
        System.out.println("操作数据库2");
    }

}

