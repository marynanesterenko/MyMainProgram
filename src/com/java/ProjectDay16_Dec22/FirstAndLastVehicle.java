package com.java.ProjectDay16_Dec22;

import java.util.TreeMap;

public class FirstAndLastVehicle {
    public static void main(String[] args) {
        /**
         * Create a map of cars, so they have orders
         * and print out first and last entry in the map
         * ex:
         * 5, "BMW"
         * 3, "Tesla"
         * 1, "Mercedes"
         * 4, "Audi"
         * 10, "Ford"
         *
         * print out:
         * 1, "Mercedes"
         * 10, "Ford"
         */

        //TODO write your code here
        FirstAndLastVehicle obj = new FirstAndLastVehicle();
        obj.print();
    }

    public void print() {
        //TODO implement this method
        TreeMap<Integer, String> cars = new TreeMap<>();

        cars.put(5,"BMW");
        cars.put(3,"Tesla");
        cars.put(1,"Mercedes");
        cars.put(4,"Audi");
        cars.put(10,"Ford");

        System.out.println(cars.firstEntry() + "\n" + cars.lastEntry());
    }
}
