package com.java.class45_RevisionCoreJava.TrickyQuestionsCoreJava;
/*
Q: What will be the output of this program?
A: abc
 */
public class Question9_ReassignmentOfVariableValue {
    public static void main(String[] args) {
        String value = "abc";
        changeValue(value);
        System.out.println(value);
    }

    public static void changeValue(String a){
        a = "xyz";
    }
}
