package com.java.class41_Dec16_CollectionsFramework;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        intBox.setData(50);
        System.out.println(intBox.getData());

        Box<String> stringBox = new Box<String>();
        stringBox.setData("Maryna");
        System.out.println(stringBox.getData());

    }

}
