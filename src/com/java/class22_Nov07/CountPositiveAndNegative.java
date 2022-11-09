package com.java.class22_Nov07;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
        int[] data = {-12, 34, -45, 54, -23, 56, 78, -2, 21};

        int positives = 0;
        int negatives = 0;
        int zeroes = 0;

        for (int i = 0; i < data.length; i++){
            if (data[i] > 0){
                positives++;
            } else if (data[i] < 0 ) {
                negatives++;
            } else {
                zeroes++;
            }
        }

        System.out.println("The number of positive numbers you have is: " + positives +
                            "\nThe number of negative numbers you have: " + negatives +
                            "\nThe number of zeroes you have is: " + zeroes);
    }
}
