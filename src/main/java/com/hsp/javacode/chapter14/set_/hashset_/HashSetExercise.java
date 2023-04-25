package com.hsp.javacode.chapter14.set_.hashset_;

import java.util.HashSet;
import java.util.Objects;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-06 15:42
 * Version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 18));
        hashSet.add(new Employee("smith", 28));
        hashSet.add(new Employee("jack", 18));
        System.out.println("hashSet=" + hashSet);
    }
}

class Employee {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

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

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

