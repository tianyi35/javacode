package com.hsp.javacode.chapter13.homework;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-28 14:59
 * Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        //测试
        String str = "abcdef";
        System.out.println("====交换前===");
        System.out.println(str);

        try {
            str = reverse(null, 1, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("====交换后===");
        System.out.println(str);
    }


    public static String reverse(String str, int start, int end) {

        if (!(null!= str && start >= 0 && end > start && end > str.length())) {
            throw new RuntimeException("参数不正确！！");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';//交换辅助变量
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        // 使用chars重新构建一个String返回

        return new String(chars);
    }


}
