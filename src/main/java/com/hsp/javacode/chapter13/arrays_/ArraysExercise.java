package com.hsp.javacode.chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-28 9:44
 * Version 1.0
 */
public class ArraysExercise {

    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃", 300);


        //price从大到小排
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double price = o1.getPrice() - o2.getPrice();
                if (price > 0) {
                    return 1;
                } else if (price < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //按照书名的长度来排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int n1 = o2.getName().length() - o1.getName().length();
                if (n1 > 0) {
                    return 1;
                } else if (n1 < 0) {
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(books));

    }

}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
