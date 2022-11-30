package com.java.class31_Nov28_dynamic_polymorphism;
import com.java.class32_Nov29_encapsulation_getters_setters.Car;

public class AccessModifierCarExampleFromClass32 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(500);
        c.price = 34534534;
        System.out.println(c.getSpeed());
    }
}
