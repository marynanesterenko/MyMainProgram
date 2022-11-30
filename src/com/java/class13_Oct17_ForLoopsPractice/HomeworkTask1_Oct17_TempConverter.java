package com.java.class13_Oct17_ForLoopsPractice;

import java.util.Scanner;

public class HomeworkTask1_Oct17_TempConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the value in Celsius and I will convert it to Fahrenheit for you: ");
        double tempInCelsius = sc.nextDouble();
        System.out.println("Your temperature is Fahrenheit is: " + convertTemperature(tempInCelsius));
    }

    static double convertTemperature (double temperatureToConvert){
        double convertedTemperature = (temperatureToConvert * 9/5) + 32;
        return convertedTemperature;
    }
}
