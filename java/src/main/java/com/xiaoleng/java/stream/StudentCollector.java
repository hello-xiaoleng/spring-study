package com.xiaoleng.java.stream;

import com.google.common.collect.Lists;
import com.xiaoleng.domain.Student;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


/**
 * @author chen jia
 * @date 2020/1/19 11:20
 * 自定义一个收集器  学生按照课程分组，返回每组成绩最高的一名学生，组装成集合
 */
public class StudentCollector implements Collector<Student, Map<Student.Course, List<Student>>, List<Student>> {

    @Override
    public Supplier<Map<Student.Course, List<Student>>> supplier() {
        return () -> new HashMap<Student.Course, List<Student>>() {
            {
                //初始化数据
                for (Student.Course course : Student.Course.values()) {
                    put(course, Lists.newArrayList());
                }
            }
        };
    }

    @Override
    public BiConsumer<Map<Student.Course, List<Student>>, Student> accumulator() {
        return (Map<Student.Course, List<Student>> map, Student student) -> {
            if (Objects.isNull(student.getCourse())) {
                //do nothing
            } else {
                map.get(student.getCourse()).add(student);
            }
        };
    }

    @Override
    public BinaryOperator<Map<Student.Course, List<Student>>> combiner() {
        return null;
    }

    @Override
    public Function<Map<Student.Course, List<Student>>, List<Student>> finisher() {
        //取每组的成绩最大的一个 组装成list
        return (Map<Student.Course, List<Student>> map) -> {
            List<Student> students = Lists.newArrayList();
            for (Map.Entry<Student.Course, List<Student>> entry : map.entrySet()) {
                Optional<Student> optional = entry.getValue().stream().max(Comparator.comparing(Student::getScore));
                optional.ifPresent(students::add);
            }
            return students;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
