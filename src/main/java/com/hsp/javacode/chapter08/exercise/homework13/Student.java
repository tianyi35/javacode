package com.hsp.javacode.chapter08.exercise.homework13;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 14:44
 * Version 1.0
 */
public class Student extends Person {

    private String stu_id;

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return this.getName() + "爱玩足球";
    }

    public void printInfo() {
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stu_id);
        study();
        System.out.println(play());
    }

    public Student() {
    }

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                "} " + super.toString();
    }
}
