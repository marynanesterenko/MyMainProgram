package com.java.class46_Dec26_REVISION_OOP;


class Car {
    // since this is the static var - we can use it in the main method by just calling it with the Class name
    static int speed;
    int price;

    public static void printSpeed(){
        System.out.println(speed);
        // System.out.println(price);
    }
}

public class StaticVarExample {
    public static void main(String[] args) {
        Car.printSpeed();
    }
}
