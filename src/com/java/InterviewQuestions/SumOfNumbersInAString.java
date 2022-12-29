package com.java.InterviewQuestions;

public class SumOfNumbersInAString {
    public static void main(String[] args) {
        // Sum all the digits in a given string
        // "Apple34lrlf9sj3f9" - 3, 4, 9, 3, 9

        /*
        Solution 1: we can use replaceAll() method
                    String nums = str.replaceAll("[^0-9]", "");
         */

        String str = "Apple34lrlf9sj3f9";

        // declare the variable, which will be storing the sum every time our program will run into the number
        int sum = 0;

        // loop through the given string
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("Sum of all the numbers in the given sting is - " + sum);
    }
}
