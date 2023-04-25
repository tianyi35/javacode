package com.hsp.javacode.chapter23.java8.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-04-14 15:46
 * Version 1.0
 */
public class EmployeeData {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001, "马化腾", 34, 6000.38));
        list.add(new Employee(1002, "马云", 2, 19876.12));
        list.add(new Employee(1003, "刘强东", 33, 3000.82));
        list.add(new Employee(1004, "雷军", 26, 7657.37));
        list.add(new Employee(1005, "李彦宏", 65, 5555.32));
        list.add(new Employee(1006, "比尔盖茨", 42, 9500.43));
        list.add(new Employee(1007, "任正非", 26, 4333.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));

        return list;
    }
}
