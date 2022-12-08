package com.java.class36_Dec07_Abstraction;
/*
1. Abstract Classes cannot be instantiated or initialized directly
   (in other words, we cannot create an object of an Abstract Class)
2. Abstract Classes cannot be final, because the whole point of an Abstract Class is to be extended,
   and if the Class is final - it means that you cannot extend it, and cannot change it.
4. Abstract Class cannot be private either.

   REVISION:
   Patient p; -> declaration of the reference variable
   Patient p = new Patient(); -> declaration of the reference variable and initialization(creation) of an Object

 */
public abstract class Patient {

    // abstract methods do not have any implementation
    public abstract void takeTylenol();

    // we want to create the method that will inquire the payment
    // ChildPatients should be given 10% discount from original price
    // GeneralPatients should pay the original price
    // SeniorPatients should be given 40% discount
    // DisabledPatients should be given the 20% discount

    public abstract void payTheBill();

    // the method should take two parameters: 1) balance and 2) amountReceived
    // and the method should calculate the discount, because on the "group", subtract the amount received
    // and return the remainingBalance


    public abstract double takeThePayment(double billAmount, double amountReceived);
}