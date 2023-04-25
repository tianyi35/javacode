package com.hsp.javacode.chapter07;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-31 11:01
 * Version 1.0
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("传入的斐波纳契数=" + a.fibonacci(7));
        System.out.println("最初共有桃子数=" + a.peach(1));
        a.peach(10);
    }
}

class A {

    /**
     * 斐波那契
     *
     * @param n
     * @return
     */
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("请输入n>=1的整数");
            return -1;
        }
    }

    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        }else{
            System.out.println("day在1-10之间");
            return -1;
        }
    }
}