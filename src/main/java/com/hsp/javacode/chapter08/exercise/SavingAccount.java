package com.hsp.javacode.chapter08.exercise;

/**
 * Description: <描述>
 * Author: Lixp
 * Date: 2023-02-09 11:34
 * Version 1.0
 */
public class SavingAccount extends BankAccount {

    private int count;

    private double rate;

    public SavingAccount() {
    }

    public SavingAccount(int count) {
        this.count = count;
    }

    public SavingAccount(int count, int balance) {
        super(balance);
        this.count = count;
    }

    public SavingAccount(int count, int balance, double rate) {
        super(balance);
        this.count = count;
        this.rate = rate;
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);

    }

    @Override
    public void deposit(double amount) {
        // 判断是否可以免手续费
        if (count < 3) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        // 判断是否可以免手续费
        if (count < 3) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
