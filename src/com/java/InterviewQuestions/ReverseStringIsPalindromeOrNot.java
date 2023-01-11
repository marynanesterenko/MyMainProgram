package com.java.InterviewQuestions;
import java.util.Scanner;
/*
1. We can first write the method to reverse a string. Using the Scanner in the main method we take the string from the User,'
   and then we pass that "collected" string as an argument to our reverseString() method.
2. When that is done, we can reverse our returned value from the reverseString() method into a variable and pass it as
   an argument to the palindromeOrNot() method. In this method we will just use the if else statement to compare the
   original string and the
 */
public class ReverseStringIsPalindromeOrNot {
    public static void main(String[] args) {

        // first, we need to ask a User to enter a String they want to check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        // here we are just going to modify the string and replace all spaces to an empty string
        // \\s+ -> replaces 1 or more spaces
        String str = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        // create a variable that will be adding and storing all the characters in the string starting from the end
        String reversed = "";

        // loop through the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }


        if (str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
