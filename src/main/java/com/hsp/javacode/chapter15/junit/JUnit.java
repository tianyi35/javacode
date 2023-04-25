package com.hsp.javacode.chapter15.junit;


import org.junit.jupiter.api.Test;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-10 10:38
 * Version 1.0
 */
public class JUnit {
    public static void main(String[] args) {

        //传统方式
        //new JUnit().m1();
        //new JUnit().m2();


    }


   @Test
    void m1() {
        System.out.println("m1方法被调用");
    }
    @Test
    public void m2() {
        System.out.println("m2方法被调用");
    }
}
