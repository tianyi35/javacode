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
public class LambdaTest {

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

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("如果大家可以重来，你最想重来的事是啥？");
        System.out.println("*****************");
        //Lambda表达式写法
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("谈一场轰轰烈烈的爱情");
    }

    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("世界那么大，我想去看看");
        System.out.println("*****************");
        //Lambda表达式写法
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("世界那么大，我想去看看");
    }

    //语法格式五：Lambda 需要两个或两个以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5() {

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("*****************");
        //Lambda表达式写法
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12, 21));
    }

    //语法格式六：当Lambda 体只有一条语句时，return与大括号若有，都可以省略
    @Test
    public void test6() {

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("*****************");
        //Lambda表达式写法
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);

        System.out.println(com2.compare(12, 21));
    }
}
