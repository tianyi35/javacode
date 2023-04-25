package com.hsp.javacode.chapter13.arrays_;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-28 9:16
 * Version 1.0
 */
public class Arrays01 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 45, 359};

        Integer[] newArr = Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.toString(newArr));



    }
}
