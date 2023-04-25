package com.hsp.javacode.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-06 18:48
 * Version 1.0
 */
@SuppressWarnings("all")
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "韩顺平");
        map.put("no2", "张无忌");
        map.put("no1", "张三丰");
        map.put("no3", "张三丰");
        map.put(null, null);
        map.put(null, "abc");
        map.put("no4", null);
        map.put("no5", null);
        map.put(new Object(), "jinmaoshiw");
        System.out.println("map=" + map);
    }
}
