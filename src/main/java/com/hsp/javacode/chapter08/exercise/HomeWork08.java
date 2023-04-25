package com.hsp.javacode.chapter08.exercise;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 11:31
 * Version 1.0
 */
public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);// 1000+10-1=1009
        checkingAccount.withdraw(9);//1009 -9 =1000,1000-1=999
        System.out.println(checkingAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(3, 1000, 0.01);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        savingAccount.setCount(3);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
    }
}
