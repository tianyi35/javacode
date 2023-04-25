package com.hsp.javacode.chapter14.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-06 18:57
 * Version 1.0
 */
@SuppressWarnings("all")
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "张无忌");
        map.put(new Car(), new Person());

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("key=" + next);
        }

        System.out.println(keySet.getClass());
        for (Object obj : keySet) {
            System.out.println(obj);
        }
        System.out.println(keySet.getClass());
        Collection collection = map.values();
        System.out.println(collection.getClass());
    }
}

class Car {

}

class Person {

}