package com.java.class36_Dec07_Abstraction;

public class DisabledPatients extends Patient{
    @Override
    public void takeTylenol(){
        System.out.println("Your recommended dosage is 200 mg");
    }

    @Override
    public void payTheBill() {
        System.out.println("You get 20% off full price");
    }

    @Override
    public double takeThePayment(double billAmount, double amountReceived) {
        double discount = 0.2;
        double billAfterDiscount = billAmount * discount;

        return billAfterDiscount - amountReceived;
    }
}
