package com.hsp.javacode.chapter15.homework;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 14:38
 * Version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("tom", 20000.0, new MyDate(2000, 11, 11)));
        list.add(new Employee("jack", 12000.0, new MyDate(2001, 12, 12)));
        list.add(new Employee("hsp", 50000.0, new MyDate(1980, 10, 10)));
        list.add(new Employee("tom", 10000.00, new MyDate(2000, 11, 10)));
        System.out.println("原始list=" + list);

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName())) {
                    //name相同就比较日期
                    //下面是对birthday的比较，因此，我们最好把这个比较放在MyDate类完成
                    //封装性和可维护性增强
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("排序后list=" + list);
    }
}

class Employee {
    private String name;
    private Double sal;
    private MyDate birthday;

    public Employee(String name, Double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}

class MyDate implements Comparable<MyDate> {
    private Integer year;
    private Integer month;
    private Integer day;

    public MyDate(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = this.year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果year相同，就比较month
        int monthMinus = this.month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果month相同，就比较day
        return this.day - o.getDay();

    }
}