package com.java.class09_Oct05_NesteredIfElse;

import java.util.Scanner;

public class Bators {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter age: ");
            int age = sc.nextInt();
            System.out.println("Please enter salary: ");
            int salary = sc.nextInt();

            if (age >= 18) {
                if (salary <= 5000) {
                    System.out.println("work hard");
                } else if (salary >= 20000) {
                    System.out.println("CC is free for U!!!");
                } else if (salary > 5001) {
                    System.out.println("you're eligible");
                }
            }
            else {
                    System.out.println("you're not eligible");
                 }

        }
    }

