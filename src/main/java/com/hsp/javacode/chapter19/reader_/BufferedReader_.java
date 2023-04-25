package com.hsp.javacode.chapter19.reader_;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-31 15:15
 * Version 1.0
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {


        //创建BufferedReader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\Hello.java"));

        //读取
        String strLine;//按行读取，效率高

        //bufferedReader.readLine()是按行读取文件
        //当返回null时，表示文件读取完毕
        while ((strLine = bufferedReader.readLine()) != null) {
            System.out.println(strLine);
        }
        //关闭流，只需要关闭BufferedReader,因为底层会自动关闭节点流
        bufferedReader.close();
    }
}
