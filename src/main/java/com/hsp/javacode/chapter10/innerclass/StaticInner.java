package com.hsp.javacode.chapter10.innerclass;

/**
 * Description: 静态内部类
 * Author: Lixp
 * Date: 2023-02-21 10:42
 * Version 1.0
 */
public class StaticInner {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.m2();

        Outer06.Inner06 inner06 = new Outer06.Inner06();
        inner06.say();

    }
}

class Outer06 {
    private int n1 = 200;

    private static String name = "jack";


    //静态内部类，用static修饰

    static class Inner06 {

        public void say() {
            System.out.println("Outer.name=" + name);
        }
    }

    public void m2() {
        Inner06 inner06 = new Inner06();
        inner06.say();
    }

}
