package com.hsp.javacode.chapter14.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 11:03
 * Version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
       /* TreeMap treeMap = new TreeMap();
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");*/

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
                 //return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("lucy", "露西");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");

        System.out.println("treeMap=" + treeMap);
    }
}
