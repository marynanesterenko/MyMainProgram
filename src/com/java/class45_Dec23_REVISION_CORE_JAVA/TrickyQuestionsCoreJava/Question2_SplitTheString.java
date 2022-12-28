package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What will be the output?
A: 6
 */
public class Question2_SplitTheString {
    public static void main(String[] args) {
        String str = "My name is -- Maryna -- DevX - Student";
        String[] strParts = str.split("-");
        System.out.println(strParts.length);
    }
}
