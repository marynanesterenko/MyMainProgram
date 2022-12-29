package com.java.InterviewQuestions;

public class RemoveWithoutRemove {
    public static void main(String[] args) {
        /*
        Task: write the program to remove number 2 from the string without using the remove method
              this2isth2esent2en2cewit2htwo22esi2nit
         */

        String str = "this2isth2esent2en2cewit2htwo22esi2nit";
        String newString = str.replaceAll("2", "");
        System.out.println(newString);
    }
}
