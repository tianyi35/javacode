package com.hsp.javacode.chapter17.exit_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 14:11
 * Version 1.0
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        //如果希望main线程去控制t1线程的终止，必须可以修改loop
        //让t1 退出run方法，从而终止 t1线程---->通知方式

        //让主线程休眠10秒，再通知t1线程退出
        System.out.println("让主线程休眠10秒，再通知t1线程退出");
        Thread.sleep(10 * 1000);
        t1.setLoop(false);
    }
}

class T extends Thread {
    private int i = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中......" + (++i));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
