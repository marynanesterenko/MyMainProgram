package com.java.class18_Oct26;
import java.util.Scanner;
public class PalindromeUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;

        while (num != 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println("Reverse number is: " + rev);


        if (originalNum == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


        }
    }
