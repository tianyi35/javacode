package com.hsp.javacode.chapter14.set_.hashset_;

import java.util.HashSet;

/**
 * Description: HashSet添加元素底层实现（hasp()+equal()）
 * Author: Lixp
 * Date: 2023-03-03 16:45
 * Version 1.0
 */
public class HashSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);
    }
}
