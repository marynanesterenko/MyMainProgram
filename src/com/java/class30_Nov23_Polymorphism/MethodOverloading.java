package com.java.class30_Nov23_Polymorphism;
/*
Class Demo is overloaded with the methods
 */
class Demo{
    void sum (int a, int b){

    }

    void sum (int c, int d, int e){

    }

    void sum (int f, double g){

    }

    void sum (double h, int i){

    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(10, 20, 40);
        d.sum(10, 20);
        d.sum(10.4, 20);
        d.sum(10, 20.5);
    }

}
