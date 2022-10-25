package com.java.class15_Oct19;

import java.util.Scanner;

public class HomeworkTask4_Oct19_PrintEachDigitInSeparateLineInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and I will print each digit separately in reverse: \n");
        int number = sc.nextInt();

        while (number !=  0) {
            System.out.println(number % 10); // printing the last digit to the console
            number = number / 10;
            // here the "new" number is now the original number without the last digit
            // and as long as it is not equal to 0, we will repeat the those statements in the "while" code block
            // basically we keep taking the last digit away from every next "new" number and printing it out
        }
    }
}
