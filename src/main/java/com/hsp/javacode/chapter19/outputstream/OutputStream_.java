package com.hsp.javacode.chapter19.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-30 16:15
 * Version 1.0
 */
public class OutputStream_ {

    /**
     * 演示使用FileOutputStream 将数据写入到文件中
     * 如果文件不存在，则创建
     */
    @Test
    public void writeFile() {
        //创建FileOutputStream对象
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            // fileOutputStream = new FileOutputStream(filePath,true); true表示追加写入
            fileOutputStream = new FileOutputStream(filePath);
           // fileOutputStream.write('H');
           // String str = "hello,world";
            //getBytes() 字符串-->字节数组
           // fileOutputStream.write(str.getBytes());

            String str1 = "hsp,world";
            //public void write(byte b[], int off, int len)
            fileOutputStream.write(str1.getBytes(), 0, str1.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
