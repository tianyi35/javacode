package com.hsp.javacode.chapter17.threaduse;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 11:31
 * Version 1.0
 */
public class Thread03 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();
        Thread thread3 = new Thread(t3);
        thread3.start();
        Thread thread4 = new Thread(t4);
        thread4.start();
    }
}

class T3 implements Runnable {
    int n = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world" + " n=" + (++n) + "线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (100 == n) {
                break;
            }
        }
    }
}

class T4 implements Runnable {
    int n = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + " n=" + (++n) + "线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (60 == n) {
                break;
            }
        }
    }
}