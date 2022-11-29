package com.java.class31_Nov28_dynamic_polymorphism;
// PayPal
public class PayPal {

    // instead of cb there can be any name
    // if we did not have the "public" key word it would have still worked
    // parameters are the local variables too, because it is declared inside the method
    // one method for one feature

    public void checkBalance(Bank b){
        b.checkBalance();
    }
}
