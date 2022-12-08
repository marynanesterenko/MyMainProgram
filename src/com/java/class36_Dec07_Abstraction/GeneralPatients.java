package com.java.class36_Dec07_Abstraction;

public class GeneralPatients extends Patient{
    @Override
    public void takeTylenol(){
        System.out.println("Your recommended dosage is 250 mg");
    }

    @Override
    public void payTheBill() {
        System.out.println("You are paying the full price");
    }
    @Override
    public double takeThePayment(double billAmount, double amountReceived) {

        return billAmount - amountReceived;
    }
}
