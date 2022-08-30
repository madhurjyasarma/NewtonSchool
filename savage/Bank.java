package com.savage;

class Bank implements IBank {
    public String name;
    public int balance;
    public int accountNumber;


    Bank(int balance, String name, int accountNumber) {
        this.balance = balance;
        this.name = name;
        this.accountNumber =accountNumber;
    }

    public void deposit(int fund) {
        balance = balance + fund;
        System.out.println(balance);
    }

    public boolean withdraw(int fund) {
        if (balance - fund >0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public static void main(String[] args) {
        Bank bk= new Bank(120,"Madhurjya",1123);
//        if(bk. getBalance() == 120)
//            System. out. println("Correct");
//        else
//            System. out. println("Wrong");


        System.out.println("Balance: "+bk.balance);
        System.out.println("name: "+bk.name);
        System.out.println("Ac number: "+bk.accountNumber);

        System.out.println("balance: "+ bk.getBalance());
        System.out.println("Ac number: "+ bk.getAccountNumber());

        bk.deposit(500);
        System.out.println("balance: "+ bk.getBalance());
        System.out.println(bk.withdraw(15500));

    }
}
