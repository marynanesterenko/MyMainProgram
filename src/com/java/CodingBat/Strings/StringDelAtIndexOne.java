package com.java.CodingBat.Strings;
/*
Given a string, if the string "del" appears starting at index 1,
return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 */

import java.util.Scanner;

public class StringDelAtIndexOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = sc.nextLine();
        System.out.println(delDel(str));
    }

    public static String delDel(String str) {
        if (str.length() >= 4) {
            if (str.substring(1, 4).equalsIgnoreCase("del")){
                return str.charAt(0) + str.substring(4);
            } else {
                return str;
            }
        } else {
            return str;
        }
    }
}
