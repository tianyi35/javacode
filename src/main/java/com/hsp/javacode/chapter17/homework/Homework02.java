package com.hsp.javacode.chapter17.homework;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-15 14:59
 * Version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Card card = new Card();
        card.setSal(10000);
        card.setLoop(true);

        Customer customer = new Customer(card);
        new Thread(customer).start();
        new Thread(customer).start();
    }
}

class Card {
    private Integer sal;
    private boolean loop = true;

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class Customer implements Runnable {

    private Card card;

    public Customer(Card card) {
        this.card = card;
    }

    public synchronized void withDrawMoney(Card card) {
        if (card.getSal() >= 1000) {
            Integer sal = card.getSal() - 1000;
            card.setSal(sal);
            System.out.println(Thread.currentThread().getName() + "取钱 1000,剩余钱：" + card.getSal());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "余额不足");
            card.setLoop(false);
        }
    }

    @Override
    public void run() {
        while (card.isLoop()) {
            withDrawMoney(card);
        }
    }
}
