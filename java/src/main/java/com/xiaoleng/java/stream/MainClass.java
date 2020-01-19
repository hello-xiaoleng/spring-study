package com.xiaoleng.java.stream;

import com.alibaba.fastjson.JSON;
import com.xiaoleng.domain.Student;

import java.util.Arrays;
import java.util.List;


/**
 * @author chen jia
 * @date 2020/1/17 13:45
 */
public class MainClass {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("1", Student.Course.ENGLISH, 70), new Student("3", Student.Course.ENGLISH, 50),
                new Student("2", Student.Course.ENGLISH, 80), new Student("4", Student.Course.ENGLISH, 60),
                new Student("1", Student.Course.LANGUAGE, 50), new Student("2", Student.Course.LANGUAGE, 60),
                new Student("3", Student.Course.LANGUAGE, 70), new Student("4", Student.Course.LANGUAGE, 80),
                new Student("3", Student.Course.MATHEMATICS, 50), new Student("1", Student.Course.MATHEMATICS, 60),
                new Student("4", Student.Course.MATHEMATICS, 70), new Student("2", Student.Course.MATHEMATICS, 80));
        List<Student> list = students.stream().collect(new StudentCollector());

        list.forEach(e -> System.out.println(JSON.toJSONString(e)));

    }
}
