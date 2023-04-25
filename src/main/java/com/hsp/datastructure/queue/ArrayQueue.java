package com.hsp.datastructure.queue;

/**
 * Description: 队列
 * 1) 队列是一个有序列表，可以用数组或是链表来实现。
 * 2) 遵循先入先出的原则。即：先存入队列的数据，要先取出。后存入的要后取出
 * 使用数组模拟队列-编写一个 ArrayQueue 类
 * Author: Lixp
 * Date: 2023-04-21 14:10
 * Version 1.0
 */
public class ArrayQueue {

    private int front;// 队列头
    private int rear;// 队列尾
    private int maxSize;
    ; // 表示数组的最大容量
    private int[] arr;// 该数据用于存放数据, 模拟队列

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1; // 指向队列头部，分析出 front 是指向队列头的前一个位置.
        rear = -1; // 指向队列尾，指向队列尾的数据(即就是队列最后一个数据)
    }

    // 判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     * 当我们将数据存入队列时称为”addQueue”，addQueue 的处理需要有两个步骤：
     * 思路分析
     * 1) 将尾指针往后移：rear+1 , 当 front == rear 【空】
     * 2) 若尾指针 rear 小于队列的最大下标 maxSize-1，则将数据存入 rear 所指的数组元素中，否则无法存入数据。
     * rear == maxSize - 1[队列满]
     *
     * @param n
     */
    public void addQueue(int n) {
        // 判断队列是否满
        if (isFull()) {
            System.out.println("队列满，不能加入数据~");
            return;
        }
        rear++;// 让 rear 后移
        arr[rear] = n;
    }

    /**
     * 获取队列的数据，出队列
     *
     * @return
     */
    public int getQueue() {
        // 判断队列是否空
        if (isEmpty()) {
            // 通过抛出异常
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;// front
        return arr[front];
    }

    //显示队列的所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列空的，没有数据~~");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    // 显示队列的头数据， 注意不是取出数据
    public int headQueue() {
        if (isEmpty()) {
            System.out.println("队列空的，没有数据~~");
        }
        return arr[front + 1];
    }

}
