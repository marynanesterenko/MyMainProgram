package com.java.class08;

import java.util.Scanner;

public class HomeworkTask4_Oct04 {
    public static void main(String[] args) {
        /*
        Task#4 - Write a program to letter given character is a vowel or not:
        Vowel characters are - a, e, i, o, u.
        Example
        Input - c
        Output - Not Vowel
        Input - a
        Output - Vowel
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a letter and I will tell you whether it is a vowel of not: ");

        char letter = sc.next().charAt(0);
        if(letter =='a'|| letter =='e' || letter == 'i' || letter == 'o'|| letter == 'u'
                || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
            System.out.println("Entered letter "+ letter +" is  vowel");
        }
        else if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
            System.out.println("Entered letter " + letter + " is consonant.");
        else
            System.out.println("Not an alphabet");
    }
}
