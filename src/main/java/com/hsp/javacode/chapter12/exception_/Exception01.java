package com.hsp.javacode.chapter12.exception_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-23 17:10
 * Version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
       // int c = a / b;//会抛出 ArithmeticException

        try {
            int c = a / b;
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行....");
    }
}
