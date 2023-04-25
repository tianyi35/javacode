package com.hsp.javacode.chapter17.method;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 16:24
 * Version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        //先创建好子线程
        R r = new R();
        Thread t = new Thread(r);
        //主线程
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " hi " + i);
            Thread.sleep(1000);
            //启动子线程
            if (5 == i) {
                t.start();//启动子线程
                t.join();//立即将t子线程插队到主线程
            }
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }
}
