package com.java.class26_Nov15;

public class Bank {
    double balance;
    String accName;
    String accNumber;
/*
- in this Class, we cannot create Constructors with the same Name, same parameter names and their types
- Constructors can have the same Name, BUT that have to have different parameter names and their types
- so, this means that we can only have one blank Constructor
- also, Constructor doesn't have a return type!
- purpose of the Constructor is to initialize the Class variables(aka default variables of the Object when we first create the Object)
- there are differences between the method and the Class: return type(Class doesn't have it)
- method Name doesn't have to be the same as the Class name, in which we are creating it
-
 */

    // even though this Constructor has the same name as the blank Constructor below,
    // still, this Constructor has the parameters - so that is what makes is different from below
    Bank(String accNameFromUser, int balFromUser){
        accName = accNameFromUser;
        balance = balFromUser;
        accNumber = accName + balance;
    }

    // blank Constructor
    Bank(){
        System.out.println("This is hello from constructor");
    }

    void withdraw (double amount){
        balance = balance - amount;
    }

    void deposit (double amount){
        balance = balance + amount;
    }

    void displayPersonalDetails() {
        System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);
    }
}
