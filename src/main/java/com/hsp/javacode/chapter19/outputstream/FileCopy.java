package com.hsp.javacode.chapter19.outputstream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-30 16:37
 * Version 1.0
 */
public class FileCopy {

    /**
     * 完成文件拷贝
     */
    @Test
    public void copyFile() {
        String srcFilePath = "d:\\fgj.jpg";
        String destFilePath = "d:\\fgj2.jpg";
        //创建文件输入流对象，完成文件的读取
        //创建文件输出流对象，完成文件的创建
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream= new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //创建字节数组，用于读取文件,提高读取效率
            byte[] buf = new byte[1024];
            //每次读取的字节长度
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读到后，就写入，一边读一边写
                fileOutputStream.write(buf, 0, readLen);//读多少长度字节，就写入多少长度字节
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭输入流和输出流
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
