package com.hsp.datastructure.linkedlist;

import java.util.Stack;

/**
 * Description: 单链表
 * Author: Lixp
 * Date: 2023-04-23 9:40
 * Version 1.0
 */
public class SingleLinkedList {

    //head节点 表示单链表头，不存放任何数据
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }


    //因为head节点不能动，因此我们需要一个辅助节点
    //temp在循环时，动态的从head节点指向后面的节点
    HeroNode temp;

    //添加节点

    /**
     * 思路，当不考虑编号顺序是
     * 1，找到当前链表的最后节点
     * 2，将最后这个节点的next指向新的节点
     *
     * @param node
     */
    public void add(HeroNode node) {
        temp = head;
        //遍历链表，找到最后节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //当退出while循环时，找到当前链表的最后节点,将这个节点的next指向新的节点
        temp.next = node;
    }

    //第二种添加方式：在添加英雄是，根据排名将英雄插入到指定的位置
    //如果有这个排名，则给出提示
    public void addByOrder(HeroNode node) {
        //因为head节点不能动，因此我们需要一个辅助节点
        //temp是位于添加位置的前一个节点，否则插入不了。在循环时，动态的从head节点指向后面的节点
        temp = head;
        //标志添加的编号是否存在，默认为false
        boolean flag = false;

        while (true) {
            if (temp.next == null) {
                break;
            } else {
                if (temp.next.no > node.no) {//位置找到，就在temp的后面插入
                    break;
                }
                if (temp.next.no == node.no) {// 有这个排名，则给出提示
                    flag = true;
                    break;
                }
            }
            temp = temp.next;
        }

        if (flag) {
            System.out.println("对应编号为：" + node.no + "的英雄已存在");
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }


    //遍历单链表
    public void showList() {
        //因为head节点不能动，因此我们需要一个辅助节点temp
        temp = head;
        //遍历链表，找到最后节点
        while (temp.next != null) {
            System.out.println(temp.next);
            temp = temp.next;
        }
    }

    //修改节点的信息，根据no编号来修改，即no编号不能变
    public void update(HeroNode newNode) {
        temp = head;
        boolean flag = false;//表示是否找到该节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            if (temp.no == newNode.no) {
                flag = true;
                temp.name = newNode.name;
                temp.nickedName = newNode.nickedName;
            }
        }
        if (!flag) {
            System.out.println("没有找到该节点！");
        }
    }

    /**
     * 从单链表中删除一个节点的思路
     * 1.  我们先找到 需要删除的这个节点的前一个节点 temp
     * 2.  temp.next = temp.next.next
     * 3. 被删除的节点，将不会有其它引用指向，会被垃圾回收机制回收
     * <p>
     * <p>
     * 思路
     * 1 head不能动，因此我们需要一个temp辅助变量来找到删除的这个节点的前一个节点
     * 2 说明我们在比较时，是temp.next.no ==  no（和要删除的节点的）
     *
     * @param no
     */
    public void delete(int no) {
        temp = head;
        boolean flag = false;//表示是否找到
        while (true) {
            if (temp.next == null) {
                break;
            }
            //找到待删除节点的前一个节点
            if (temp.next.no == no) {
                flag = true;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        if (!flag) {
            System.out.println("没有找到该节点！");
        }
    }

    //方法：获取到单链表的节点的个数(如果是带头结点的链表，需求不统计头节点)
    public int getLength() {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        //定义一个辅助的变量, 这里我们没有统计头节点
        HeroNode cur = head.next;
        while (true) {
            if (cur == null) {
                break;
            }
            length++;
            cur = cur.next;
        }
        return length;
    }

    /**
     * 查找单链表中的倒数第 k 个结点 【新浪面试题】
     * 思路
     * 1. 编写一个方法，接收 head 节点，同时接收一个 index
     * 2. index 表示是倒数第 index 个节点
     * 3. 先把链表从头到尾遍历，得到链表的总的长度 getLength
     * 4. 得到 size 后，我们从链表的第一个开始遍历 (size-index)个，就可以得到
     * 5. 如果找到了，则返回该节点，否则返回 nulll
     */
    public HeroNode findLastIndexNode(int index) {
        if (head.next == null) {
            return null;
        }
        int size = getLength();
        //第二次遍历 size-index 位置，就是我们倒数的第 K 个节点
        //先做一个 index 的校验
        if (index <= 0 || index > size) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * 单链表的反转【腾讯面试题，有点难度】
     * 思路:
     * 1. 先定义一个节点 reverseHead = new HeroNode();
     * 2. 从头到尾遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表reverseHead 的最前端.
     * 3. 原来的链表的head.next = reverseHead.next
     */

    public HeroNode reverse(HeroNode head) {
        //如果当前链表为空，或者只有一个节点，无需反转，直接返回
        if (head.next == null || head.next.next == null) {
            return head;
        }
        HeroNode reverseNode = new HeroNode();
        //定义一个辅助的指针(变量)，帮助我们遍历原来的链表
        HeroNode cur = head.next;
        // 指向当前节点[cur]的下一个节点
        HeroNode next = null;
        //遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表 reverseHead 的最前端
        //动脑筋
        while (cur != null) {
            next = cur.next;//先暂时保存当前节点的下一个节点，因为后面需要使用
            cur.next = reverseNode.next;//将 cur 的下一个节点指向新的链表的最前端
            reverseNode.next = cur;//将 cur 连接到新的链表上
            cur = next;//让 cur后移
        }
        //将 head.next 指向 reverseHead.next , 实现单链表的反转
        head.next = reverseNode.next;
        return head;
    }

    /**
     * 从尾到头打印单链表 【百度，要求方式 1：反向遍历 。 方式 2：Stack 栈】
     * 方式 2：//可以利用栈这个数据结构，将各个节点压入到栈中，然后利用栈的先进后出的特点，就实现了逆序打印的效果
     *
     * @param head
     */
    public void reversePrint(HeroNode head) {
        if (head.next == null) {
            return;//空链表，不能打印
        }

        //创建要给一个栈，将各个节点压入栈
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        //将链表的所有节点压入栈
        while (cur != null) {
            stack.push(cur);
            cur = cur.next; //cur 后移，这样就可以压入下一个节点
        }
        //将栈中的节点进行打印,pop 出栈
        while (stack.size() > 0) {
            System.out.println(stack.pop()); //stack 的特点是先进后出
        }
    }

    /**
     * 合并两个有序的单链表，合并之后的链表依然有序【课后练习.】
     */

    public SingleLinkedList merge(SingleLinkedList l1, SingleLinkedList l2) {
        SingleLinkedList mergeLinkedList = new SingleLinkedList();
        HeroNode mergeLink = mergeLinkedList.getHead();
        HeroNode cur1 = l1.head.next;
        HeroNode cur2 = l2.head.next;
        //判断链表为空值的情况
        if (l1.head.next == null || l2.head.next == null) {
            if (l1.head.next == null) {
                mergeLink.next = l2.head.next;
            } else {
                mergeLink.next = l1.head.next;
            }
            return mergeLinkedList;
        }
        //判断两个链表的第一个节点的值那个更小
        while (true) {
            //当两个链表不等时，当一个链表遍历完成之后，直接就可以进行判断了
            if (cur1 == null && cur2 != null) {
                mergeLink.next = cur2;
                break;
            }
            if (cur1 != null && cur2 == null) {
                mergeLink.next = cur1;
                break;
            }

            //对链表的大小进行比较
            if (cur1.no < cur2.no || cur1.no == cur2.no) {
                mergeLink.next = cur1;
                mergeLink = mergeLink.next;
                cur1 = cur1.next;
            } else {
                mergeLink.next = cur2;
                mergeLink = mergeLink.next;
                cur2 = cur2.next;
            }
        }

        return mergeLinkedList;
    }
}
