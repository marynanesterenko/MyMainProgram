package com.java.SelfStudy;

import java.util.Arrays;

public class RandomNumber {
    public static void main(String[] args) {
        int[]  numbers = new int[100];

        for (int i = 0; i < 100; i++)
            numbers[i] = (int) (Math.random() * 100) + 1;
        System.out.println(Arrays.toString(numbers));
    }
}
