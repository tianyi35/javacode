package com.hsp.javacode.chapter12.exception_;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-24 14:25
 * Version 1.0
 */
public class HomeWork01 {

    public static void main(String[] args) {

        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("缺少命令行参数");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("计算结果是：" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数据格式不正确");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }


    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
