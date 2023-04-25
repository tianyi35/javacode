package com.hsp.javacode.chapter10.innerclass;

/**
 * Description: 局部内部类
 * Author: Lixp
 * Date: 2023-02-20 14:30
 * Version 1.0
 */
public class LocalInner {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println(outer02);
    }


}

class Outer02 {
    private int n1 = 100;

    private void m2() {

    }

    public void m1() {
        final class Inner02 {
            private int n1 = 800;

            public void f1() {
                System.out.println("f1");
                System.out.println("n1=" + n1 + "外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer02.this hashCode=" + Outer02.this);
                m2();
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();

    }
}

