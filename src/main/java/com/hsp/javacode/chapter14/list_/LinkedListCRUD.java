package com.hsp.javacode.chapter14.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-03 9:27
 * Version 1.0
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        //演示一个删除节点
        linkedList.remove(1);
        //linkedList.remove();//默认删除第一个节点

        System.out.println("linkedList=" + linkedList);
        //修改某个节点
        linkedList.add(55);
        linkedList.set(1, 999);
        System.out.println("linkedList=" + linkedList);

        //得到某个节点
        Object o = linkedList.get(1);
        System.out.println(o);
        Iterator iterator = linkedList.iterator();
        System.out.println("使用Iterable迭代器");
        while (iterator.hasNext()) {
            System.out.println("next=" + iterator.next());
        }

        System.out.println("增加for循环");
        for (Object obj : linkedList) {
            System.out.println("obj=" + obj);
        }
        System.out.println("使用传统的for循环");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
