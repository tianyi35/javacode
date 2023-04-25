package com.hsp.javacode.chapter13.homework;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-28 15:46
 * Version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {

        String name = "jac11111k";
        String password = "123456";
        String email = "jack@email.com";

        try {
            userRegister(name, password, email);
            System.out.println("恭喜你，注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public static void userRegister(String username, String password, String email) {
        //验证名字
        int userLength = username.length();
        if (!(2 <= userLength && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
        //验证密码
        if (!(password.length() == 6 && isDigital(password))) {
            throw new RuntimeException("密码长度为6，要求全部是数字");
        }

        //验证email
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和.，并且@在.的前面");
        }


    }

    //单独写一个方法，判断密码是否全部是数字字符 boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}


