package com.java.class31_Nov28_dynamic_polymorphism;

public class BankMainClass {
    public static void main(String[] args) {
        ChaseBank chiragAccCB = new ChaseBank();
        BankOfAmerica chiragBOA= new BankOfAmerica();

        chiragAccCB.displayRateOfInterest();
        chiragAccCB.checkBalance();

        chiragBOA.displayRateOfInterest();
        chiragBOA.withdraw(500);
    }
}

