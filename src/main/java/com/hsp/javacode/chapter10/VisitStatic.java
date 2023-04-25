package com.hsp.javacode.chapter10;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-13 10:05
 * Version 1.0
 */
public class VisitStatic {
    public static void main(String[] args) {
        // 类变量是通过类的加载而创建的，保存在Class类对象中，保存在堆中（jdk7及以上版本）
        System.out.println(A.name);
        System.out.println(new A().name);
    }
}

class A {
    // 类变量
    public static String name = "韩顺平教育";

}
