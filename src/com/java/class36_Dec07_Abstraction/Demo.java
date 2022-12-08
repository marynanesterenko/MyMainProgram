package com.java.class36_Dec07_Abstraction;

public class Demo {
    public static void main(String[] args) {

        Patient general = new GeneralPatients();
        Patient child = new ChildPatients();
        Patient senior = new SeniorPatients();
        Patient disabled = new DisabledPatients();

        general.takeTylenol();
        child.takeTylenol();
        senior.takeTylenol();
        disabled.takeTylenol();

        System.out.println("\n");

        general.payTheBill();
        child.payTheBill();
        senior.payTheBill();
        disabled.payTheBill();

        System.out.println("\n");

        System.out.println(general.takeThePayment(1000, 500));
        System.out.println(child.takeThePayment(1500, 200));
        System.out.println(senior.takeThePayment(2500, 350));
        System.out.println(disabled.takeThePayment(1705, 69));

    }
}
