package com.hsp.javacode.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-01 10:42
 * Version 1.0
 */
public class CollectionIterator {

    public static void main(String[] args) {

        Collection col = new ArrayList();
        col.add(new Person("三国演义","罗贯中",10.2));
        col.add(new Person("小李飞刀","古龙",5.1));
        col.add(new Person("红楼梦","曹雪芹",34.1));

        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while遍历循环（快捷键ctrl+j）
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("======增强for循环======");
        for (Object o1: col
             ) {
            System.out.println(o1);
        }
        //3.当退出while循环后，这时iterator迭代器,指向最后的元素,
        //会报NoSuchElementException
        //iterator.next();
        //4.如果需要再次遍历，需要重置我们的迭代器
        iterator = col.iterator();

        System.out.println("======重置迭代器======");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}

class Person {
    private String name;
    private String author;
    private Double price;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Person(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}