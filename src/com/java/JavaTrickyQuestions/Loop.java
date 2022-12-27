package com.java.JavaTrickyQuestions;

public class Loop {
    public static void main(String[] args) {
        int i;

        // if there was for (int i = 1; i < 7; i++) {} -> it would give the compilation error, because the var is already declared in line 5
        for (i = 1; i < 7; i++){
            if (i > 3){
                System.out.println(i * 2);
            }
        }
        System.out.println(i);
    }
}
