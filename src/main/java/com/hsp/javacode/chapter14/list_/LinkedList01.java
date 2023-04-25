package com.hsp.javacode.chapter14.list_;

/**
 * Description: 模拟一个简单的双向链表
 * Author: Lixp
 * Date: 2023-03-02 15:42
 * Version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("韩顺平");

        //连接三个节点，形成双向链表
        //jack->tom->hsp
        jack.next = tom;
        tom.next = hsp;
        //hsp->tom->jack
        hsp.pre = tom;
        tom.pre = jack;

        //让first引用指向jack,就是双向链表的关节点
        Node first = jack;
        //让last引用指向hsp,就是双向链表的尾节点
        Node last = hsp;


        //演示，从头到尾进行遍历
        System.out.println("=====从头到尾进行遍历======");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示，从尾到头进行遍历
        System.out.println("======从尾到头进行遍历======");
        while (true) {
            if (last == null) {
                break;
            }
            //输出first信息
            System.out.println(last);
            last = last.pre;
        }

        //演示添加对象/数据，是多么的方便
        //要求是在tom-------老韩之间插入一个对象smith

        Node smith = new Node("smith");

        tom.next = smith;
        smith.pre=tom;
        smith.next = hsp;
        hsp.pre = smith;

        //first再次指向jack
        first = jack;

        //演示，是在tom-------老韩之间插入一个对象smith
        System.out.println("=====从尾到头进行遍历，是在tom-------老韩之间插入一个对象smith======");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //last再次指向hsp
        last = hsp;
        //演示，从尾到头进行遍历
        System.out.println("======从尾到头进行遍历======");
        while (true) {
            if (last == null) {
                break;
            }
            //输出first信息
            System.out.println(last);
            last = last.pre;
        }

    }
}

//定义一个Node类，Node对象表示一个双向链表的一个节点
class Node {

    public Object item;//真正存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
