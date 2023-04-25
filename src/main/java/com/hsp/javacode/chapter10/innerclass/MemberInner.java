package com.hsp.javacode.chapter10.innerclass;

/**
 * Description:成员内部类
 * Author: Lixp
 * Date: 2023-02-21 10:36
 * Version 1.0
 */
public class MemberInner {
    public static void main(String[] args) {
        //调用成员内部类
        Outer05 outer05 = new Outer05();
        Outer05.Inner05 inner05 = outer05.new Inner05();
        inner05.say();
    }
}

class Outer05 {//外部类
    private int n1=100;

    public void m1() {

    }

    class Inner05 {//成员内部类
        private int n2 = 200;
        public void say() {
            System.out.println("Inner say()");
        }
    }

}
