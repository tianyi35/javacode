package com.hsp.javacode.chapter14.map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * Description: HashMap扩容树触发
 * Author: Lixp
 * Date: 2023-03-07 16:24
 * Version 1.0
 */
public class HaspMapSource_2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }
        System.out.println("hashMap=" + hashMap);
    }

}

class A {
    private Integer num;

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(num, a.num);
    }

    @Override
    public int hashCode() {
        return 100;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public A(Integer num) {
        this.num = num;
    }
}


