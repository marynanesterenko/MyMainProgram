package com.java.CodingBat;

public class AddFirstTwoToTheFrontAndBack {

    /*
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields "kikittenki". If the string length is less than 2, use whatever chars are there.
     */
    public static void main(String[] args) {
        System.out.println(modifyTheString("dog"));
    }

    public static String modifyTheString(String str){
        // first, we need to figure out how many chars we need to take
        // we can instantiate a new variable that will store this vale

        int num = 2;
        if (num > str.length()) {
            num = str.length();
        }

        String front = str.substring(0, num);
        return front + str + front ;
    }
}
