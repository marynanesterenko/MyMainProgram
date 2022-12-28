package com.java.class46_Dec26_REVISION_OOP.TrickyQuestions;
/*
Will this code compile? - YES.

Output:
FIRST
THIRD
SECOND
FIRST
THIRD
THIRD
 */
abstract class A {
    abstract void method1();

    void method2() {
        System.out.println("SECOND");
        method1();
    }
}

abstract class B extends A {
    void method1(){
        System.out.println("FIRST");
        method3();
    }

    abstract void method3();
}

class C extends B {
    void method3(){
        System.out.println("THIRD");
    }
}

public class Question4 {
    public static void main(String[] args) {
        C c = new C();
        c.method1();
        c.method2();
        c.method3();
    }
}


