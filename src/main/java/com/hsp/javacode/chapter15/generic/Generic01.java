package com.hsp.javacode.chapter15.generic;

import java.util.ArrayList;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 10:00
 * Version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        //传统方法来解决
        ArrayList list = new ArrayList();
        list.add(new Dog("旺财", 10));
        list.add(new Dog("发财", 1));
        list.add(new Dog("小黄", 5));

        //假如程序员不小心添加了一只猫


        //Exception in thread "main" java.lang.ClassCastException
        //传统方法会出现运行时异常
        //Exception in thread "main" java.lang.ClassCastException
        list.add(new Cat("招财猫", 8));

        for (Object o : list) {
            Dog dog = (Dog) o;
            System.out.println(((Dog) o).getName() + "-" + dog.getAge());
        }


    }

}


class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

class Cat {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}