package com.hsp.javacode.chapter10.innerclass;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-20 17:17
 * Version 1.0
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmclock(() -> System.out.println("小伙伴起床了"));

    }
}

interface Bell {
    void ring();
}
class Cellphone{
    public void alarmclock(Bell bell) {
        bell.ring();

    }
}
