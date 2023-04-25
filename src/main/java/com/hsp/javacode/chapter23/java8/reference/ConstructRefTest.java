package com.hsp.javacode.chapter23.java8.reference;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Description: 构造器引用
 * Author: Lixp
 * Date: 2023-04-14 10:42
 * Version 1.0
 */
public class ConstructRefTest {

    //构造器引用-无参
    @Test
    public void test1() {
        //1,传统方法
        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return new String();
            }
        };
        System.out.println(sup1.get());

        //2,构造器引用
        Supplier<String> sup2 = String ::new;
        System.out.println(sup2.get());

    }

    //构造器引用-有参
    @Test
    public void test2() {
        //1,传统方法
        Function<Integer,Integer> fun1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return new Integer(12);
            }
        };
        System.out.println(fun1.apply(12));

        //2,构造器引用
        Function<Integer, Integer> fun2 = Integer::new;
        System.out.println(fun2.apply(12));
    }

    //4,数组引用
    @Test
    public void test4() {
        Function<Integer, List[]> fun1 = new Function<Integer, List[]>() {
            @Override
            public List[] apply(Integer length) {
                return new List[length];
            }
        };
        System.out.println(fun1.apply(12));

        Function<Integer, List[]> fun2 = List[]::new;
        System.out.println(fun2.apply(13));
    }
}
