package com.java.class39_Dec13_ExceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());

            int[] a = {23, 45, 56};
            System.out.println(a[3]);

            //String str = "null";
            System.out.println(str.length());

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
