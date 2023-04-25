package com.hsp.javacode.chapter17.synchronized_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 14:00
 * Version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        //方式1：继承Thread类，实现三个窗口卖票
        /*SellTicket01 s1 = new SellTicket01();
        s1.start();
        SellTicket01 s2 = new SellTicket01();
        s2.start();
        SellTicket01 s3 = new SellTicket01();
        s3.start();*/

        //方式2：实现Runnable接口，实现三个窗口卖票
        /*SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();*/


        //方式3：实现Runnable接口，使用synchronized实现线程同步，实现三个窗口卖票
        /*SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();*/

        //方式4：实现Runnable接口，使用synchronized代码块实现线程同步，实现三个窗口卖票
        SellTicket04 sellTicket04 = new SellTicket04();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();

    }

}

//实现接口方式，使用synchronized实现线程同步
class SellTicket03 implements Runnable {

    private int tickets = 100;
    private boolean loop = true;

    //同步方法，在同一时刻只能有一个线程来执行sell方法
    public synchronized void sell() {

        if (tickets <= 0) {
            System.out.println("售票结束...");
            loop = false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩余" + (--tickets));

    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}

//实现接口方式，使用synchronized实现线程同步
class SellTicket04 implements Runnable {

    private int tickets = 100;
    private boolean loop = true;
    private Object object = new Object();

    //同步方法，在同一时刻只能有一个线程来执行sell方法
    public void sell() {
        synchronized (/*this*/ object) {
            if (tickets <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩余" + (--tickets));
        }

    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}