package com.hsp.desing_.single_;

/**
 * Description: 【单例模式-懒汉式】
 * Author: Lixp
 * Date: 2023-02-17 10:05
 * Version 1.0
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat c = Cat.getInstance();
        System.out.println(c);

        Cat c2 = Cat.getInstance();
        System.out.println(c2);
    }
}

//希望在程序运行过程中，只能创建一个Cat对象
//单例模式
class Cat {

    private String name;

    //如何保证我们只能创建一个 Cat
    //步骤【单例模式-懒汉式】
    //1.将构造器私有化（防止在类的外部）
    private Cat(String name) {
        this.name = name;
    }

    //2.在类的内部直接创建(为了能够在静态方法中返回girlFriend对象，需要将其修饰为static)
    //懒汉式
    private static Cat cat;

    //3.提供一个公共的static(不需要new,直接通过类调用)方法，返回cat对象
    //4.懒汉式,只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象，
    //从向保证了单例
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
