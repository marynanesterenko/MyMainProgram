package com.java.class40_Dec14_CheckedAndUnCheckedExceptions;

public class ExceptionHandling  {
    public static void main(String[] args) {

    }

    // unchecked - runtime exception - it is when the compiler doesn't understand, that we are throwing the exception
    // not required to be handled, compiler doesn't complain, when statements are throwing run time exceptions
    public static void method1 (){
        throw new RuntimeException("Hello! You've got exception!");
    }

    /*
       - checked - "compile time exception" - we have to handle it whether with the "try - catch" statement, or we can add
         an exception to a method signature, using the "throw" keyword - we let other methods know that "this particular method"
         throws an exception, in other words - the method is warning other methods: "hey, before you call me -
         you need to handle the exception, that I am throwing!"
       - to think about it, if we do not handle our "compile time - checked" exception we cannot even run our program,
         as long as the compiler is happy, so that we can at least run the program - then we have an option to whether
         handle our runtime exception, so we can execute our program, or not to handle the runtime exception - but, then we have
         to keep in mind, that we cannot execute our program - if we have "unhandled runtime exceptions"
     */

    public static void method2() {
        // throw new FileNotFoundException("Hello! You've got another exception!");
    }


    public static void method3(){
        method2();
    }
}
