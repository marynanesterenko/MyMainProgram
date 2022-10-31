package com.java.class18_Oct26;

import java.util.Scanner;

public class FindFactorsOfTheNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i > 0; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
