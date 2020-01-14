package com.xiaoleng.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chen jia
 * @date 2020/1/13 14:49
 */
public class DynamicProxyHello implements InvocationHandler {

    //目标对象
    private Object target;

    public DynamicProxyHello(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在代理真实对象前我们可以添加一些自己的操作
        System.out.println("代理开始");
        System.out.println("代理Method:" + method);

        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        String result = (String) method.invoke(target, args);
        System.out.println(result);

        //在代理真实对象后我们可以添加一些自己的操作
        System.out.println("代理结束");
        return null;
    }
}
