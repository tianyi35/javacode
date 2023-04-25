package com.hsp.javacode.chapter10;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-16 10:28
 * Version 1.0
 */
public class StaticExercise01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数是：" + args[i]);
        }
        new Test().count();
        new Test().count();
        System.out.println(Test.count);
    }

}

class Test {
    static int count = 9;

    public void count() {
        System.out.println("count=" + (count++));
    }
}
