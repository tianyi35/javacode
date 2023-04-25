package com.hsp.javacode.chapter09.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Description: 实现零钱通各个功能的类，使用面向对象编程
 * Author: Lixp
 * Date: 2023-02-08 14:53
 * Version 1.0
 */
public class SmallChangeSysOOP {
    Scanner scanner = new Scanner(System.in);//输入对象
    Boolean loop = true;//循环结束标识
    String key = "";//输入文本接收

    String detail = "-----------零钱通明细------------";//零钱通消费明细
    Double balance = 0.0d;//帐户总金额
    Double money = 0.0D;//金额
    String note = "";//消费理由

    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 完成显示菜单，并可以选择
     */
    public void mainMenu() {
        do {
            System.out.println("\n-----------选择零钱通菜单(oop)------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("请选择(1-4):");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }
        while (loop);
    }

    /**
     * 显示零钱通明细
     */
    public void detail() {
        System.out.println(detail);
    }

    /**
     * 零钱通收益入账
     */
    public void income() {
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        //先找出不符合要求的条件，给出提示，就直接return
        if (money <= 0) {
            System.out.println("收益入账金额范围需要大于0");
            return;//退出方法，不在执行后面的代码
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t余额:" + balance;
    }

    /**
     * 完成零钱通消费功能
     */
    public void pay() {
        System.out.print("消费说明:");
        note = scanner.next();
        System.out.print("消费金额:");
        money = scanner.nextDouble();
        //先找出不符合要求的条件，给出提示，就直接break
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        balance -= money;
        date = new Date();
        detail += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t余额:" + balance;
    }

    /**
     * 完成退出功能
     */
    public void exit() {
        System.out.println("退     出");
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if ("y".equals(choice)) {
            loop = false;
        }
    }
}
