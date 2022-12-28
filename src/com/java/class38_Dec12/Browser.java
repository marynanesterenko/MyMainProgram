package com.java.class38_Dec12;

interface Browser {
    public static void closeBrowser(){
        System.out.println("Click on close button");
    }

    abstract public void openIncognito();
}
