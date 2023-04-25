package com.hsp.javacode.chapter17.method;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 15:42
 * Version 1.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("线程1");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("hi " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(t.getName() + "优先级=" + t.getPriority());

        t.interrupt();
    }

}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "  吃包子~~~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "  休眠中~~~~~");
                Thread.sleep(20 * 1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt了");
            }
            System.out.println("==================");
        }

    }
}
