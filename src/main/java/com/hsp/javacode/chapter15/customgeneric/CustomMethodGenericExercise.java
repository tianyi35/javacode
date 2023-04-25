package com.hsp.javacode.chapter15.customgeneric;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-10 10:16
 * Version 1.0
 */
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);

        apple.fly(new Dog());
    }
}

class Apple<T, R, M> {
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

  //  public void eat(U u){};//错误，因为U没有声明

    public void run(M m){};
}

class Dog {

}