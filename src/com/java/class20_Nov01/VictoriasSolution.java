package com.java.class20_Nov01;


import java.util.Scanner;

public class VictoriasSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any sentence: ");
        String str = sc.nextLine();

        System.out.println("Please enter a character for me to look for in your sentence: ");
        char charToLookFor = sc.next().charAt(0);

        System.out.println("The frequency of the character '" + charToLookFor + "' is " + getFrequencyOfCharacter(str, charToLookFor));
    }

    static int getFrequencyOfCharacter (String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
