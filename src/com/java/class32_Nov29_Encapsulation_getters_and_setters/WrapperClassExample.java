package com.java.class32_Nov29_Encapsulation_getters_and_setters;
/*
- most of the automation frameworks do not allow to use the primitive data types
- we should use the objects in an automation frameworks
- Java has created the Class for each Data Type
- Wrapping means converting from primitive Data Type to an Object
- use of the wrapper Class in automation: Str to in and int to String
- we cannot override the static method, static method belongs to the Class, bot an Object
 */

public class WrapperClassExample {
    public static void main(String[] args) {
        int i = 10; // because of our ability to write this statement - we say that Java is not "fully" OOP
        Integer j = i;
        System.out.println(j);

        String str1 = "23";
        String str2 = "46";
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
    }


}
