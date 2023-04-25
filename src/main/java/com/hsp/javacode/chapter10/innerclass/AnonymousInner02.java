package com.hsp.javacode.chapter10.innerclass;

/**
 * Description: 匿名内部类--基于类的匿名内部类
 * Author: Lixp
 * Date: 2023-02-20 15:16
 * Version 1.0
 */
public class AnonymousInner02 {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}

class Outer04 {//外部类

    private int n1 = 10;//属性

    public void method() {//方法
        //基于类的匿名内部类
        //1.tiger的编译类型=Father
        //2.tiger的运行类型，就是匿名内部类 XXXX=>Outer04$1
        //3.底层会创建匿名内部类
        /*
            我们看底层
            class Outer04$1 extends Father {
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         *
         */
        //4.jdk底层在创建匿名内部类Outer04$1，立马创建了Outer04$1实例，并且把地址返回给father
        //5.匿名内部类使用一次就不能再使用了，
        Father father = new Father("jack") {
            @Override
            public void test() {

                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();
        System.out.println(father.getClass());

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void cry() {

                //System.out.println("小狗在叫");
            }
        };
        animal.cry();
    }

}

class Father {
    private String name;

    public Father(String name) {
        this.name = name;
        System.out.println("接收到name=" + name);
    }

    public void test() {

    }
}

abstract class Animal {
    abstract void cry();
}

