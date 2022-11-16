package com.java.class26_Nov15;

public class Bank {
    double balance;
    String accName;
    String accNumber;

    Bank(String accNameFromUser, int balFromUser){
        accName = accNameFromUser;
        balance = balFromUser;
    }

    void withdraw (double amount){
        balance = balance - amount;
    }

    void deposit (double amount){
        balance = balance + amount;
    }

    void displayPersonalDetails() {
        System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);
    }


}
