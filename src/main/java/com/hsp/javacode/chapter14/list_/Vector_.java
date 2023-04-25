package com.hsp.javacode.chapter14.list_;

import java.util.Vector;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-03-02 13:49
 * Version 1.0
 */
@SuppressWarnings("all")
public class Vector_ {
    public static void main(String[] args) {

        //Vector vector = new Vector(8);
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);

    }
}
