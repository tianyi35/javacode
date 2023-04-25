package com.hsp.javacode.chapter17.ticket;

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
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }

}

class SellTicket01 extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩余" + (--tickets));
        }
    }
}

class SellTicket02 implements Runnable {

    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩余" + (--tickets));
        }
    }
}