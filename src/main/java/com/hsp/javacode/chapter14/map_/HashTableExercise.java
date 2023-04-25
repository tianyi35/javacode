package com.hsp.javacode.chapter14.map_;

import java.util.Hashtable;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-07 17:02
 * Version 1.0
 */
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable hashTable = new Hashtable();
        hashTable.put("john", 100);
        //hashTable.put(null, 100); //NullPointerException
        //hashTable.put("john", null);//NullPointerException
        hashTable.put("lucy", 100);
        hashTable.put("lic", 100);
        hashTable.put("lic", 88);
        hashTable.put("hello1", 1);
        hashTable.put("hello2", 2);
        hashTable.put("hello3", 3);
        hashTable.put("hello4", 4);
        hashTable.put("hello5", 5);
        hashTable.put("hello6", 6);

        System.out.println(hashTable);
    }
}
