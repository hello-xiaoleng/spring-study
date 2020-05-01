package com.xiaoleng.java.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {


    public static void main(String[] args) {

        List<SortItem> w = Arrays.asList(new SortItem(0, 0.37), new SortItem(1, 0.555), new SortItem(2, 0.075));
        Map<Integer, Double> map = w.stream().collect(Collectors.toMap(SortItem::getOrderNum, SortItem::getValue));
        List<List<SortItem>> d = new ArrayList<>();

        List<SortItem> d1 = Arrays.asList(new SortItem(0, 0.92), new SortItem(1, 0.51), new SortItem(2, 0.38));
        List<SortItem> d2 = Arrays.asList(new SortItem(0, 0.15), new SortItem(1, 0.71), new SortItem(2, 0.88));
        List<SortItem> d3 = Arrays.asList(new SortItem(0, 0.84), new SortItem(1, 1.00), new SortItem(2, 0.25));
        List<SortItem> d4 = Arrays.asList(new SortItem(0, 0.54), new SortItem(1, 0.89), new SortItem(2, 0.50));
        List<SortItem> d5 = Arrays.asList(new SortItem(0, 0.59), new SortItem(1, 0.84), new SortItem(2, 0.50));
        d.add(d1);
        d.add(d2);
        d.add(d3);
        d.add(d4);
        d.add(d5);


        List<Double> results = new ArrayList<>();

        List<Double> qw = new ArrayList<>();
        for (List<SortItem> list : d) {
            list.sort(Comparator.comparing(SortItem::getValue, Comparator.reverseOrder()));

            Double temp = 0.0;
            for (SortItem sortItem : list) {
                Double sum = qw.stream().reduce(0.0, (a, b) -> a + b);
                Double item = map.get(sortItem.getOrderNum());
                temp += item;
                double qItem = q(temp);
                qw.add(qItem - sum);
            }

            System.out.println("电阻向量" + qw);

            results.add(multiply(list, qw));
            qw.clear();
        }

//        results.sort(Comparator.reverseOrder());

        System.out.println(results);


    }

    private static double q(double x) {
        if (x < 0.20 && x >= 0) {
            return 0.2111 * x;
        } else if (x < 0.4 && x >= 0.2) {
            return 1.3841 * x - 0.2346;
        } else if (x < 0.6 && x >= 0.4) {
            return 3.0479 * x - 0.9001;
        } else if (x < 0.8 & x >= 0.6) {
            return 0.2778 * x + 0.7620;
        } else if (x <= 1.0 && x >= 0.8) {
            return 0.0792 * x + 0.9208;
        } else {
            throw new IllegalArgumentException("x值非法");
        }
    }

    private static Double multiply(List<SortItem> list1, List<Double> list2) {
        double result = 0.0;
        for (int i = 0; i < list1.size(); i++) {
            result += list1.get(i).getValue() * list2.get(i);

        }
        return result;
    }

    static class SortItem {
        private Integer orderNum;
        private Double value;

        public SortItem(Integer orderNum, double value) {
            this.orderNum = orderNum;
            this.value = value;
        }

        public Integer getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }

}
