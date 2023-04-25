package com.hsp.javacode.chapter23.java8.reference;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * Description: 方法引用
 * Author: Lixp
 * Date: 2023-04-14 9:50
 * Version 1.0
 */
public class MethodRefTest {

    //情况一：对象 :: 实例方法
    @Test
    public void test01() {
        //1,传统方法
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("hello");

        //2,Lambda表达式
        Consumer<String> con2 = (s) -> System.out.println(s);
        con2.accept("hello");

        //3,方法引用
        Consumer<String> con3 = System.out::println;
        con3.accept("hello");
    }

    //情况二：类 :: 静态方法
    @Test
    public void test2() {
        //1,传统方法
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12, 21));

        //2,Lambda表达式
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com2.compare(12, 21));
        //3,方法引用
        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com3.compare(12, 21));
    }

    //3,类 :: 实例方法（难）
    @Test
    public void test3() {
        //1,传统方法
        Comparator<String> com1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare("abc", "abd"));

        //2,Lambda表达式
        Comparator<String> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare("abc", "abb"));

        //3,方法引用
        Comparator<String> com3 = String::compareTo;
        System.out.println(com3.compare("abc", "abb"));
    }

    @Test
    public void test4() {
        //1,匿名内部类
        BiPredicate<String, String> bi1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(bi1.test("a", "b"));

        //2,Lambda表达式
        BiPredicate<String, String> bi02 = (s1, s2) -> s1.equals(2);
        System.out.println(bi02.test("a", "b"));

        //3,方法引用
        BiPredicate<String, String> bi03 = String::equals;
        System.out.println(bi03.test("a", "b"));
    }

}
