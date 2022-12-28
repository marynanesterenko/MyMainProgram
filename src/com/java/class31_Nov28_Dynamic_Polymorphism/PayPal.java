package com.java.class31_Nov28_Dynamic_Polymorphism;
// PayPal

public class PayPal {

    // Bank b here is an example of polymorphism, in particular
    // the act of this method storing the Object of one of the Banks
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
