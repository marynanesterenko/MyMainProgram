package com.java.ProjectDay5_Oct20;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        int freeBooks, numberOfBooksPurchased;
        boolean isPremiumCustomer = false;
        Scanner scan = new Scanner(System.in);
        BookShop bookShop = new BookShop(); //Object of the class.
        /**
         * Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
         * and offers 2 free books with every purchase of 8 or more books.
         * It offers regular customers 1 free book with every purchase of 7 or more books
         * and offers 2 free books with every purchase of 12 or more books.
         *
         * Write a program to calculate number of free books.
         *
         *  sample output:
         * Are you a premium customer?
         * true
         * How many books for purchase?
         * 9
         * You qualify for 2 free books
         *
         */
        //TODO write your code here
        System.out.println("Are you a premium customer? Please answer true for yes false for no.");
        isPremiumCustomer = scan.hasNextBoolean();
        scan.nextLine();
        System.out.println("How may books are you going to be purchasing?");
        numberOfBooksPurchased = scan.nextInt();
        freeBooks = bookShop.countFreeBooks(isPremiumCustomer, numberOfBooksPurchased);
        System.out.printf("You qualify for %s free book(s).", freeBooks);
    }
    public int countFreeBooks(boolean isPremiumCustomer, int numberOfBooks) {
        //TODO implement method
        int freeBooks = 0;
        if (isPremiumCustomer){
            if (numberOfBooks >= 5 && numberOfBooks < 7){
                freeBooks = 1;
            } else if (numberOfBooks >= 7){
                freeBooks = 2;
            } else {
                freeBooks = 0;
            }
        }else {
            if (numberOfBooks >= 7 && numberOfBooks < 12){
                freeBooks = 1;
            } else if (numberOfBooks >= 12){
                freeBooks = 2;
            } else {
                freeBooks = 0;
            }
        }
        return freeBooks;
    }
}
