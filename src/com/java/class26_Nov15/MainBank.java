package com.java.class26_Nov15;
/*
Real life reference:
- nn the memory we have lots of Objects without any data
- we do not allow the User to create the "blank" Object

 */
public class MainBank {

    public static void main(String[] args) {

        /*
        - the second "Bank" is the constructor, it MUST have the same name as Class
        - whenever we create the new Obj - we need to call the constructor
        - and then we need to pass the arguments to the constructor
         */

        Bank acc1 = new Bank("Chirag", 4000);
        Bank acc2 = new Bank("Maria", 5000);
        Bank acc3 = new Bank("Karina", 2000);


        System.out.println(acc1.accNumber);
        System.out.println(acc2.accNumber);
        System.out.println(acc3.accNumber);
    }
}
