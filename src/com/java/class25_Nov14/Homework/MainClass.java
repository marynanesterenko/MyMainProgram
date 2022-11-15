package com.java.class25_Nov14.Homework;

public class MainClass {
    public static void main(String[] args) {
        // first we need to create and initialize an Object of the Class "Device"
        // in other words - we need to create an instance of the Class "Device"

        Device cellPhone = new Device();

        cellPhone.manufacturer = "Apple";
        cellPhone.name = "iPhone";
        cellPhone.version = 14;
        cellPhone.model = "Plus";
        cellPhone.fullName(cellPhone.manufacturer, cellPhone.name, cellPhone.version, cellPhone.model);


        cellPhone.isContract = true;
        cellPhone.price = 899;
        cellPhone.currency = '$';
        cellPhone.calculatePricePerMonth(true, cellPhone.price);

    }
}
