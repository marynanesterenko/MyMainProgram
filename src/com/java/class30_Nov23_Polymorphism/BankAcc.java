package com.java.class30_Nov23_Polymorphism;

class Bank{

    void displayRateOfInterest(){
        System.out.println("4%");
    }
}

class ChaseBank extends Bank{
    void displayRateOfInterest(){
        System.out.println("6%");
    }
}

class BankOfAmerica extends Bank{
    void displayRateOfInterest(){
        System.out.println("8%");
    }
}

class CityBank extends Bank{
    void displayRateOfInterest(){
        System.out.println("10%");
    }
}

class BankAcc {
    public static void main(String[] args) {
        ChaseBank c = new ChaseBank();
        BankOfAmerica ba = new BankOfAmerica();
        ba.displayRateOfInterest();
    }
}