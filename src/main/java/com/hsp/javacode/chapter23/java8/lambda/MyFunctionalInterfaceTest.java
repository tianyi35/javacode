package com.hsp.javacode.chapter23.java8.lambda;

import org.junit.jupiter.api.Test;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-04-14 9:26
 * Version 1.0
 */
public class MyFunctionalInterfaceTest {

    @Test
    public void test01() {
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("hello");
        myFunctionalInterface.method();
    }
}
