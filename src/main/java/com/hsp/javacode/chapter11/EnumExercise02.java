package com.hsp.javacode.chapter11;

import javax.tools.JavaCompiler;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-22 14:00
 * Version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;

        System.out.println(boy);
        System.out.println(boy==boy2);
    }
}



