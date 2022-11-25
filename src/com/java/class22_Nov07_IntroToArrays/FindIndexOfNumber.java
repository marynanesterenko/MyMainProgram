package com.java.class22_Nov07_IntroToArrays;

/*
Find the index of the number in the array
 */

public class FindIndexOfNumber {
    public static void main(String[] args) {
        int[] data = {12, 34, 56, 23, 76, 33, 74, 32, 21};
        int targetNum = 76;
        System.out.println(findIndex(data, targetNum));
    }

    public static int findIndex (int [] data, int targetNumber) {

        for (int i = 0; i < data.length; i++){
            if (data[i] == targetNumber) {
                return i;
            }
        }
        return -1; // default
    }
}
