package com.hsp.javacode.chapter15.improve;

import com.hsp.javacode.chapter15.generic.Generic01;

import java.util.ArrayList;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 10:20
 * Version 1.0
 */
@SuppressWarnings("all")
public class Generic02 {
    public static void main(String[] args) {
        //传统方法来解决====>泛型
        //表示存放到ArrayList集合中的元素是Dog类型
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("旺财", 10));
        list.add(new Dog("发财", 1));
        list.add(new Dog("小黄", 5));
        //假如程序员不小心添加了一只猫
        //list.add(new Cat("招财猫", 8));

        //遍历时，可以直接取出Dog类型而不是Object
        for (Dog dog : list) {
            System.out.println(dog.getName() + "-" + dog.getAge());
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