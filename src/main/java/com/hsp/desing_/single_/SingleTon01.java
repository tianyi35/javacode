package com.hsp.desing_.single_;

/**
 * Description: 【单例模式-饿汉式】
 * Author: Lixp
 * Date: 2023-02-17 9:40
 * Version 1.0
 */
public class SingleTon01 {
    public static void main(String[] args) {
        //GirlFriend xh = new GirlFriend("小红");
        //GirlFriend xm = new GirlFriend("小梅");
        GirlFriend gf1 = GirlFriend.getInstance();
        GirlFriend gf2 = GirlFriend.getInstance();
        System.out.println(gf1 == gf2);
    }

}

class GirlFriend {
    private String name;


    //如何保证我们只能创建一个 GirlFriend
    //步骤【单例模式-饿汉式】
    //1.将构造器私有化（防止在类的外部）
    private GirlFriend(String name) {
        this.name = name;
    }

    //2.在类的内部直接创建(为了能够在静态方法中返回girlFriend对象，需要将其修饰为static)
    //饿汉式，还没有用类时，对象就已经创建了，所以叫饿汉式
    private static GirlFriend girlFriend = new GirlFriend("小红红");

    //3.提供一个公共的static(不需要new,直接通过类调用)方法，返回girlFriend对象
    public static GirlFriend getInstance() {
        return girlFriend;
    }

}
