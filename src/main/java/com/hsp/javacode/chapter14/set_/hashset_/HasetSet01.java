package com.hsp.javacode.chapter14.set_.hashset_;


import java.util.HashSet;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-03 11:26
 * Version 1.0
 */
@SuppressWarnings("all")
public class HasetSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        set.remove("john");
        System.out.println("set=" + set);


        set = new HashSet();
        System.out.println("set=" + set);
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set=" + set);

        //再加深一下，非常经典的面试题
        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//no 加入不了，看源码来分析,即add到底发生了什么？=》底层机制
        System.out.println("set=" + set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
