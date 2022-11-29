package com.java.class31_Nov28_dynamic_polymorphism;
// PayPal

public class PayPal {
    void checkBalance(Bank b){
        b.checkBalance();
    }

    void displayInterest(Bank b){
        b.displayRateOfInterest();
    }

    void withdraw (Bank b, int amount){
        b.withdraw(amount);
    }
}
