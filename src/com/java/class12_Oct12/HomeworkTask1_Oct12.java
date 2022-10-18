package com.java.class12_Oct12;
import java.util.Scanner;
public class HomeworkTask1_Oct12 {
    /*
    1. Write a program to take three numbers from user
     and find reverse of the greatest number (3-digit number)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter three 3-digit numbers, excluding negatives, and those that end with two zeroes, " +
                "and the one, which is the greatest amongst them, I will print out in reverse for you! ");
        System.out.println("\nPlease enter the first number: ");
        int number1 = sc.nextInt();

        System.out.println("Please enter the second number: ");
        int number2 = sc.nextInt();

        System.out.println("Please enter the third number: ");
        int number3 = sc.nextInt();

        int maxNumber = findTheGreatest(number1, number2, number3);
        System.out.println("The greatest number is: " + maxNumber);
        System.out.println("Your reversed number is: " + reverseTheNumber(maxNumber));
    }
    static int findTheGreatest (int num1, int num2, int num3){
        int theGreatestNumber = 0;
        if (num1 > 0 && num1 < 999 && num2 > 0 && num2 < 999 && num3 > 0 && num3 < 999 &&
            num1 % 100 != 0 && num2 % 100 != 0 && num3 % 100 != 0) {
            if (num1 > num2 && num1 > num3 && num2 != num3) {
                theGreatestNumber = num1;
            } else if (num2 > num1 && num2 > num3 && num1 != num3) {
                theGreatestNumber = num2;
            } else if (num3 > num1 && num3 > num2 && num1 != num2) {
                theGreatestNumber = num3;
            } else if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal!");
            }
        } else {
            System.out.println("Please enter the number according to the requirements!");
        }
        return theGreatestNumber;
    }
    static int reverseTheNumber (int result) {
        int theReversedNumber = 0;
        while (result > 0) {
            theReversedNumber = theReversedNumber * 10 + result %10;
            result = result / 10;
        }
        return theReversedNumber;
    }
}
