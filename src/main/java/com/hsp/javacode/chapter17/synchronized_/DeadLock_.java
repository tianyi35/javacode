package com.hsp.javacode.chapter17.synchronized_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-15 11:23
 * Version 1.0
 */
public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo d1 = new DeadLockDemo(true);
        d1.setName("线程一");
        d1.start();
        DeadLockDemo d2 = new DeadLockDemo(false);
        d2.setName("线程二");
        d2.start();
    }
}

class DeadLockDemo extends Thread {

    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    //业务逻辑分析
    //1.如果flag为T,线程1就会先得到/持有 o1对象锁，然后再尝试去获取o2对象锁
    //2.如果线程1得不到o2对象锁，就会Blocked
    //3.如果flag为F,线程2就会先得到/持有 o2对象锁，然后再尝试去获取o21对象锁
    //4.如果线程2得不到o1对象锁，就会Blocked
    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }else{
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}
