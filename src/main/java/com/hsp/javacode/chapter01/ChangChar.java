package com.hsp.javacode.chapter01;

/**
 * Description: 转义字符的使用
 * Author: Lixp
 * Date: 2023-01-13 9:29
 * Version 1.0
 */
public class ChangChar {
    public static void main(String[] args) {
        //  \t是制表符，如果前面输出的内容是8的倍数，则\t将输出8个空格；如果不是，则补齐为8的倍数。
        System.out.println("北京\t上海\t天津");
        //   \n换行符
        System.out.println("java\nsmith\nmary");
        //  \\ 一个\
        System.out.println("C:\\Windows\\System32\\cmd.exe");
        // \"  一个“
        System.out.println("老韩说：\"要好好学习java，有前途\"");
        // \‘  一个’
        System.out.println("老韩说：\'要好好学习java，有前途\'");
        //  \r 一个回车
        /**
         * 解读
         * 1.输出 韩顺平教育
         * 2.\r表示回车
         * 3.输出北京
         */
        System.out.println("韩顺平教育\r北京");


        //  \r\n 一个回车
        /**
         * 解读
         * 1.输出 韩顺平教育
         * 2.表示回车+换行
         * 3.输出北京
         */
        System.out.println("韩顺平教育\r\n北京");



        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t1000\t1200");


        char c3='9';
        System.out.println(c3);
        System.out.println("100"+98);
        System.out.println(100+3+"hello");
        System.out.println("hello"+100+3);


        int n1=10;
    }
}
