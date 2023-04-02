package com.bootcoding.assignment;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int accountNumber;
    private double initialBalance;
    private List<Double> withdrawTransactions = new ArrayList<>();
    private double totalBalance;

    public void addTransaction(double amount){
        withdrawTransactions.add(amount);
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    
    

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public List<Double> getWithdrawTransactions() {
        
        return withdrawTransactions;
    }

    public void setWithdrawTransactions(List<Double> withdrawTransactions) {
        this.withdrawTransactions = withdrawTransactions;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
