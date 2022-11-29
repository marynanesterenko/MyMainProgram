package com.java.class31_Nov28_dynamic_polymorphism;
/*
What is encapsulation?
private - access modifier / specifier
Access modifiers:
- public
- private
- protected
- default
 */
class AmexBank {

    int balance;

    AmexBank(int balance){
        this.balance = balance;
    }

    void withdraw (int amount){
        balance = balance - amount;
    }

    void checkBalance(){
        System.out.println(balance);
    }
}

public class MainEncapsulation {
    public static void main(String[] args) {
        AmexBank amex = new AmexBank(1000);
        amex.checkBalance();
        amex.withdraw(500);
        amex.checkBalance();
        amex.balance = 10000000;
    }
}
