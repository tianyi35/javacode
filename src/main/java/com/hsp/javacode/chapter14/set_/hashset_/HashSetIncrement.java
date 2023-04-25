package com.hsp.javacode.chapter14.set_.hashset_;

import java.util.HashSet;
import java.util.Objects;

/**
 * Description: HashSet扩容和转成红黑树机制
 * Author: Lixp
 * Date: 2023-03-06 14:27
 * Version 1.0
 */
@SuppressWarnings("all")
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        /*for (int i = 0; i <= 100; i++) {
            hashSet.add(i);
        }*/


        /*for (int i = 1; i <= 12; i++) {
            hashSet.add(new A(i));
        }*/
        System.out.println("hashSet=" + hashSet);


        for (int i = 1; i <= 7; i++) {
            hashSet.add(new A(i));
        }

        for (int i = 1; i <=10; i++) {
            hashSet.add(new B(i));
        }
    }
}

class B {
    private int b;

    public B(int b) {
        this.b = b;
    }


    @Override
    public int hashCode() {
        return 200;
    }
}

class A {
    private int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
