package com.hsp.javacode.chapter10.innerclass;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-20 14:05
 * Version 1.0
 */
public class InnerClass01 {//外部其它类
    public static void main(String[] args) {

    }
}

//外部类
class Outer {
    private int n1 = 100;//属性

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1() {//方法
        System.out.println("方法");
    }

    {//代码块
        System.out.println("代码块");
    }

    class Inner {//内部类，在Outer类的内部

    }
}
