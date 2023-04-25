package com.hsp.javacode.chapter14.list_;


import java.util.ArrayList;
import java.util.List;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-01 11:50
 * Version 1.0
 */
public class ListExercise02 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义", "罗贯中", 10.2));
        list.add(new Book("小李飞刀", "古龙", 5.1));
        list.add(new Book("红楼梦", "曹雪芹", 34.1));

        System.out.println(list);
        System.out.println("=====排序后======");
        sort(list);
        System.out.println(list);
    }

    //静态方法
    //价格要求是从小到大
    public static void sort(List list) {

        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

}

class Book {
    private String name;
    private String author;
    private Double price;

    public Book(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
