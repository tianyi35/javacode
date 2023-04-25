package com.hsp.javacode.chapter01;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-28 14:42
 * Version 1.0
 */
public class MulForExercise04 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("i=" + i);
                break;
            }
        }
    }
}
