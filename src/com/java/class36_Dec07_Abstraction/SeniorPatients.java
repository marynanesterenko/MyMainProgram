package com.java.class36_Dec07_Abstraction;

public class SeniorPatients extends Patient{
    @Override
    public void takeTylenol(){
        System.out.println("Your recommended dosage is 500 mg");
    }

    @Override
    public void payTheBill() {
        System.out.println("You get 40% off full price");
    }

    public double takeThePayment(double billAmount, double amountReceived) {
        double discount = 0.4;
        double billAfterDiscount = billAmount * discount;

        return billAfterDiscount - amountReceived;
    }
}
