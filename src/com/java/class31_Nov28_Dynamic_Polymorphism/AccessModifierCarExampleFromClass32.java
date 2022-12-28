package com.java.class31_Nov28_Dynamic_Polymorphism;
import com.java.class32_Nov29_Encapsulation_getters_and_setters.Car;

public class AccessModifierCarExampleFromClass32 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(500);
        c.price = 34534534;
        System.out.println(c.getSpeed());
    }
}
