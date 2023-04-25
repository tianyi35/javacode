package com.hsp.javacode.chapter08.exercise.homework13;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 14:52
 * Version 1.0
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public String play() {
        return "";
    }

    public String basicInfo(){
        return "姓名：" + name + "\n年龄:" + age + "\n性别:" + sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
