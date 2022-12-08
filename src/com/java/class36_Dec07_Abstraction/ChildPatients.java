package com.java.class36_Dec07_Abstraction;

public class ChildPatients extends Patient{
    @Override
    public void takeTylenol(){
        System.out.println("Your recommended dosage is 5 mg");
    }

    @Override
    public void payTheBill() {
        System.out.println("You get 10% off the full price");
    }

    public double takeThePayment(double billAmount, double amountReceived) {
        double discount = 0.1;
        double billAfterDiscount = billAmount * discount;

        return billAfterDiscount - amountReceived;
    }
}
