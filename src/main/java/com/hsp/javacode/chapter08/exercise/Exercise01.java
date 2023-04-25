package com.hsp.javacode.chapter08.exercise;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-08 15:26
 * Version 1.0
 */
public class Exercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 50, "teacher");
        Person person2 = new Person("tom", 10, "student");
        Person person3 = new Person("lily", 40, "worker");

        Person[] persons = {
                person1, person2, person3
        };

        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[i].getAge() > persons[i + 1].getAge()) {
                    temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
    }
}

class Person {

    private String name;
    private int age;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
