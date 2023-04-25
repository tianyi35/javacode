package com.hsp.javacode.chapter12.exception_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-24 10:45
 * Version 1.0
 */
public class Exception02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            System.out.println(person.getName());
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
