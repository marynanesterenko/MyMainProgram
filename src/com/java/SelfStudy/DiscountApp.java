package com.java.SelfStudy;

import java.util.Scanner;

public class DiscountApp {
    /**
     * Write a java program to calculate discount for a product
     * <p>
     * sample output:
     * marked price:
     * 100
     * discount rate:
     * 25
     * amount after discount: 75.0
     */

    public static class Discount {

        public static void main(String[] args) {

            double markedPrice, discount, amount;
            Scanner scanner = new Scanner(System.in);
            Discount discountObj = new Discount();

            System.out.println("Marked price: ");
            markedPrice = scanner.nextDouble();
            System.out.println("Discount rate: ");
            discount = scanner.nextDouble();
            amount = markedPrice - discountObj.calculateDiscount(markedPrice, discount);
            discountObj.printMessage("amount after discount: " + amount);

        }

        public double calculateDiscount(double markedPrice, double discount) {
            return markedPrice * discount / 100;
        }

        public void printMessage(String message) {
            System.out.println(message);

        }
    }
}
