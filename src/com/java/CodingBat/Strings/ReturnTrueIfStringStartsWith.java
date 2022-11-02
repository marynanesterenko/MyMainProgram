package com.java.CodingBat.Strings;

import java.util.Scanner;

/*
   Given a string, return true if the string starts with "hi" and false otherwise.
 */
public class ReturnTrueIfStringStartsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String and I will check if it starts with 'hi'");
        String str = sc.nextLine();


        System.out.println(doesStartsWith(str));
    }

    public static boolean doesStartsWith(String str) {

        if (str.length() >= 2){
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(0) == 'h' && str.charAt(1) == 'i'){
                        return true;
                    } else {
                        return false;
                    }
                }
        } else {
            return false;
        }
        return false;
    }

}
