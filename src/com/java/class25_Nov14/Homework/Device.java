package com.java.class25_Nov14.Homework;

public class Device {

    String manufacturer;
    String name;
    int version;
    String model;
    int storageGB;
    double price;
    boolean isContract;
    double pricePerMonth;
    char currency;

    public void fullName (String manufacturer, String name, int version, String model) {
        String fullName = manufacturer + " " + name + " " + version + " " + model;
        System.out.println("Your selected device is: " + fullName);
    }

    public void calculatePricePerMonth (boolean isContract, double price){
        if (isContract){
            pricePerMonth = price / 24;
        }

        System.out.println("Price per month for 2-year contract: " + currency + String.format("%.2f", pricePerMonth));
    }
}
