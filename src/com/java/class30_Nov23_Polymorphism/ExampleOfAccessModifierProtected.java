package com.java.class30_Nov23_Polymorphism;

import com.java.class31_Nov28_Dynamic_Polymorphism.Bank1;

public class ExampleOfAccessModifierProtected extends Bank1{
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        // System.out.println(b.balance); // private -> cant access
        System.out.println(b.accName); // default
        // System.out.println(b.accNumber); // public
        System.out.println(nomineeDetails);// protected
    }
}
