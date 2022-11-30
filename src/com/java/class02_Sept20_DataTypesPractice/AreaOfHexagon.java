package com.java.class02_Sept20_DataTypesPractice;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        /*
        Write a Java program to calculate the area of hexagon.
        AreaOfHexagon = (6 * s^2)/(4*tan(π/6)), where "s" is the length of a side
        tan = Math.tan | π = Math.PI
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the side of the hexagon: ");
        float s = sc.nextFloat();

        double π = Math.PI;
        double tan = Math.tan(π/6);
        double area = (6 * s * s) / (4 * tan);

        System.out.println("The area of hexagon is: " + String.format("%.2f", area));
    }
}
