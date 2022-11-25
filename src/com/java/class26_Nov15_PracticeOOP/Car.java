package com.java.class26_Nov15_PracticeOOP;
/*
if we assign any values to the variables that are present in this class
they will be treated as "default values"
 */
public class Car {
    int speed = 300; // instance variable
    String color;

    void drive() {
        System.out.println("Driving " + color + " car at speed " + speed);
    }

    // pass by value
    int increaseSpeed (int speed){
        speed = speed + 500;
        return speed;
    }

    /*
    - this is called "pass by reference"

    - myCar here - reference var that is pointing to the memory location of the Object,
    which we are passing as an argument, when the method is called;

    - here we are passing the Object, which value we want to change

    - the variables we are using here - is the vars of the Obj we are calling this method by

    - the parameter variable should be some "generalized" name,
    because if name it "bmw", then what if we pass "audi" instead of "bmw"?.. then we will get confused,
    because it will not make sense to name the reference variable "bmw" and pass the "audi" Object parameters into it..
     */

    void decreaseSpeed(Car myCar) {
        myCar.speed = myCar.speed - 200;
        myCar.color = "Black";
        color = "Yellow";
    }

    void makeSpeedZero() {
        speed = 0;
    }
}
