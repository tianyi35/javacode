package com.hsp.javacode.chapter23.java8.stream;

import com.hsp.javacode.chapter23.java8.data.Employee;
import com.hsp.javacode.chapter23.java8.data.EmployeeData;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-04-14 16:18
 * Version 1.0
 */
public class StreamAPITest1 {

    //1-筛选与切片
    @Test
    public void test1() {
        // filter(Predicate p)--接收 Lambda，从流中排除某些元素
        //练习：查询员工表中薪资大于7000的员工信息
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(employee -> employee.getSalary() > 7000).forEach(System.out::println);
        System.out.println();

        //limit(n)--截断流，使其元素不超过给定数量
        //错误的，因为stream已经执行了终止操作，就不可以再调用其它的中间操作或终止操作了
        //stream.limit(2).forEach(System.out::println);
        list.stream().limit(4).forEach(System.out::println);
        System.out.println();

        //skip(n)--跳过元素，返回一个扔掉了前n个元素的流，若流中元素不足n个，则返回一个空流
        list.stream().skip(5).forEach(System.out::println);
        System.out.println();

        //distinct()--筛选,通过流所生成的hashCode()和equal()去除重复元素
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.add(new Employee(1009, "马斯克", 40, 12500.32));
        list.stream().distinct().forEach(System.out::println);
    }

    //2-映射
    @Test
    public void test2() {
        //map(Function f)--接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上
        //练习：转换为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        //方式1
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        //方式2
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println();

        //练习：获取员工姓名长度大于3的员工
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().filter(employee -> employee.getName().length() > 3).forEach(System.out::println);
        System.out.println();

        //练习：获取员工姓名长度大于3的员工的姓名
        employees.stream().filter(employee -> employee.getName().length() > 3).map(employee -> employee.getName()).forEach(System.out::println);
        employees.stream().map(employee -> employee.getName()).filter(name -> name.length() > 3).forEach(System.out::println);

    }

    //3--排序
    @Test
    public void test3() {
        //sorted()--自然排序
        Integer[] arr = new Integer[]{345, 64, 3, 46, 7, 3, 34, 65, 68};
        String[] arr1 = new String[]{"GG", "MM", "SS", "JJ"};
        Arrays.stream(arr).sorted().forEach(System.out::println);
        Arrays.stream(arr1).sorted().forEach(System.out::println);

        //sorted(Comparator com)定制排序
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).forEach(System.out::println);

        //针对于字符串从大到小排序
        Arrays.stream(arr1).sorted((s1, s2) -> -s1.compareTo(s2)).forEach(System.out::println);

    }
}
