package com.hsp.javacode.chapter17.threaduse;

/**
 * Description: 通过实现Runnable接口来开发线程
 * Author: Lixp
 * Date: 2023-03-14 11:01
 * Version 1.0
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog.start()//不能使用start()
        //创建了Thread对象，把dog对象(实现了Runnable接口),放入到Thread
        Thread thread = new Thread(dog);
        thread.start();

        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();

    }

}

class Animal {
}

class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎嗷嗷");
    }
}


//线程代理类，模拟了一个极简的Thread类
//可以把ThreadProxy类当做 ThreadProxy
class ThreadProxy implements Runnable {
    //target属性类型是Runnable
    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法是实现多线程方法
    }

    private void start0() {
        run();
    }
}

//通过实现Runnable接口来开发线程
class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫..hi" + (++count) + "线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (10 == count) {
                break;
            }
        }
    }
}
