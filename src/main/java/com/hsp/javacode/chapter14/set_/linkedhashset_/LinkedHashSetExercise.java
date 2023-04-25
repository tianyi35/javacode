package com.hsp.javacode.chapter14.set_.linkedhashset_;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-06 17:32
 * Version 1.0
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new Car("奥拓", 1000.00));
        set.add(new Car("奥迪", 300000.00));
        set.add(new Car("法拉利", 10000000.00));
        set.add(new Car("保时捷", 70000000.00));
        set.add(new Car("奥迪", 300000.00));
        System.out.println("set=" + set);
    }
}

class Car {
    private String name;
    private Double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
