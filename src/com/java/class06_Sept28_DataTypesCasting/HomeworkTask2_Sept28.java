package com.java.class06_Sept28_DataTypesCasting;

import java.util.Scanner;

public class HomeworkTask2_Sept28 {
    // Task 2. Write a program to get principle, rate of interest and number of years from the user
    // and calculate simple interest

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Lets calculate how much interest you are being charged!" +
                "\nPlease enter the principal of your loan (in $): ");
        double principal = sc.nextDouble();

        System.out.println("Thank you! Now enter the rate of interest on your loan (in %): ");
        double rateOfInterest = sc.nextDouble()/100;

        System.out.println("Thank you, almost there! I just need the number of years you have had this loan for: ");
        double years = sc.nextDouble();

        double simpleInterest = principal * rateOfInterest * years;
        System.out.println("Here is the interest you are currently paying on your loan: " + "$" + simpleInterest);

    }
}
