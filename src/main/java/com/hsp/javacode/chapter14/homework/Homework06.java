package com.hsp.javacode.chapter14.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 16:34
 * Version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);
        System.out.println("set=" + set);
        p1.setName("CC");
        System.out.println("set=" + set);
        //不能删除p1,因为p1在添加到set时，是通过p1 = new Person(1001, "AA")来确定在table中索引位置
        //在 p1.setName("CC")后，p1内容发生了变化，所有无法定位到table中原来的（p1 = new Person(1001, "AA")）索引位置
        set.remove(p1);
        System.out.println("set=" + set);
        set.add(new Person(1001, "CC"));
        System.out.println("set=" + set);


        set.add(new Person(1001, "AA"));
        System.out.println("set=" + set);
    }
}

class Person {

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
