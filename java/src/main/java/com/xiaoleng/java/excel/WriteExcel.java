package com.xiaoleng.java.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.FileUtils;
import com.xiaoleng.domain.ImageData;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chen jia
 * @date 2020/1/9 15:02
 */
public class WriteExcel {

    public static void main(String[] args) {
        write();
    }

    public static void write() {

//        String fileName = "C:\\Users\\admin\\Desktop\\test111.xlsx";
//
//        List<WriteDemoData> dataList = new ArrayList<>();
//
//        WriteDemoData writeDemoData = new WriteDemoData();
//        writeDemoData.setDate(new Date());
//        writeDemoData.setDoubleData(1.222);
//        writeDemoData.setString("test");
//        dataList.add(writeDemoData);
//
//        EasyExcel.write(fileName, WriteDemoData.class).sheet("模板").doWrite(dataList);

        try {
            imageWrite();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void imageWrite() throws Exception {
        String fileName = "C:\\Users\\admin\\Desktop\\福满中秋.xlsx";
        // 如果使用流 记得关闭
        InputStream inputStream = null;
        try {
            List<ImageData> list = new ArrayList<ImageData>();
            ImageData imageData = new ImageData();

            list.add(imageData);
            String imagePath = "C:\\Users\\admin\\Desktop\\图片\\福满中秋.jpg";
            // 放入五种类型的图片 实际使用只要选一种即可
            imageData.setByteArray(FileUtils.readFileToByteArray(new File(imagePath)));
            imageData.setFile(new File(imagePath));
            imageData.setString(imagePath);
            inputStream = FileUtils.openInputStream(new File(imagePath));
            imageData.setInputStream(inputStream);
            imageData.setUrl(new URL(
                    "https://images.unsplash.com/photo-1518460140838-62a96df71190?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80"));
            EasyExcel.write(fileName, ImageData.class).sheet("test").doWrite(list);

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
