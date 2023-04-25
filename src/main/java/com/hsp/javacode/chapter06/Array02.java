package com.hsp.javacode.chapter06;

import java.util.Scanner;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-29 10:01
 * Version 1.0
 */
public class Array02 {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);//true
        System.out.println(a.equals(b));


        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);//false
        System.out.println(c.equals(d));
        Integer j = new Integer(129);
        System.out.println(j.equals(129));

        double[] scores = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + i + "个元素的值");
            scores[i] = scanner.nextDouble();
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + i + "个元素的值为：" + scores[i]);
        }
    }
}
