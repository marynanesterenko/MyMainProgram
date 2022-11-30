package com.java.class15_Oct19_DoWhileLoop;

// print the sum of 1 to 5
public class Practice4 {
    public static void main(String[] args) {

        int result = 1;
        for (int i = 1; i <= 5; i++) {

            result = result * i;
        }
        System.out.println(result);
        // in order to get the result for each iteration - put the sout inside the for loop
    }
}
