package com.java.class30_Nov23_polymorphism;
/*
Example of the dynamic polymorphism:
 */
import java.util.Scanner;

public class BrowserMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name: ");
        String browser = sc.next();

        Browser b;
        // b is just a reference variable (not the Object!), "pointer"
        // inside b we can store any Child Objects

        // if we actually wrote the Browser b = new Browser();
        // this way we can access only the methods present in Browser
        // that's why we had to declare the b variable, so that we can reassign it

        if (browser.equalsIgnoreCase("chrome")) {
            b = new Chrome(); // Object of the Child Class

        } else {
            b = new FireFox(); // Object of the Child Class

        }

        b.openIncognitoWindow();
    }
}
