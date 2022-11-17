package com.java.ProjectDay7_Nov3rd;

import java.util.Scanner;

public class MergeTwoWords {
    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         * output:
         * isceea
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first string of 3 chars: ");
        String word1 = sc.nextLine();

        System.out.println("Please enter the second string of 3 chars: ");
        String word2 = sc.nextLine();

        System.out.println("Merging words: " + word1 + ", " + word2);
        printMerge(word1, word2);
    }

    public static void printMerge(String word1, String word2) {
        //TODO IMPLEMENT METHOD
        if (word1.length()!= 3 && word2.length()!=3){
            System.out.println("Error");
        } else {
            for (int i = 0; i < word1.length(); i++) {
                for (int j = i + 1; j <= word2.length(); j++) {
                    System.out.print(word1.substring(i, j) + word2.substring(i, j));
                    break;
                }
            }
        }
    }
}
