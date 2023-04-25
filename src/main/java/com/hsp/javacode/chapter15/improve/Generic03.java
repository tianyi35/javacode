package com.hsp.javacode.chapter15.improve;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-09 10:46
 * Version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {

        Person<String> person = new Person<String>("hsp-edu");
        /**
         * 你可以可以这样理解，Person类
         * class Person<String> {
         *     String s;//E 表示s的数据类型，该数据类型在定义Person对象的时候指定，在编译期间就能确定E是什么类型
         *
         *     public Person(String s) {//E 是参数类型
         *         this.s = s;
         *     }
         *
         *     public String f() {//E 某个方法的返回值的类型
         *         return s;
         *     }
         * }
         */

        Person<Integer> person1 = new Person<Integer>(12);
        /**
         * 你可以可以这样理解，Person类
         * class Person<Integer> {
         *     Integer s;//E 表示s的数据类型，该数据类型在定义Person对象的时候指定，在编译期间就能确定E是什么类型
         *
         *     public Person(Integer s) {//E 是参数类型
         *         this.s = s;
         *     }
         *
         *     public Integer f() {//E 某个方法的返回值的类型
         *         return s;
         *     }
         * }
         */
    }
}


//泛型的作用是：可以在类声明时通过通过标识来表示类中某个属性的类型
// 或者是某个方法的返回值的类型，或者是参数类型
class Person<E> {
    E s;//E 表示s的数据类型，该数据类型在定义Person对象的时候指定，在编译期间就能确定E是什么类型

    public Person(E s) {//E 是参数类型
        this.s = s;
    }

    public E f() {//E 某个方法的返回值的类型
        return s;
    }
}
