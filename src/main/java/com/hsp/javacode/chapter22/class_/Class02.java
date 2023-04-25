package com.hsp.javacode.chapter22.class_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-04-12 9:42
 * Version 1.0
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException {

        String classAllPath = "com.hsp.javacode.chapter22.class_.Car";
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);
        System.out.println(cls.getClass());
    }
}
