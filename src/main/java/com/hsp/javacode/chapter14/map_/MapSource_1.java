package com.hsp.javacode.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-07 15:27
 * Version 1.0
 */
public class MapSource_1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("java", 10);
        map.put("php", 10);
        map.put("java", 20);

        System.out.println("map=" + map);

    }
}
