package com.java.class06;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        int ageMonths = age * 12;
        System.out.println("You have spent " + ageMonths + " months on Earths");

        int ageDays = age * 365;
        System.out.println("You have spent " + ageDays + " days on Earths");

        int ageMinutes = age * 525960;
        System.out.println("You have spent " + ageMinutes + " minutes on Earths");

    }
}
