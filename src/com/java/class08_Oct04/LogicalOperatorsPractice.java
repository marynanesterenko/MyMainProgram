package com.java.class08_Oct04;

public class LogicalOperatorsPractice {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false;
        boolean b3 = true, b4 = false;

        System.out.println(b1 || b2);
        System.out.println(b1 && b2 && b3); // && takes higher priority
        System.out.println(b1 || b2 && b3);
        System.out.println(b1 && b2 || b3);
        System.out.println(b1 && (b2 || b3) && (b4 || b1) && b3); // first a;; "AND" and then all "OR"
        System.out.println(b1 && b2 || b3 && b4 && b2 && b4 || b1 && b3 && (b1 || b2) || b1);
        // since the last operation is "OR" we can be 100% sure that the result will be true

    }
}
