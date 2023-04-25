package com.hsp.javacode.chapter01;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-28 13:49
 * Version 1.0
 */
public class MulForExercise03 {
    public static void main(String[] args) {

        int num = 0;
        int count = 0;
        do {
            num = (int) (Math.random() * 100) + 1;
            count++;
            System.out.println(num);
        }
        while (num != 97);
        System.out.println("x循环的次数：" + count);
    }
}
