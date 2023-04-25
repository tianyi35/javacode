package com.hsp.javacode.chapter06;

import java.util.Arrays;

/**
 * Description: 杨辉三角
 * Author: Lixp
 * Date: 2023-01-30 9:26
 * Version 1.0
 */
public class YangHui {
    public static void main(String[] args) {


        int[][] yangHui = new int[20][];

        for (int i = 0; i < yangHui.length; i++) {
            //给每个一维数组（行）开空间
            yangHui[i] = new int[i + 1];
            //给每个一维数组（行）赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                }else{
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }
        for (int[] arr : yangHui) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
