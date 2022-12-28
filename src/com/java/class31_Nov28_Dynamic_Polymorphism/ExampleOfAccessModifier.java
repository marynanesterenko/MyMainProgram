package com.java.class31_Nov28_Dynamic_Polymorphism;

public class ExampleOfAccessModifier {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        // System.out.println(b.balance); // private -> cant access
        System.out.println(b.accName); // default
        System.out.println(b.accNumber); // public
        System.out.println(b.nomineeDetails);// protected
    }
}
