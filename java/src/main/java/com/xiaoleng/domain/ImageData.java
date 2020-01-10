package com.xiaoleng.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.converters.string.StringImageConverter;
import lombok.Data;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * @author chen jia
 * @date 2020/1/9 16:23
 */
@Data
@ContentRowHeight(100)
@ColumnWidth(50)
public class ImageData {

    @ExcelProperty("文件")
    private File file;

    @ExcelProperty("输入流")
    private InputStream inputStream;
    /**
     * 如果string类型 必须指定转换器，string默认转换成string
     */
    @ExcelProperty(value = "字符串", converter = StringImageConverter.class)
    private String string;

    @ExcelProperty("字节数组")
    private byte[] byteArray;
    /**
     * 根据url导出
     *
     * @since 2.1.1
     */
    @ExcelProperty("url")
    private URL url;
}
