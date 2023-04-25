package com.hsp.javacode.chapter13.wrapper_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-24 15:16
 * Version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //jdk5前是手动装箱和拆箱

        //手动装箱 int-->Integer
        int n1=100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱 Integer-->int
        int i = integer.intValue();


        //jdk5以后是自动装箱和拆箱
        //自动装箱 int-->Integer
        int n2=10;
        //底层使用的是 Integer.valueOf(n2)
        Integer integer2 = n2;

        //自动拆箱 Integer-->int
        //底层使用的是Integer.intValue()方法
        int n3 = integer2;

        Object obj=true?new Integer(1) : new Double(2.0) ;
        System.out.println(obj);
    }
}
