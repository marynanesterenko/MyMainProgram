package com.java.class13_Oct17_ForLoopsPractice;

import java.util.Scanner;

public class HomeworkTask2_Oct17_FindTheGreatestOutOfFour {

    public static void main(String[] args) {
        System.out.println("\nEnter four whole numbers and I will find the greatest amongst them!");
        System.out.println("The greatest number is: " + findTheGreatestNumber(takeTheNumbersFromTheUser()));
        }

    public static int[] takeTheNumbersFromTheUser() {
        Scanner sc = new Scanner(System.in);
        int[] numbersFromTheUser = new int[4];
        for (int i = 0; i < 4; i++) {
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

    public static int findTheGreatestNumber (int [] numbersToCompare) {
        int theGreatestNumber = numbersToCompare[0];
        for (int j = 0; j < numbersToCompare.length; j++) {
            if (numbersToCompare[j] > theGreatestNumber) {
                theGreatestNumber = numbersToCompare[j];
            }
        } return theGreatestNumber;
    }
}