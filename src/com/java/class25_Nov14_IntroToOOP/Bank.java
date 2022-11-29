package com.java.class25_Nov14_IntroToOOP;
// this Class is the "design", or we can say a blueprint
// based on the design of this Class - we will create an Object in the "MainClass"
// Java is not a fully OOP language, because it still has the primitive Data Types(variables)
public class Bank {
    // instance variables
    String accName;
    String accNumber;
    double balance;
    int routingNumber;
    char typeOfAccount;
    String currency;

    // instance methods
    void deposit(double amount){
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void transferMoney(String accName, double amount){
        System.out.println("Transferring " + amount + " to " + accNumber);
    }
}
