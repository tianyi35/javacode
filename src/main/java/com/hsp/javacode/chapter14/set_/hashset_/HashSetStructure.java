package com.hsp.javacode.chapter14.set_.hashset_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-03 11:41
 * Version 1.0
 */
@SuppressWarnings("all")
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层（HashMap的底层结构）

        //1.创建一个数组，数组的类型是Node[]
        //2.有些人直接把Node[]数组称为表
        Node[] table = new Node[16];
        System.out.println("table=" + table);

        //3.创建节点
        Node john = new Node("john", null);

        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;//将jack节点挂载到john
        Node rose = new Node("Rose", null);
        jack.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table=" + table);

    }
}

class Node {//节点，存储数据，可以指向下一个节点，从而形成链表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
