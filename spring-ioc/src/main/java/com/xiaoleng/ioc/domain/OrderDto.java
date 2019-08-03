package com.xiaoleng.ioc.domain;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class OrderDto {

    /**
     * 订单号
     */
    private String orderNo;

    @PostConstruct
    public void postConstruct() {
        System.out.println("begin invoke orderDto postConstruct method!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("before destroy spring applicationContex,invoke orderDto preDestory method!");
    }


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderNo='" + orderNo + '\'' +
                '}';
    }
}
