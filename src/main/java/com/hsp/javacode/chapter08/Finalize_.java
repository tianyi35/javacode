package com.hsp.javacode.chapter08;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-07 14:06
 * Version 1.0
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car = null;
        System.gc();

        System.out.println("程序退出了...");

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("调用finalize方法...");
        System.out.println("释放了一些资源...");
    }
}
