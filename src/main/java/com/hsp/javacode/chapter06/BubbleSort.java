package com.hsp.javacode.chapter06;

import java.util.Arrays;

/**
 * Description: 冒泡排序
 * Author: Lixp
 * Date: 2023-01-29 15:30
 * Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {24, 69, 80, 57, 13, 0, 14, 14, 300, -198};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
