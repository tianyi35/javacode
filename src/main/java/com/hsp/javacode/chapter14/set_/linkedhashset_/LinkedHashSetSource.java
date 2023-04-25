package com.hsp.javacode.chapter14.set_.linkedhashset_;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-06 16:35
 * Version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘", 1001));
        set.add(123);
        set.add("HSP");
        System.out.println("set=" + set);

    }
}

class Customer {
    private String name;
    private Integer card;

    public Customer(String name, Integer card) {
        this.name = name;
        this.card = card;
    }
}
