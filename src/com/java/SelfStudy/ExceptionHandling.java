package com.java.SelfStudy;

import java.util.*;
// we do "*" on purpose, so that we know for sure that the InputMismatchException Class will be imported, along with Scanner

public class ExceptionHandling {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You have entered: " + i);
    }

    public static int GetAnInteger(){
        while (true) {
            try {
                // if the User enters an integer, this is the only statement that will get executed
                return sc.nextInt();
            } catch (InputMismatchException e) {
                // we have to call this method here to discard the User's invalid input, otherwise
                // the while loop will keep reading this invalid input -> throw an error -> display an error message, repeat
                sc.next();
                System.out.println("That is not an integer. Please try again!");
            }
        }
    }
}
