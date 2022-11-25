package com.java.class26_Nov15_PracticeOOP;
/*
"real life reference":
- in the memory we have lots of Objects without any data
- we do not allow the User to create the "blank" Object
 */
public class MainBank {

    public static void main(String[] args) {

        /*
        - the second "Bank" is the Constructor, it MUST have the same name as Class(in our case "Bank")!
        - whenever we create the new Obj (i.e. acc1, acc2..etc.) -
          the first thing that happens - the Constructor gets called;
        - as it[Constructor] gets called, it looks at the arguments we passed to it here(on the left),
          stores the values of those arguments in the parameter variables that we declare in parentheses
          where we defined our Constructor(on the right),
          and uses those values to perform whatever action is
          described inside the defined Constructor's block of code(on the right)
         */

        Bank acc1 = new Bank("Chirag", 4000);
        Bank acc2 = new Bank("Maria", 5000);
        Bank acc3 = new Bank("Karina", 2000);
        Bank acc4 = new Bank();

        System.out.println(acc1.accNumber);
        System.out.println(acc2.accNumber);
        System.out.println(acc3.accNumber);
    }
}
