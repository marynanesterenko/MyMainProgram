package com.java.class17_Oct25_NestereForLoopPractice;

import java.util.Scanner;

public class HomeworkTask_Oct25_NestedForLoop {
    public static void main(String[] args) {
    /*
    1. Visually break the number into two shapes
    2. Regardless whether the User enters an Odd or Even number, the middle row will always equal to the entered number / 2 and + 1
    3. Since technically now we know the first and the second range of numbers we will be iterating through, we will be using the for loop
    4. First range [1; number/2 + 1]
    5. Second range, since we are starting to print spaces and As from the bottom of the second shape []
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num/2 + 1; i++) {
            for (int s = 1; s <= num-i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("A");
            }
            System.out.println();
        }

        for (int i = num/2; i >= 1; i--) {
            for (int s = num - i; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j >= 1; j--){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}



