package com.java.class47_Dec27_REVISION_OOP_IntroToMaven.TrickyQuestionsOOP;
/*
Q: What will be the output?
A: Lets run now!
 */
class A {
    public void run(){
        System.out.println("Running");
    }
}

class B extends A {
    public void run(){
        System.out.println("Walking");
    }
}

class C extends B {
    public void run(){
        System.out.println("Let's run now!");
    }
}

public class Question1_MethodOverriding {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}
