package com.hsp.javacode.chapter23.java8.lambda;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Description: Lambda表达式的使用举例
 * Author: Lixp
 * Date: 2023-04-13 9:36
 * Version 1.0
 */
public class LambdaTest1 {

    //语法格式一：无参，无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello beijing");
            }
        };
        r1.run();

        System.out.println("*******************");
        //Lambda表达式的写法
        Runnable r2 = () -> {
            System.out.println("hello shanghai");
        };
        r2.run();
    }

    //语法格式二：需要一个参数，无返回值
    @Test
    public void test2() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么");
        System.out.println("*****************");
        //Lambda表达式写法
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是说的人当真了，一个是听的人当真了");

    }
    //语法格式三：数据类型可以省略，因为可由编译器推断得出 称为”类型推断“
    @Test
    public void test3() {

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare = com1.compare(12, 21);
        System.out.println(compare);

        System.out.println("*****************");
        //Lambda表达式写法
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        int compare1 = com2.compare(23, 21);
        System.out.println(compare1);

        System.out.println("*****************");
        //方法引用
        Comparator<Integer> com3 =Integer::compare;
        int compare2 = com3.compare(45, 12);
        System.out.println(compare2);
    }
}
