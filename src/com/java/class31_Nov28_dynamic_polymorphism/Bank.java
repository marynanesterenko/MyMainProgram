package com.java.class31_Nov28_dynamic_polymorphism;
// Banks
public class Bank {
    int balance;
    public void checkBalance(){
        System.out.println(balance);
    }

    public void withdraw (int amount){
        balance = balance - amount;
        System.out.println("Available balance - " + balance);
    }

    // we need this method in the parent class, so that we can call it from PayPal
    public void displayRateOfInterest(){
        System.out.println("3.0");
    }
}

class ChaseBank extends Bank{
    // method gets overridden, because the sub-class wants to utilize it in it's own way
    public void displayRateOfInterest(){
        System.out.println("3.0");
    }
}

class BankOfAmerica extends Bank {
    // method gets overridden
    public void displayRateOfInterest(){
        System.out.println("3.0");
    }

}

class WellsFargo extends Bank {
    // method gets overridden
    public void displayRateOfInterest(){
        System.out.println("3.0");
    }
}
