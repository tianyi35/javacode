package com.hsp.javacode.chapter14.map_;

import java.util.Properties;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 10:04
 * Version 1.0
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john", 100);
        //properties.put(null, 100);
        //properties.put("john", null);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);
        System.out.println(properties);

        System.out.println(properties.get("lic"));
    }
}
