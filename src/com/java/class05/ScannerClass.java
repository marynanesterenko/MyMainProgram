package com.java.class05;
import java.util.Scanner;

public class ScannerClass {
    // ScannerClass class doesn't contain the main method
    // ScannerClass class includes some variables, constructors and some different methods
    // With the help of constructors, we instantiate (create) objects from these classes
    // We can create as many Objects as we want from a single Class
    // Each of these Objects will have their own set of instance variables
    // And we call the methods of these Objects to perform the tasks
    // The pre-defined Classes (just like ScannerClass Class) are organized in the form of Packages
    // Package is the collection of Classes
    // Before we can use the class, we need to either import the entire package or the class (import java.util.ScannerClass)
    // System Class, for example, contains two pre-defined streams: out and in
    // "out" stream is connected to the console and "in" stream is connected to the keyboard
    // System.in -> 'System' is a pre-defined Class, 'in' is variable in that class
    // 'in' holds a reference to an input stream object
    // to create an Object from the Class we use the constructor of that Class
    // ScannerClass s = new ScannerClass (System.in)
    // here "ScannerClass" on the right is the constructor to which we are passing an argument in a form of input stream object
    // and again, our argument consists of the ".in" - reference variable to the ScannerClass Class
    // the proper way to access the variable of another class is to refer to it's name by specifying the class name followed by a dot operator and the variable name
    /*

    ScannerClass Class methods are the following:
    nextByte()
    nextShort()
    nextInt()
    nextLong()
    next() -> single word
    nextLine() -> line of String
    nextBoolean()
    nextFloat()
    nextDouble()
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Your sum of two numbers is: " + (a + b));

    }

}
