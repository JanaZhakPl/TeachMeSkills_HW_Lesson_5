package com.teachmeskills.lesson_5.Task0;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    double balance;

    public CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void isIncreased(double rechargeAmount) {
        this.balance = balance + rechargeAmount;
    }

    public void isReduced(double withdrawalAmount) {
        if (balance >= withdrawalAmount) {
            this.balance = balance - withdrawalAmount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void cardInformation() {
        System.out.println("Account number: " + accountNumber + " with Balance " + balance);
    }
}