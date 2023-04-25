package com.hsp.javacode.chapter01;

import java.util.Scanner;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-28 10:55
 * Version 1.0
 */
public class MulForExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int passSum = 0;
        for (int i = 1; i <= 3; i++) {
            double sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩");
                double score = scanner.nextDouble();
                sum += score;
                if (score >= 60) {
                    passSum++;
                }
                System.out.println("成绩为：" + score);
            }
            System.out.println("sum=" + sum + "平均分=" + (sum / 5));
            totalScore = +sum;
        }
        System.out.println("三个班的总分=" + totalScore + "平均分=" + (totalScore / (3 * 5)));
        System.out.println("及格人数=" + passSum);
    }
}
