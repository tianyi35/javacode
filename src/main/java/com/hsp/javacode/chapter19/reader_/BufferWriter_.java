package com.hsp.javacode.chapter19.reader_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-31 15:26
 * Version 1.0
 */
public class BufferWriter_ {
    public static void main(String[] args) throws IOException {

        String filePath = "d:\\ok.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        bufferedWriter.write("hsh,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hsh,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hsh,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hsh,韩顺平教育");

        bufferedWriter.close();
    }
}
