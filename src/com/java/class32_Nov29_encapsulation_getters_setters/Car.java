package com.java.class32_Nov29_encapsulation_getters_setters;
// encapsulation suggests that the Class vars should be private
// public allows us to create an Object of this Class outside of the package
public class Car {

    // in order to access the private data members of the Class, we need to create the method
    private int speed;
    String color;
    public int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
// we need to make sure the Constructor is "public" as well
    // the below methods cannot be inside the Constructor block of code, because
    // Constructor is also sort of a method
    // the purpose of the getters and setters, so that we can control validation
    // in automation framework getters and setters are not going to be used

    public Car() {
        System.out.println("From Car Constructor.");
    }

    //  getter
    public int getSpeed (){
        return speed;
    }

    // setters
    public void setSpeed(int speed){
        // here we can have all the logic to identify the transaction log
        // we can have the security algorithm
        this.speed = speed; // passing local var value into the instance var
    }

}
