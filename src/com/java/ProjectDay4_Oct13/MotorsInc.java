package com.java.ProjectDay4_Oct13;

import java.util.Scanner;

public class MotorsInc {
        public static void main(String[] args) {

            /**
             * Java Motors Inc. is recalling all vehicles from model years 2001-2002, 2004-2006 and 2015-2017.
             * Write a program that will find vehicle for recall.
             *
             * example output:
             * out: Enter vehicle's year:
             * in: 2001
             * out: Your vehicle needs to be recalled!
             *
             *  if the value of modelYear does fall within the four recall ranges
             *  out: Your vehicle is fine, enjoy!
             */


            Scanner input = new Scanner(System.in);
            int vehicleYear = 0;
            String result = "";


            //TODO write your code here
            System.out.println("Enter vehicle's year: ");
            vehicleYear = input.nextInt();

            if (vehicleYear >= 2001 && vehicleYear <= 2002) {
                System.out.println();
            } else if (vehicleYear >= 2004 && vehicleYear <= 2006) {
                System.out.println("Your vehicle needs to be recalled!");
            } else if (vehicleYear >= 2015 && vehicleYear <= 2017) {
                System.out.println("Your vehicle needs to be recalled!");
            } else {
                System.out.println("Your vehicle is fine, enjoy!");
                // ignore this ...
                // Validation.testVehicle(vehicleYear, result);
            }
        }
}
