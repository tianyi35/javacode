package com.hsp.javacode.chapter15.junit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-10 11:15
 * Version 1.0
 */
public class Homework01 {

    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 20, "jack"));
        userDAO.save("002", new User(2, 25, "john"));
        userDAO.save("003", new User(3, 30, "tom"));
        userDAO.save("004", new User(4, 35, "lucy"));
        System.out.println("list=" + userDAO.list());
        //System.out.println(userDAO.get("1"));
        userDAO.update("004", new User(4, 40, "lucy"));
        userDAO.delete("002");
        System.out.println("===修改后===");
        System.out.println("list=" + userDAO.list());

        System.out.println("id=003 " + userDAO.get("003"));
    }

}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        for (Map.Entry e : entries) {
            list.add((T) e.getValue());
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
