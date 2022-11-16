package com.java.class26_Nov15;
/*
The method will return the default values,
if the property of the class our Object is referencing have not been initialized
 */
public class MainClass {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();
        bmw.speed = 200; // in this line we are "initializing the property of the Class "Car"
        bmw.color = "White";

        // we have to reassign the variable to what the method is returning
        // First approach
        audi.speed = bmw.increaseSpeed(bmw.speed);

        // Second approach
        audi.decreaseSpeed(bmw);

        // Third approach
        audi.makeSpeedZero();

        System.out.println(bmw.speed);

    }
}
