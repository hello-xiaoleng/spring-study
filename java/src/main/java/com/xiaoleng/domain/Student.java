package com.xiaoleng.domain;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @author chen jia
 * @date 2020/1/17 13:44
 */

@Data
public class Student {
    private String id;

    private Course course;

    private double score;

    public Student() {
    }

    public Student(String id, Course course, double score) {
        this.id = id;
        this.course = course;
        this.score = score;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this, true);
    }

    public enum Course {
        /**
         * 课程
         */
        LANGUAGE, MATHEMATICS, ENGLISH
    }
}
