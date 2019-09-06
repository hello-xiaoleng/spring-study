package com.xiaoleng.java.shiftCalculation;

public class MainClass {

    public static void main(String[] args) {
        int i = 15;
        System.out.println("移位前:" + Integer.toBinaryString(i));
        System.out.println(Integer.parseInt(Integer.toBinaryString(i), 2));
        i = i << 2;
        System.out.println("移位后:" + Integer.toBinaryString(i));
        System.out.println(Integer.parseInt(Integer.toBinaryString(i), 2));


        int j = 10;
        System.out.println(Integer.toBinaryString(j));
        System.out.println("i&j=" + Integer.toBinaryString(i & j));
        System.out.println("i|j=" + Integer.toBinaryString(i | j));
        System.out.println("i^j=" + Integer.toBinaryString(i ^ j));
    }
}
