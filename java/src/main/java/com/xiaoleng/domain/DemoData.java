package com.xiaoleng.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author chen jia
 * @date 2020/1/8 15:25
 */

@Data
public class DemoData {

    @ExcelProperty("年龄")
    private Integer age;

    @ExcelProperty(value = "姓名", converter = CustomStringStringConverter.class)
    private String name;

    @ExcelProperty("性别")
    private String sex;


}
