package com.java.class03;

public class HomeworkTask3_Sept21 {
    public static void main(String[] args) {
        System.out.println ("Relational Operators: compare 'a' and 'b', if a = 1 and b = -1 ");

        int a = 1, b = -1;

        boolean b1 = a > b;
        System.out.println("a > b is: " + b1);  //true

        boolean b2 = a < b;
        System.out.println("a < b is: " + b2);  //false

        boolean b3 = a >= b;
        System.out.println("a >= b: " + b3); //true

        boolean b4 = a <= b;
        System.out.println("a <= b: " + b4); //false

        boolean b5= a != b;
        System.out.println("a != b: " + b5); //true

        boolean b6 = a == b;
        System.out.println("a == b: " + b6); //false

    }
}
