package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: What would be the output?
A: ERROR
   (java: incompatible types: possible lossy conversion from double to int)

!! We need to remember that we cannot store the bigger value inside the smaller value !!
   We can fix line 17 in the following way: a = (int)(a + d)
 */
public class Question_14_DataTypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double d = a;
        d = d + a;

        // -> this program wouldn't run if we uncomment the line 17
        // a = a + d;
        System.out.println(d);
        System.out.println(d);

    }
}
