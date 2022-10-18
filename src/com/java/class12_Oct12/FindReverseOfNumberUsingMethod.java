package com.java.class12_Oct12;

import java.util.Scanner;

public class FindReverseOfNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number (100 to 999): ");
        int num = sc.nextInt();
        int rev = 0;

        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        System.out.println(rev);
    }
}
