package com.hsp.algorithm;

/**
 * Description:两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * 提示：
 * <p>
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 * <p>
 * <p>
 * Author: Lixp
 * Date: 2023-04-19 16:49
 * Version 1.0
 */
public class TwoLinkedAdd {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(7);
        l1.next = node2;
        node2.next = node3;

        ListNode l2 = new ListNode(5);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(4);
        l2.next = node4;
        node4.next = node5;

        System.out.println(addTwoNumbers(l1, l2));


    }

    /**
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         *  你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
         *  输入：l1 = [2,4,3], l2 = [5,6,4]
         *  输出：[7,0,8]
         *  解释：342 + 465 = 807.
         */

        int carry = 0, sum = 0;
        ListNode head = new ListNode();
        ListNode p1 = head;
        while (true) {
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                if (sum >= 10) carry = 1;
                else carry = 0;
                p1.val = sum >= 10 ? sum - 10 : sum;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val + carry;
                if (sum >= 10) carry = 1;
                else carry = 0;
                p1.val = sum >= 10 ? sum - 10 : sum;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val + carry;
                if (sum >= 10) carry = 1;
                else carry = 0;
                p1.val = sum >= 10 ? sum - 10 : sum;
                l2 = l2.next;
            } else {
                if (carry != 0) {
                    p1.next = new ListNode();
                    p1 = p1.next;
                    p1.val = carry;
                }
                break;
            }
            if (l1 != null || l2 != null) {
                p1.next = new ListNode();
                p1 = p1.next;
            }
        }
        return head;
       /* int carry = 0, sum = 0;
        ListNode head = new ListNode();
        ListNode p1 = head;
        while (true) {
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                if (sum >= 10) carry = 1;
                else carry = 0;
                p1.val = sum >= 10 ? sum - 10 : sum;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val + carry;
                if (sum >= 10) carry = 1;
                else carry = 0;
                p1.val = sum >= 10 ? sum - 10 : sum;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val + carry;
                if (sum >= 10) carry = 1;
                else carry = 0;
                p1.val = sum >= 10 ? sum - 10 : sum;
                l2 = l2.next;
            } else {
                if (carry != 0) {
                    p1.next = new ListNode();
                    p1 = p1.next;
                    p1.val = carry;
                }
                break;
            }
            if (l1 != null || l2 != null) {
                p1.next = new ListNode();
                p1 = p1.next;
            }
        }
        return head;*/
    }

}

class ListNode {
    public int val;

    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
