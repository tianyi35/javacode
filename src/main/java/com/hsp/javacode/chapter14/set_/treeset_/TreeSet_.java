package com.hsp.javacode.chapter14.set_.treeset_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 10:35
 * Version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //默认构造方法无排序
        /*TreeSet treeSet = new TreeSet();
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");*/

        //调用有比较的构造方法（调用String类的compareTo方法进行排序）
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println("treeset=" + treeSet);
    }
}
