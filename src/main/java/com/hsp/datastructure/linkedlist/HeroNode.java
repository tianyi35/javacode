package com.hsp.datastructure.linkedlist;

/**
 * Description: 英雄节点
 * Author: Lixp
 * Date: 2023-04-23 9:36
 * Version 1.0
 */
public class HeroNode {

    int no;
    String name;
    String nickedName;
    HeroNode next;

    public HeroNode() {
    }

    public HeroNode(int no, String name, String nickedName) {
        this.no = no;
        this.name = name;
        this.nickedName = nickedName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickedName='" + nickedName + '\'' +
                '}';
    }

}
