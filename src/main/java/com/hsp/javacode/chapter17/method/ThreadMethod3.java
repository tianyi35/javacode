package com.hsp.javacode.chapter17.method;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 16:45
 * Version 1.0
 */
public class ThreadMethod3 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread m = new MyDaemonThread();
        m.setDaemon(true);
        m.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "运行中......" + i);
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行中......");

        }
    }
}
