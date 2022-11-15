package com.java.class25_Nov14.Homework;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // first we need to create and initialize an Object of the Class "Device"
        // in other words - we need to create an instance of the Class "Device"
        Device cellPhone = new Device();

        // calling the method to give us the full name of the device
        cellPhone.manufacturer = "Apple";
        cellPhone.name = "iPhone";
        cellPhone.version = 14;
        cellPhone.model = "Plus";
        cellPhone.fullName(cellPhone.manufacturer, cellPhone.name, cellPhone.version, cellPhone.model);

        // calling the method to display the storage options for the customer
        cellPhone.displayFullPriceBasedOnStorage(cellPhone.storages);

        // calling the method to calculate the monthly price for us
        cellPhone.isContract = true;
        cellPhone.currency = '$';
        System.out.println("\nPlease enter the desired storage for your device: ");
        cellPhone.desiredStorage = sc.nextInt();
        cellPhone.calculatePricePerMonth(true, cellPhone.desiredStorage );

    }
}
