package com.xiaoleng.ioc;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Resource {


    public static void main(String[] args) throws IOException {

        ClassPathResource resource = new ClassPathResource("/com/xiaoleng/ioc/application.properties");

        File file = resource.getFile();
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] by = new byte[1024];
        StringBuilder result = new StringBuilder();
        while (true) {
            int b1 = fileInputStream.read(by);
            if (b1 == -1) {
                break;
            }
            result.append(new String(by, 0, b1));
        }
        System.out.println(result.toString());
    }
}
