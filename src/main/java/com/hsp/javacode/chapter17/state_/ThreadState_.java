package com.hsp.javacode.chapter17.state_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-14 17:17
 * Version 1.0
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        TState tState = new TState();
        System.out.println(tState.getName()+"状态"+tState.getState());
        tState.start();

        while (Thread.State.TERMINATED != tState.getState()) {
            System.out.println(tState.getName()+"状态"+tState.getState());
            Thread.sleep(500);
        }
        System.out.println(tState.getName()+"状态"+tState.getState());
    }


}

class TState extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " hi " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
