package com.hsp.javacode.chapter19.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-30 15:38
 * Version 1.0
 */
public class FileInputStream_ {

    @Test
    public void read01() {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将终止
            //如果返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);//转成char显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流,释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    @Test
    public void read02() {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readLen = 0;

        //字节数组,一次读取8个字节
        byte[] buf = new byte[8];
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流最多读取buf.length字节的数据到字节数组，此方法针阻塞，直到某些输入可用
            //如果返回-1，表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));//转成char显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流,释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
