package com.hsp.datastructure.linkedlist;

/**
 * Description: 单链表测试
 * Author: Lixp
 * Date: 2023-04-23 10:12
 * Version 1.0
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        //无序添加
        /*linkedList.add(new HeroNode(1, "宋江", "及时雨"));
        linkedList.add(new HeroNode(2, "卢俊义", "玉麒麟"));
        linkedList.add(new HeroNode(3, "吴用", "智多星"));
        linkedList.add(new HeroNode(4, "林冲", "豹子头"));*/

        //有序添加
        linkedList.addByOrder(new HeroNode(2, "卢俊义", "玉麒麟"));
        linkedList.addByOrder(new HeroNode(1, "宋江", "及时雨"));
        linkedList.addByOrder(new HeroNode(4, "林冲", "豹子头"));
        linkedList.addByOrder(new HeroNode(3, "吴用", "智多星"));
        linkedList.addByOrder(new HeroNode(3, "吴用", "智多星"));
        ////linkedList.showList();
        //System.out.println("链表的长度为：" + linkedList.getLength());
        //
        ////修改节点信息
        //linkedList.update(new HeroNode(4, "林冲", "狮子头-豹子头"));
        //// linkedList.showList();
        //
        ////删除节点
        ///*linkedList.delete(4);
        //linkedList.delete(2);
        //linkedList.delete(3);
        //System.out.println("链表的长度为："+linkedList.getLength());
        //linkedList.delete(1);
        //linkedList.showList();*/
        //
        //System.out.println(linkedList.findLastIndexNode(1));
        //
        //System.out.println("原链表");
        //linkedList.showList();
        //System.out.println("反转后的单链表");
        //linkedList.reverse(linkedList.getHead());
        //linkedList.showList();
        //
        //System.out.println("逆序打印单链表");
        //linkedList.reversePrint(linkedList.getHead());

        HeroNode animal1 = new HeroNode(2, "牛魔王", "牛头");
        HeroNode animal2 = new HeroNode(4, "孙悟空", "猴子");
        HeroNode animal3 = new HeroNode(7, "庄周", "鱼");
        HeroNode animal4 = new HeroNode(9, "瑶", "混子");
        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        singleLinkedList2.addByOrder(animal1);
        singleLinkedList2.addByOrder(animal2);
        singleLinkedList2.addByOrder(animal3);
        singleLinkedList2.addByOrder(animal4);

        System.out.println("链表1：");
        linkedList.showList();
        System.out.println("链表2：");
        singleLinkedList2.showList();
        System.out.println("合并之后：");
        SingleLinkedList list = linkedList.merge(linkedList, singleLinkedList2);
        list.showList();
    }
}
