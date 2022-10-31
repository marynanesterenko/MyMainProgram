package com.java.ProjectDay5_Oct20;

import java.util.Scanner;

public class NastyaConverter {
    public static void main(String[] args) {

        /**
         *
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54cm
         *
         * C = (F - 32) × 5/9
         *
         *
         * Example output:
         * Enter amount:
         * 1
         * Enter type:
         * in
         * To:
         * cm
         * Result: 2.54
         *
         */

        Scanner scanner = new Scanner(System.in);
        NastyaConverter converter = new NastyaConverter();
        System.out.println("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter type: ");
        String type = scanner.next();
        System.out.println("Enter the end type: ");
        String to = scanner.next();

        //TODO write your code here

        converter.isWeight(type);
        double result1 = converter.calculateWeight(type, to, amount);
        converter.printResult(result1);

//        converter.isLength(type);
//        double result2 = converter.calculateLength(type, to, amount);
//        converter.printResult(result2);
//
//        converter.isTemperature(type);
//        double result3 = converter.calculateTemperature(type, to, amount);
//        converter.printResult(result3);
    }

    public boolean isWeight(String type) {
        //TODO IMPLEMENT METHOD

        if (type.equalsIgnoreCase("lb") || type.equalsIgnoreCase("oz")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLength(String type) {
        //TODO IMPLEMENT METHOD
        if (type.equalsIgnoreCase("in") || type.equalsIgnoreCase("ft")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTemperature(String type) {
        //TODO IMPLEMENT METHOD
        if (type.equalsIgnoreCase("C") || type.equalsIgnoreCase("F")) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateWeight(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        double weight = 1;
        if (type.equalsIgnoreCase("lb")) {
            if (to.equalsIgnoreCase("kg")) {
                weight = amount * 0.45359237;
            } else if (to.equalsIgnoreCase("g")) {
                weight = amount * 0.45359237 * 1000;
            }
        } else if (type.equalsIgnoreCase("oz")) {
            weight = amount * 28.34952;
        }
        return weight;
    }

    public double calculateLength(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        double length = 1;
        if (type.equalsIgnoreCase("ft")) {
            if (type.equalsIgnoreCase("m")) {
                length = amount * 0.3048;
            } else if (type.equalsIgnoreCase("cm")) {
                length = amount * 30.48 * 100;
            } else if (type.equalsIgnoreCase("in")) {
                length = amount * 2.54;
            }
        }
        return length;
    }

    public double calculateTemperature(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        double temperature = 1;
        if (type.equalsIgnoreCase("С")) {
            if (type.equalsIgnoreCase("F")) {
                temperature = ((amount - 32) * 5 / 9);
            }
        }
        return temperature;
    }

    public void printResult(double result) {
        // TODO IMPLEMENT METHOD
        System.out.println("Your converted result is: " + String.format("%.2f", result));
    }
}

