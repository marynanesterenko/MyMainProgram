package com.java.class08;

import java.util.Scanner;

public class BatorsProgramGradesWithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter mark: ");
        int x = sc.nextInt();
        while (x > 100 || x < 0) {
            System.out.println("Error!!! pls enter between 0-100");
            x = sc.nextInt();
        } if (x >= 90) {
            System.out.println("A+");
        } else if (x >= 80) {
            System.out.println("A");
        } else if (x >= 70) {
            System.out.println("B+");
        } else if (x >= 60) {
            System.out.println("B");
        } else if (x >= 50) {
            System.out.println("C+");
        } else if (x >= 40) {
            System.out.println("C");
        } else if (x >= 0) {
            System.out.println("Fail");
        }
    }
}
