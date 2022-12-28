package com.java.LeetCode;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    /*
    1. It is impossible to change the length of an Question13_ArrayElementsWithComplexIndex
    2. "Assert" - Java keyword, used to define an assert statement;
        assert statement is used to declare an expected boolean condition in the program.
        If the program is running with the assertions enabled, then the condition is checked
        at runtime. If the condition is false - the Java runtime system throws an AssertionError.
     */
    public static void main(String[] args) {
        System.out.println("\nEnter ten whole numbers and I will find the greatest amongst them!");
        System.out.println("The duplicates have been removed: " + removeDuplicates(takeTheNumbersFromTheUser()));
    }

    public static int[] takeTheNumbersFromTheUser() {
        Scanner sc = new Scanner(System.in);
        int[] numbersFromTheUser = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            numbersFromTheUser[i] = number;
        }
        System.out.println("The numbers you have entered are: ");
        for (int k = 0; k < numbersFromTheUser.length; k++) {
            System.out.println(numbersFromTheUser[k]);
        }
        return numbersFromTheUser;
    }

    public static int removeDuplicates (int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++){

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
