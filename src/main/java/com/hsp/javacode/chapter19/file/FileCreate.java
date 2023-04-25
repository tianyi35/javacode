package com.hsp.javacode.chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-30 14:24
 * Version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01() {

        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02() {
        File file = new File("d:\\", "news2.txt");//在内存中创建文件对象
        try {
            file.createNewFile();//真正在磁盘上创建文件
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
