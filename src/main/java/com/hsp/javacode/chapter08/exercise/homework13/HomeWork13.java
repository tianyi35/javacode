package com.hsp.javacode.chapter08.exercise.homework13;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 15:06
 * Version 1.0
 */
public class HomeWork13 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Teacher("张飞", "男", 30, 5);
        persons[1] = new Teacher("李四", "女", 40, 10);
        persons[2] = new Student("小明", "男", 15, "00023102");
        persons[3] = new Student("小李", "女", 19, "00023101");

       // System.out.println(Arrays.toString(persons));

        // 排序
        Person tmp = new Person();
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[i].getAge() < persons[i + 1].getAge()) {
                    tmp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).printInfo();
            }
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).printInfo();
            }
            System.out.println("-------------------------");
        }


    }

}

