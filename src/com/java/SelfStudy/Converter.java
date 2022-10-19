package com.java.SelfStudy;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        /**
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54 cm
         *
         * C = (F - 32) × 5/9
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

        //TODO write your code here
        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter type: ");
        String type = scanner.nextLine();

        System.out.println("To: ");
        String to = scanner.nextLine();

        Converter converter = new Converter();

        if (converter.isWeight(type)) {
            converter.printResult(converter.calculateWeight(type, to, amount));
        } else if (converter.isLength(type)) {
            converter.printResult(converter.calculateLength(type, to, amount));
        } else if (converter.isTemperature(type)) {
            converter.printResult(converter.calculateTemperature(type, to, amount));
        } else {
            System.out.println("Invalid data..");
        }

    }

    public boolean isWeight(String type) {
        return type.equalsIgnoreCase("lb") || type.equalsIgnoreCase("oz");
    }

    public boolean isLength(String type) {
        return type.equalsIgnoreCase("in") || type.equalsIgnoreCase("ft");
    }

    public boolean isTemperature(String type) {
        return type.equalsIgnoreCase("f");
    }

    public double calculateWeight(String type, String to, double amount) {

        if (type.equalsIgnoreCase("lb") && to.equalsIgnoreCase("kg")) {
            return amount * 0.45359237;
        }

        if (type.equalsIgnoreCase("oz")  && to.equalsIgnoreCase("g")) {
            return amount * 28.34952;
        }

        return -1;
    }

    public double calculateLength(String type, String to, double amount) {
        if (type.equalsIgnoreCase("ft") && to.equalsIgnoreCase("m")) {
            return amount * 0.3048;
        }

        if (type.equalsIgnoreCase("ft")  && to.equalsIgnoreCase("cm")) {
            return amount * 30.48;
        }

        if (type.equalsIgnoreCase("in")  && to.equalsIgnoreCase("cm")) {
            return amount * 2.54;
        }

        return -1;
    }

    public double calculateTemperature(String type, String to, double amount) {
        if (type.equalsIgnoreCase("f")  && to.equalsIgnoreCase("c")) {
            return (amount - 32) * 5/9;
        }
        return -1;
    }

    public void printResult(double result) {
        System.out.println("Result is " + result);
    }

}
