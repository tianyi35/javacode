package com.hsp.javacode.chapter08.exercise;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 11:25
 * Version 1.0
 */
public class BankAccount {
    private int balance;//余额

    public BankAccount() {
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // 存款
    public void deposit(double amount) {
        balance += amount;
    }

    // 取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
