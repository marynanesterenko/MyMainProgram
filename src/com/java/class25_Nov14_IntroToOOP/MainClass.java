package com.java.class25_Nov14_IntroToOOP;
// "Runnable" Class - main
// "main" is the starting point for the program to start running
public class MainClass {
    public static void main(String[] args) {
        // creating and initializing two instances of the Class Bank:

        // Object acc1
        Bank acc1 = new Bank();
        acc1.balance = 1000;
        acc1.accName = "Maryna";
        acc1.accNumber = "M123456789";
        // calling the method "deposit" from the Class "Bank"
        // and passing 3000 as an argument to be stored in the "amount" variable
        acc1.deposit(3000);
        System.out.println(acc1.balance);

        // Object acc2
        Bank acc2 = new Bank();
        acc2.balance = 5000;
        acc2.accName = "Chirag";
        acc2.accNumber = "C123456789";
        // calling the method "withdraw" from the Class "Bank"
        // and passing 4000 as an argument to be stored in the "amount" variable
        acc2.withdraw(4000);
        System.out.println(acc2.balance);
        acc2.transferMoney("Maryna", 4000);

    }
}
