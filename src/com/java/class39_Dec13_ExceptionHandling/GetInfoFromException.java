package com.java.class39_Dec13_ExceptionHandling;

public class GetInfoFromException {
    public static void main(String[] args) {
        try {
            int[] a = {23, 45, 56};
            System.out.println(a[3]);

            String str = "null";
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sorry! Index is out of bound!");
    }
}
