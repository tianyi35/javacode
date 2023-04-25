package com.hsp.desing_.template_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-17 11:42
 * Version 1.0
 */
public class BB extends Template {

    long num;

    @Override
    public void job() {
        for (int i = 0; i < 80000; i++) {
            num *= i;
        }
    }
}
