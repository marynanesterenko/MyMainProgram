package com.java.class30_Nov23_polymorphism;

class Browser {
    void openIncognitoWindow(){
        System.out.println("Control + T");
    }
}

class Chrome extends Browser{
    void openIncognitoWindow(){
        System.out.println("Ctrl + Shift + N");
    }
}

class Mozilla extends Browser{
    void openIncognitoWindow(){
        System.out.println("Ctrl + Shift + P");
    }
}


