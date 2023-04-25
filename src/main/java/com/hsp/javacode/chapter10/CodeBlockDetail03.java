package com.hsp.javacode.chapter10;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-21 16:02
 * Version 1.0
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB b = BBB.bbb;
        //  BBB v = b.bbb;
    }
}

class AAA {
    static {
        System.out.println("AAA的静态代码块被调用");
    }

    {
        System.out.println("AAA的普通代码块被调用");
    }

    AAA() {
        System.out.println("AAA() 构造器被调用");
    }
}

class BBB extends AAA {
    static {
        System.out.println("BBB的静态代码块被调用");
    }

    public static BBB bbb = new BBB();

    {
        System.out.println("BBB的普通代码块被调用");
    }

    BBB() {
        System.out.println("BBB() 构造器被调用");

    }
}
