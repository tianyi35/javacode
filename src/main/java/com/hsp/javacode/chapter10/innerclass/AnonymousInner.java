package com.hsp.javacode.chapter10.innerclass;

/**
 * Description: 匿名内部类--基于接口的匿名内部类
 * Author: Lixp
 * Date: 2023-02-20 15:16
 * Version 1.0
 */
public class AnonymousInner {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.method();

    }

}

class Outer03 {//外部类

    private int n1 = 10;//属性

    public void method() {//方法
        //基于接口的匿名内部类
        //1.需求：想使用IA接口，并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        /**
         * class Tiger implements IA {
         *     @Override
         *     public void cry() {
         *        System.out.println("老虎在叫...");
         *     }
         * }
         */
        //3.老韩需求是Tiger类只是使用一次,后面再不使用
        //4.可以使用匿名内部类来简化开发
        /**
         * IA tiger = new IA() {
         *             @Override
         *             public void cry() {
         *                 System.out.println("老虎在叫...");
         *             }
         *         };
         */
        //5.tiger的编译类型=IA
        //6.tiger的运行类型，就是匿名内部类 XXXX=>Outer03$1
        /**
            我们看底层
            class XXXX  implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎在叫...");
                }
            }
         *
         */
        //7.jdk底层在创建匿名内部类Outer03$1，立马创建了Outer03$1实例，并且把地址返回给tiger
        //8.匿名内部类使用一次就不能再使用了，
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎在叫...");
            }
        };
        tiger.cry();
        //建匿名内部类Outer03$1的实例，可以多次使用
        System.out.println(tiger.getClass());


        //IA tiger = new Tiger();
        //tiger.cry();

    }

}

interface IA {//接口

    public void cry();
}

class Tiger implements IA {
    @Override
    public void cry() {
       // System.out.println("老虎在叫...");
    }
}
