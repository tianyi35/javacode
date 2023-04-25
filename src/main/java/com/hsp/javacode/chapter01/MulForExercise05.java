package com.hsp.javacode.chapter01;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-28 15:02
 * Version 1.0
 */
public class MulForExercise05 {
    public static void main(String[] args) {
        double total = 100000D;
        int count = 0;
        /*
        while (total >= 50000.00) {
            total = total - total * 0.05;
            count++;

        }
        while (total <= 50000.00 && total >= 1000.00) {
            total = total - 1000.00;
            count++;
        }
        System.out.println("经过路口的次数：" + count);
        */

        while (true) {
            if (total > 50000) {
                total *= 0.95;
                count++;
            } else if (total >= 1000) {
                total -= 1000;
                count++;
            } else {
                break;

            }
        }

        System.out.println("经过路口的次数：" + count);
    }
}
