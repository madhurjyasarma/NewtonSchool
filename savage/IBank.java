package com.savage;

public interface IBank{
    public void deposit(int fund);
    public boolean withdraw(int fund);
    public int getBalance();
    public  int getAccountNumber();
}
