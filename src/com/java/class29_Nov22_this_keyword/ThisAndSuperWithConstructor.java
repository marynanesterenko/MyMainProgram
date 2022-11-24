package com.java.class29_Nov22_this_keyword;

// you can call another constructor from another constructor only
// You can call a constructor from another constructor,
// but it has to be called in the first like only

class Bank1{

    Bank1(int balance) {
        System.out.println("From Bank " + balance);
    }

}

class CityBank extends Bank1{
    CityBank(){
        super(10);
    }

}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        CityBank b = new CityBank();
    }
}
