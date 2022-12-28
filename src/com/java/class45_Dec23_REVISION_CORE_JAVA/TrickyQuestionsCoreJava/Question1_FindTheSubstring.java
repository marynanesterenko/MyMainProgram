package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: Chirag
 */
public class Question1_FindTheSubstring {
    public static void main(String[] args) {
        String str = "Welcome to the DevX Java classes with Chirag";
        System.out.println(str.substring(str.indexOf("Java") + str.indexOf("the") + str.indexOf(" ")));
    }
}
