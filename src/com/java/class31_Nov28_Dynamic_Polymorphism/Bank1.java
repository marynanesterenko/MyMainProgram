package com.java.class31_Nov28_Dynamic_Polymorphism;
/*
INTERVIEW: most likely we will get abstraction, polymorphism, method overloading
What is encapsulation?
private - access modifier / specifier
Access modifiers:
- public - everywhere
- private - within the class
- protected - within the package + outside the package only in sub-class
- default - within the package only
 */

public class Bank1{ // this Class has a default access modifier, we need to make it public
    private int balance;
    String accNumber;
    public String accName;
    static protected String nomineeDetails;

}
class AmexBank extends Bank1 {

    void method1(){
        // System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);
        System.out.println(nomineeDetails);
    }

}

class MainEncapsulation {
    public static void main(String[] args) {

    }
}
