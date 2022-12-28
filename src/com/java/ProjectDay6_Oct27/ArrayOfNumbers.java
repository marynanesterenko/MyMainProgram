package com.java.ProjectDay6_Oct27;

import java.util.Scanner;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        /**
         * Write a program that checks the presence of a number in an array.
         * Question13_ArrayElementsWithComplexIndex is a collection of similar data elements stored at contiguous memory locations.
         * It is the simplest data structure where each data element
         * can be accessed directly by only using its index number
         *
         * Example output:
         *
         * Enter the number: 53
         * PRESENT
         *
         * Example output 2:
         *
         * Enter the number: 1
         * NOT PRESENT
         *
         * TIPS:
         * array[index] -> get the number at index from an array
         * array.length -> get the length of an array
         */
        Scanner sc = new Scanner(System.in);
        int[] array = {25, 89, 26, 85};
        int numberToBeFound;

        // TODO WRITE CODE HERE
        System.out.println("Please enter the number: ");
        numberToBeFound = sc.nextInt();

        System.out.println(checkPresence(array, numberToBeFound));
    }

    public static String checkPresence(int[] array, int numberToBeFound) {
        // TODO IMPLEMENT METHOD

        boolean found = false;
        for (int i = 0; i < array.length; i++)
        {
            int count = array[i];
            if (count == numberToBeFound) {
                found = true;
                break;
            }
        }

        String result = " ";
        if (found){
            result = "PRESENT";
        } else {
            result = "NOT PRESENT";
        }
        return result;
    }
}
