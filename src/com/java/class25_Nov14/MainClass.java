package com.java.class25_Nov14;

public class MainClass {
    public static void main(String[] args) {
        // create and initialize an Object
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "Maryna";

        acc2.balance = 5000;
        acc2.accName = "Chirag";

        acc1.deposit(3000); // calling the method "deposit" from the Class "Bank"
        acc2.withdraw(4000); // calling the method "withdraw" from the Class "Bank"

        System.out.println(acc1.balance);
        System.out.println(acc2.balance);

    }


}
