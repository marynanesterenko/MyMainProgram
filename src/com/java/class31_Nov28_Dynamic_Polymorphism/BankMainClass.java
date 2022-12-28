package com.java.class31_Nov28_dynamic_polymorphism;
// USER
public class BankMainClass {
    public static void main(String[] args) {
        // Object of the Child Class
        ChaseBank chiragAccCB = new ChaseBank();
        BankOfAmerica chiragBOA= new BankOfAmerica();
        WellsFargo chiragWF = new WellsFargo();

        PayPal pp = new PayPal();
        pp.checkBalance(chiragAccCB);
        pp.checkBalance(chiragBOA);
        pp.checkBalance(chiragWF);
    }
}

