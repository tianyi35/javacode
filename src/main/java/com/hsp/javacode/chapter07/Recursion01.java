package com.hsp.javacode.chapter07;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-31 9:28
 * Version 1.0
 */
public class Recursion01 {
    public static void main(String[] args) {
        T t = new T();
        t.test(4);
        System.out.println(t.factorial(5));
    }
}

class T {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n=" + n);
    }


    public int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
