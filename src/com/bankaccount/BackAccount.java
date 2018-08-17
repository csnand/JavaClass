package com.bankaccount;

public class BackAccount {

    public int accountNumber;
    public String accountName;
    public double balance;
    public double overdraft;

    public BackAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double withdrawMoney(double amount){
        if (amount <= (balance + overdraft)) {
            balance = balance - amount;
            return amount;
        } else {
            System.err.println("You do not have enough funds.");
            return 0;
        }
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

}
