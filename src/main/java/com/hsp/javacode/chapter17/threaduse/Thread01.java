package com.hsp.javacode.chapter17.threaduse;

/**
 * Description: 继承Thread类，来开发线程
 * Author: Lixp
 * Date: 2023-03-14 9:42
 * Version 1.0
 */
public class Thread01 {
    public static void main(String[] args) {

        //创建Cat对象，可以当做线程使用
        Cat cat = new Cat();
        cat.start();//start()启动线程

        //说明：当main线程启动一个子线程，Thread-0,主线程不会阻塞，会继续执行
        //主线程和子线程交替执行
        //主线程结束了，子线程可能还会运行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            //让主线程休眠1秒
            try {
                Thread.sleep(0x3e8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

//1.当一个类继承了Thread类，该类就可以当做线程使用
//2.我们会重写run方法，写上自己的业务代码
//3.Thread类实现发Runnable接口的run方法
/*
   @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread {

    int times = 0;

    //重写run方法，实现自己的业务逻辑
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵，我是小猫咪" + (++times) + "线程名：" + Thread.currentThread().getName());
            //让线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (80 == times) {
                //当times=80，退出while循环，这时线程也退出...
                break;
            }
        }
    }
}
