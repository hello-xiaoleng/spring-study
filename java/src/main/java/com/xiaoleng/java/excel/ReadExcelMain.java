package com.xiaoleng.java.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.xiaoleng.domain.DemoData;
import com.xiaoleng.domain.DemoDataListener;

/**
 * @author chen jia
 * @date 2020/1/8 15:24
 */
public class ReadExcelMain {

    public static void main(String[] args) {
        simpleRead();
    }


    private static void simpleRead() {
        // 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
        // 写法1：
        String fileName = "C:\\Users\\admin\\Desktop\\test.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet(0).doRead();
    }

    private static void repeatedRead() {

        String fileName = "C:\\Users\\admin\\Desktop\\test.xlsx";

        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).doReadAll();


        ExcelReader excelReader = EasyExcel.read(fileName).build();
        ReadSheet sheet0 = EasyExcel.readSheet(0).head(DemoData.class).registerReadListener(new DemoDataListener()).build();
        ReadSheet sheet1 = EasyExcel.readSheet(1).head(DemoData.class).registerReadListener(new DemoDataListener()).build();
        excelReader.read(sheet0, sheet1);

        excelReader.finish();
    }


}
