package com.hsp.javacode.chapter23.java8.stream;

import com.hsp.javacode.chapter23.java8.data.Employee;
import com.hsp.javacode.chapter23.java8.data.EmployeeData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description: 测试Stream的终止操作
 * Author: Lixp
 * Date: 2023-04-14 17:21
 * Version 1.0
 */
public class StreamAPITest2 {
    //1-匹配与查找
    @Test
    public void test1() {
        //allMatch(Predicate p)-->检查是否匹配所有元素
        //练习：是否所有员工的年龄都大于18
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().allMatch(employee -> employee.getAge() > 18));

        //练习：是否存在员工的年龄都大于18
        System.out.println(employees.stream().anyMatch(employee -> employee.getAge() > 18));

        //练习：是否存在员工的工资大于10000
        System.out.println(employees.stream().anyMatch(employee -> employee.getSalary() > 10000));

        //findFirst-返回第一个元素
        System.out.println(employees.stream().findFirst().get());
    }

    @Test
    public void test2() {
        List<Employee> list = EmployeeData.getEmployees();
        //count--返流中元素的总个数
        System.out.println(list.stream().filter(employee -> employee.getSalary() > 7000).count());

        //max(Comparator c)-返回流中最大值
        //返回流中最高工资的员工
        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));

        //返回流中最高工资
        //方式1：
        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get().getSalary());
        //方式2：
        System.out.println(list.stream().map(emp -> emp.getSalary()).max((salary1, salary2) -> Double.compare(salary1, salary2)).get());
        System.out.println(list.stream().map(emp -> emp.getSalary()).max(Double::compare).get());

        //返回流中最低工资的员工
        // list.stream().min
        System.out.println(list.stream().map(employee -> employee.getSalary()).min(Double::compare).get());
        System.out.println(list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));

        //forEach(Consumer c)--内部迭代
        list.stream().forEach(System.out::println);

        //针对集合，jdk8中也增加了一个遍历的方法
        list.forEach(System.out::println);

        //针对List来说，遍历的方式：①使用Iterator ②增加for ③一般for ④forEach
    }

    //2--归约（递归）
    @Test
    public void test3() {
        //reduce(T identity,BinaryOperator)--可以将流中元素反复结合起来，得到一个值，返回T
        //练习：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().reduce(0, (x1, x2) -> x1 + x2));
        System.out.println(list.stream().reduce(0, (x1, x2) -> Integer.sum(x1, x2)));
        System.out.println(list.stream().reduce(0, Integer::sum));

        System.out.println(list.stream().reduce(10, (x1, x2) -> x1 + x2));

        //reduce(BinaryOperator)--可以将流中元素反复结合起来，得到一个值，返回Optional<T>
        //练习：计算公司所有员工工资的总和
        List<Employee> employeeList = EmployeeData.getEmployees();
        System.out.println(employeeList.stream().map(employee -> employee.getSalary()).reduce(0.0, (salary1, salary2) -> salary1 + salary2));
        System.out.println(employeeList.stream().map(employee -> employee.getSalary()).reduce(Double::sum));
    }

    //3--收集
    @Test
    public void test4() {
        //collect(Collector c)--将流转换为其他形式，接收一个Collection接口的实现，用于给Stream中元素做汇总的方法
        //练习：查找工资大于6000的员工，结果返回为一个List或Set

        List<Employee> list = EmployeeData.getEmployees();
        List<Employee> list1 = list.stream().filter(employee -> employee.getSalary() > 6000).collect(Collectors.toList());
        list1.forEach(System.out::println);
        System.out.println("----------");
        list.forEach(System.out::println);

        System.out.println("----按照员工的年龄进行排序------");
        //练习：按照员工的年龄进行排序，返回一个新的List中
        List<Employee> list2 = list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
    }

}
