package com.hsp.javacode.chapter17.method;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 16:04
 * Version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t = new T2();
        t.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "hi " + i);
            if (5 == i) {
                t.join();//子线程t插队，等子线程结束后，主线程再执行

                //线程礼让，让出CPU，让其它线程执行，但礼让的时间不确定，不一定成功
                //Thread.yield();
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "hello" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
