package com.java.class15_Oct19;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result = result *1;
        }
        System.out.println(result);
    }

}
