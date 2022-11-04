package com.java.ProjectDay7_Nov3rd;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your address as shown on the example below: " +
                           "\n2400 E Devon Ave #215, Des Plaines, IL 60018");

        String input = sc.nextLine();
        String streetAddress = getStreetAddress(input);
        String city = getCity(input);
        String state = getState(input);
        int zip = getZipcode(input);

        System.out.println( "\nYour street address is: " + streetAddress +
                            "\nYour city name is: " + city +
                            "\nYour state name is: " + state +
                            "\nYour zip code is: " + zip);
    }
    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {
        int firstComma = address.indexOf(",");
        return address.substring(0, firstComma);
    }

    public static String getCity(String address) {
        int firstComma = address.indexOf(",");
        int lastComma = address.lastIndexOf(",");
        return address.substring(firstComma + 2, lastComma);
    }

    public static String getState(String address) {
        int lastComma = address.lastIndexOf(",");
        int lastSpace = address.lastIndexOf(" ");
        return address.substring(lastComma + 2, lastSpace);
    }

    public static int getZipcode(String address) {
        int lastSpace = address.lastIndexOf(" ");

        return Integer.parseInt(address.substring(lastSpace + 1));
    }
}
