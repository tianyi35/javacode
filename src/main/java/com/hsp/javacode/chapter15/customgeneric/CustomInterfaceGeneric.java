package com.hsp.javacode.chapter15.customgeneric;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 17:12
 * Version 1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IUsb<U, R> {
    int i = 10;

    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }

}

//在继承接口时，指定实现泛型接口的类型
interface IA extends IUsb<String, Double> {
}
class AA implements  IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

}

