package com.hsp.javacode.chapter01;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-28 11:00
 * Version 1.0
 */
public class MulForExercise02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            if (i != 9) {
                System.out.println();
            }
        }
    }
}
