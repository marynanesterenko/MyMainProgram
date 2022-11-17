package com.java.ProjectDay8_Nov10th;

import java.util.Scanner;

public class PrintFirstAndLast {
        public static void main(String[] args) {
            /**
             * Given an array of String, iterate through each word
             * Print first and last letters of each element in a separate line
             */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter 5 words: ");
            String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
            // the length is: 5
            // the indices are: 0, 1, 2, 3, 4

            printLetters(words);
        }

        public static void printLetters(String[] words) {
            //TODO IMPLEMENT THIS METHOD

            char firstLetter ;
            char lastLetter;

            for (String word : words){

                firstLetter = word.charAt(0);
                lastLetter = word.charAt(word.length() - 1);
                char[][] firstAndLast = new char[][]{{firstLetter, lastLetter}, {firstLetter, lastLetter}, {firstLetter, lastLetter}, {firstLetter, lastLetter}, {firstLetter, lastLetter}};
                //                                           0                              1                          2                          3                          4
                //                                      0           1              0              1              0            1             0             1             0             1
                for (int i = 0; i < firstAndLast.length; i++){
                    for (int j = 0; j < firstAndLast[i].length; j++){
                        System.out.print(firstAndLast[i][j]);
                    }
                    break;
                }
                System.out.println();
            }
            System.out.println();
        }
    }

