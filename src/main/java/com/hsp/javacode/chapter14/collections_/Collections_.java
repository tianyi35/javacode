package com.hsp.javacode.chapter14.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-08 14:31
 * Version 1.0
 */
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        Collections.reverse(list);

        System.out.println("list=" + list);

        Collections.shuffle(list);
        System.out.println("list=" + list);

        Collections.sort(list);
        System.out.println("list=" + list);

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println("list=" + list);

        Collections.swap(list, 2, 3);
        System.out.println("list=" + list);

        System.out.println(Collections.max(list));

        list.add("tom");
        System.out.println("tom出现的次数：" + Collections.frequency(list, "tom"));

        ArrayList dest = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);
        System.out.println("dest=" + dest);

        Collections.replaceAll(list, "tom", "john");
        System.out.println(list);
    }
}
