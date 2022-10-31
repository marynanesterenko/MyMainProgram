package com.java.class15_Oct19;

public class ZigZagNumbersUsingForLoop {
    public static void main(String[] args) {

        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println(i);
            System.out.println(j);
        } // number of times this loop will execute will be managed by "i",
          // that is why we don't need the condition for j


          // another approach:
        System.out.println("\n=======================");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            System.out.println(11 - i);
        }
    }
}


