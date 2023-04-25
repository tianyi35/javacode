package com.hsp.javacode.chapter14.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 16:04
 * Version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {

        Employee e1 = new Employee("jack", 650);
        Employee e2 = new Employee("tom", 1200);
        Employee e3 = new Employee("smith", 2900);

        Map m = new HashMap();
        m.put(e1.getName(), e1.getSalary());
        m.put(e2.getName(), e2.getSalary());
        m.put(e3.getName(), e3.getSalary());
        System.out.println("m=" + m);
        m.put(e1.getName(), 2600);
        System.out.println("m=" + m);

        Set set = m.keySet();

        for (Object obj : set) {
            String name = (String) obj;
            m.put(name, (Integer) m.get(name) + 100);
        }

        System.out.println("m=" + m);
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {

            Map.Entry emp = (Map.Entry) iterator.next();
            System.out.println("员工=" + emp.getKey());
        }

        Collection values = m.values();
        for (Object obj : values) {
            System.out.println("工资=" + obj);
        }

    }
}

class Employee {
    private String name;
    private Integer salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}