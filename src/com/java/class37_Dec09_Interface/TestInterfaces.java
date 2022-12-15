package com.java.class37_Dec09_Interface;

public class TestInterfaces {

    public static void main(String [] args){

        // polymorphism -> an ability to take shapes
        // dynamic polymorphism - you can choose what type pof object to create during the runtime
        FirstInterface i = new Subclass();
        i.play();

    }
}
