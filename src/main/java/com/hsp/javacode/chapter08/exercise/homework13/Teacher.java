package com.hsp.javacode.chapter08.exercise.homework13;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 14:51
 * Version 1.0
 */
public class Teacher extends Person {
    private int work_age;

    public void teach() {
        System.out.println("我承诺，我会好好教学");
    }

    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄："+work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String play() {
        return this.getName() + "爱玩象棋";
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public Teacher() {
    }

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                "} " + super.toString();
    }
}
