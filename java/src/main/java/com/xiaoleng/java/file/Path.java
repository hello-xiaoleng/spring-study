package com.xiaoleng.java.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author chen jia
 * @date 2020/1/8 9:51
 */
public class Path {

    public static void main(String[] args) throws IOException {
        java.nio.file.Path p1 = Paths.get("12344", "project", "study");
        System.out.println(p1);
        java.nio.file.Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
        java.nio.file.Path p3 = p2.normalize();
        System.out.println(p3);
        File f = p3.toFile();
        System.out.println(f);
        for (java.nio.file.Path p : Paths.get("..").toAbsolutePath()) {
            System.out.println("  " + p);
        }
    }


}
