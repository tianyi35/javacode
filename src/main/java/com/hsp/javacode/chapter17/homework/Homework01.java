package com.hsp.javacode.chapter17.homework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-15 14:00
 * Version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        T t1 = new T(true);
        T2 t2 = new T2(t1);
        new Thread(t1).start();
        t2.start();
    }
}

class T implements Runnable {
    private boolean loop = true;

    public T(boolean loop) {
        this.loop = loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            Double d = 100 * Math.random() + 1;
            System.out.println("随机打印100以内的整数：" + d.intValue());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("T线程退出");

    }
}

class T2 extends Thread {

    private T t;

    private Scanner scanner = new Scanner(System.in);

    public T2(T t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            //接收用户的输入
            System.out.println("请输入你的指令(Q)表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以通知的方式结束t线程
                t.setLoop(false);
                System.out.println("T2线程退出");
                break;
            }
        }
    }

}