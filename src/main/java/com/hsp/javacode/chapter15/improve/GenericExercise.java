package com.hsp.javacode.chapter15.improve;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 11:07
 * Version 1.0
 */

@SuppressWarnings("all")
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(new Student("jack"));
        hashSet.add(new Student("lucy"));
        hashSet.add(new Student("tom"));

        System.out.println("=====hashSet第一种遍历========");
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("hashSet=" + iterator.next().getName());
        }
        System.out.println("=====hashSet第二种遍历========");
        for (Student s : hashSet) {
            System.out.println("hashSet=" + s.getName());
        }

        HashMap<String, Student> hashMap = new HashMap<>();
        Student s1 = new Student("jack");
        Student s2 = new Student("lucy");
        Student s3 = new Student("tom");
        hashMap.put(s1.getName(), s1);
        hashMap.put(s2.getName(), s2);
        hashMap.put(s3.getName(), s3);

        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        System.out.println("=====hashMap第一种遍历========");
        for (Map.Entry e : entries) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }

        System.out.println("=====hashMap第二种遍历========");
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.println(s + "-" + hashMap.get(s));
        }

    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
