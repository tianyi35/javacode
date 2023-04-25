package com.hsp.javacode.chapter14.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-07 10:45
 * Version 1.0
 */
@SuppressWarnings("all")
public class MapFor {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王富强", "玛丽");
        map.put("灯江", "玛丽");
        map.put("刘今", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "柘城");

        //遍历map的方式
        //第一组，把所有的key取出
        Set set = map.keySet();
        System.out.println("------第1种方式-------");
        //(1)增强for
        for (Object obj : set) {
            System.out.println(obj + "-" + map.get(obj));
        }
        System.out.println("------第2种方式-------");
        //(2)iterator
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组，把所有的values取出
        Collection values = map.values();
        System.out.println("------取出所有的value增强for -------");
        //(1)增强for
        for (Object value : values) {
            System.out.println("value=" + value);
        }
        System.out.println("------取出所有的value  iterator-------");
        //(2)iterator
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println("value=" + value);
        }

        //第三组，通过EntrySet取出
        Set entrySet = map.entrySet();//Set<Map.Entry<K, V>>
        //(1)增强for
        System.out.println("------使用EntrySet的 增强for(第3种)-------");
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println("------使用EntrySet的  iterator(第4种)-------");
        //(2)iterator
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry m =(Map.Entry) iterator2.next();
            System.out.println(m.getKey() + "-" + m.getValue());
        }


    }
}
