package com.java.class28_Nov21;

public class MainClass {

    public static void main(String[] args) {
        BasicCalculator b = new BasicCalculator();
        b.sub(10, 20);
        b.sum(10, 20);


        AdvancedCalculator ac = new AdvancedCalculator();
        ac.sub(10, 20);
        ac.sum(10, 20);
        ac.mul(10, 20);
        ac.div(10, 20);
    }
}
