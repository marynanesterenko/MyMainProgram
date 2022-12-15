package com.java.class37_Dec09_Interface;

public class Subclass implements FirstInterface {

    // you must override the abs method from Interface
    // all method overriding rules apply
    @Override
    public void play() {
        System.out.println("Play");
    }
}
