package com.hsp.desing_.template_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-17 11:41
 * Version 1.0
 */
public class AA extends Template {

    long num;
    @Override
    public void job() {
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }
}
