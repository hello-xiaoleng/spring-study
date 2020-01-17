package com.xiaoleng.java.stream;

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
                new Student("1", Student.Course.ENGLISH, 78), new Student("1", Student.Course.LANGUAGE, 71),
                new Student("1", Student.Course.MATHEMATICS, 82), new Student("2", Student.Course.ENGLISH, 69),
                new Student("2", Student.Course.LANGUAGE, 66), new Student("2", Student.Course.MATHEMATICS, 46),
                new Student("3", Student.Course.ENGLISH, 78), new Student("3", Student.Course.LANGUAGE, 88),
                new Student("3", Student.Course.MATHEMATICS, 100), new Student("4", Student.Course.ENGLISH, 68),
                new Student("4", Student.Course.LANGUAGE, 84), new Student("4", Student.Course.MATHEMATICS, 90),
                new Student("5", Student.Course.ENGLISH, 74), new Student("5", Student.Course.LANGUAGE, 59),
                new Student("5", Student.Course.MATHEMATICS, 87));

    }
}
