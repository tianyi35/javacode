package com.hsp.javacode.chapter15.customgeneric;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 15:57
 * Version 1.0
 */
public class CustomGeneric01 {

}

class Tiger<T,R, M> {
    T t;
    R r;
    M m;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public Tiger(T t, R r, M m) {
        this.t = t;
        this.r = r;
        this.m = m;
    }
}