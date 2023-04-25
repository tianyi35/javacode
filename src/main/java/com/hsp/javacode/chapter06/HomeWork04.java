package com.hsp.javacode.chapter06;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-30 11:25
 * Version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 12, 45, 90};
        int insertNum = 23;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i != index) {
                newArr[i] = arr[j];
                j++;
            } else {
                newArr[i] = insertNum;
            }
        }

        arr = newArr;
        System.out.println(Arrays.toString(arr));

    }
}
