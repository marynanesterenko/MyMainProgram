package com.java.class29_Nov22_this_keyword;

class Vehicle {
    int speed = 50;
}

class Car extends Vehicle {

    int speed = 100;

    void drift(){
        int speed = 200;
        System.out.println(speed);
    }
}


public class ThisAndSuperExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.drift();
    }
}
