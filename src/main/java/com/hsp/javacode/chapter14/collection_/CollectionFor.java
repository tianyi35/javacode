package com.hsp.javacode.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-01 11:04
 * Version 1.0
 */
public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        Collection col = new ArrayList();
        col.add(new Person("三国演义", "罗贯中", 10.2));
        col.add(new Person("小李飞刀", "古龙", 5.1));
        col.add(new Person("红楼梦", "曹雪芹", 34.1));
        col.add("ddd");

        //1.使用增强for循环
        //2.底层仍然是迭代器
        //3.增强for循环可以理解成就是简化版的迭代器遍历
        for (Object b : col) {
            System.out.println("person=" + b);
        }

    }
}
