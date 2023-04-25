package com.hsp.javacode.chapter08.debug_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-07 14:22
 * Version 1.0
 */
public class Debug01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);
        }
        System.out.println("退出for....");
    }
}
