package com.hsp.javacode.chapter08.exercise;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 11:27
 * Version 1.0
 */
public class CheckingAccount extends BankAccount {
    public CheckingAccount() {
    }

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);//存款收取1美元手续费
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);//取款收取1美元手续费
    }
}
