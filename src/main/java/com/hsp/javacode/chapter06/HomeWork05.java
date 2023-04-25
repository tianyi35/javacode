package com.hsp.javacode.chapter06;

import java.util.Arrays;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-01-30 13:44
 * Version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }

        int sum = arr[0];
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("平均值：" + sum / arr.length);
        System.out.println("最大值：" + max);
        System.out.println("最大值的下标：" + maxIndex);

        int findNum = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                System.out.println("找到数" + findNum + "下标为：" + i);
                index = 1;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到数" + findNum);
        }
    }
}
