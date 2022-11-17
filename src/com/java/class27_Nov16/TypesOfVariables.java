package com.java.class27_Nov16;
/*
- vars declared at the Class level -> perm vars, they have default value - DO NOT have to be initialized;
  * static
  * non-static(aka instance) - in order to access this from another class we have to create the Object
- vars inside the method, "for" loop, if statement, etc. -> local variable, temp var(short lifetime) - gets destroyed when we leave the method;
- local var MUST be initialized(!), because it doesn't have the Default value, we will get compile-time error if we don't
- local var takes priority;
- we have to PAY ATTENTION to the chronological order in which the things are happening after the starting point of our program -
  which is the "main" method;
- when we know we're only going to create one Object - it doesn't matter if we declare the Class variable as "static" or
  "non-static", but if we know we will be creating multiple Objects in our main method - then, it will make a difference;
- it is important to understand what means "declaring" the variable.. "declaring" = creating new variable
  = reserving a brand-new location in the memory, so we can either "declare" new or "reuse" the same;
- if we need to access the non-static/instance var of the Class we can also decide, whether we want to allow other Classes
  to access our var by defining the access identifiers "public" or "private";
- we cannot use the instance variable in the "static" method (compile-time error) -> because technically -
  the instance variable doesn't exist yet, as we already know that the only time the instance variable gets created,
  is when the Object gets created & Constructor gets called (the last two things happen simultaneously);
 */
class Bank{
    int balance = 50;

    public void method1() {
        // we are declaring brand-new var here - "local"
        // if we have written "balance = 40;" -> this would mean we are re-using the same variable from line 17
        int balance = 40;
        System.out.println(balance);

    }
}

public class TypesOfVariables {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.balance);
        b.method1();
        b.method1();
        System.out.println(b.balance);
    }
}
