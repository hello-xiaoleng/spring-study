package com.xiaoleng.java.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chen jia
 * @date 2020/1/13 14:42
 */
public class HelloProxy implements IHello {

    private Logger log = LoggerFactory.getLogger(HelloProxy.class);

    private IHello iHello;

    public HelloProxy(IHello iHello) {
        this.iHello = iHello;
    }

    @Override
    public String sayHello(String message) {
        log.info("begin invoke sayHello method!");
        String msg = iHello.sayHello(message);
        log.info("message :{}", msg);
        log.info("end invoke sayHello method!");
        return message;
    }
}
