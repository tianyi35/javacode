package com.hsp.javacode.chapter08.debug_;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-07 14:33
 * Version 1.0
 */
public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
