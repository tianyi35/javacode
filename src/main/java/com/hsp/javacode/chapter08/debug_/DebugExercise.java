package com.hsp.javacode.chapter08.debug_;

/**
 * Description: debug对象创建过程，加深对调试的理解
 * Author: Lixp
 * Date: 2023-02-07 14:50
 * Version 1.0
 */
public class DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //1.加载Person类信息
        //2.初始化2.1默认初始化，2.2显式初始化 2.3构造初始化
        //3.返回对象的地址

        Person jack = new Person("jack", 30);
        System.out.println(jack);

    }
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
