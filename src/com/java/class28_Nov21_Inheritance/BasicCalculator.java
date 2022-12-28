package com.java.class28_Nov21_inheritance;

class BasicCalculator {
    public void sum(int a, int b){
        System.out.println(a + b);;
    }

    public void sub(int a, int b){
        System.out.println(a - b);
    }

}

// "AdvancedCalculator is a Child Class
class AdvancedCalculator extends BasicCalculator{

    public void mul(int a, int b){
        System.out.println(a * b);;
    }

    public void div(int a, int b){
        System.out.println(a / b);
    }
}

