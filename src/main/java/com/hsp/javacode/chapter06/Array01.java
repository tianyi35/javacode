package com.hsp.javacode.chapter06;

/**
 * Description: 数组的引出
 * Author: Lixp
 * Date: 2023-01-29 9:19
 * Version 1.0
 */
public class Array01 {
    public static void main(String[] args) {
        char c = '在';

        double[] hens = {3, 5, 1, 3.4, 2, 50};

        System.out.println("=======使用数组解决=======");
        System.out.println("数组的长度=" + hens.length);
        double totalHeight = 0;
        for (int i = 0; i < hens.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值是：" + hens[i]);
            totalHeight += hens[i];
        }
        System.out.println("总重量是：" + totalHeight);
        System.out.println("平均重量是：" + totalHeight / hens.length);
    }
}
