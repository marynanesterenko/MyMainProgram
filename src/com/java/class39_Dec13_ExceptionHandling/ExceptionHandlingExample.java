package com.java.class39_Dec13_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");

        try {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException mismatch){
            System.out.println("Please enter number only!");
        } catch (ArithmeticException arithmetic) {
            System.out.println("You cannot divide by zero!");
        } catch (Exception e){

        }
        System.out.println("Nice to see you");

    }
}
