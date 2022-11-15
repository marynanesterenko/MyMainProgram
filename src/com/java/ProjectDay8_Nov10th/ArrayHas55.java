package com.java.ProjectDay8_Nov10th;

import java.util.Scanner;

public class ArrayHas55 {
    public static void main(String[] args) {
        /**
         * Given an array of integers.
         * Print true if the array contains a 5 next to a 5
         * else print false
         *
         * EX:
         *
         * Enter numbers:
         * numbers -> [1, 5, 5, 1, 2]
         * Has consecutive 5th: true
         *
         * EX2:
         * Enter numbers:
         * numbers -> [1, 5, 3, 1, 5]
         * Has consecutive 5th: false
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        //TODO WRITE YOUR CODE HERE
        System.out.println(check(numbers));

    }

    public static boolean check(int[] numbers) {
        //TODO IMPLEMENT THIS METHOD
        for (int i = 0; i < numbers.length; i++){

                if (numbers[i] == 5 && numbers[i + 1] == 5){
                    return true;
            }
        }
        return false;
    }
}
