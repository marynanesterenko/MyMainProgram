package com.java.class27_Nov16;
/*
- only one class can be "public" inside the .java file;
- Constructor has to have the same name as the Class name in which it is created;
- whenever we declare the variable at the Class level, it belongs to the Class, and there can only be
  one copy of the static variable, which means, that each Object will be using the "updated" value of this variable,
  as they are being created and the Constructor of the Class, where that variable is present, gets called
- "non-static" variable will have a copy for each Object, so each new Object will not be "re-using" the same copy with
  "updated" value, but they will each be initialized to "0" at the creation and then will get incremented
- "static" variable's location in the memory is immutable, so it's "address" cannot be changed,
  that's why it is called "static" and each Object get the same copy of this variable, when they call the Constructor,
  BUT the value of this variable CAN be changed(!), therefore each Object will get an updated value in the order they were created
- "non-static" variable's location in the memory is mutable, so, as the Objects get created & the Constructor gets called -
  the address of the variable's location in the memory will change and therefore each Object will get their own value -
  which will be the same
 */
class Car {

    // this var is initialized to "0" as default value
    // this var is owned by the Class "Car", which is also a "design"
    static int numberOfCars;

    Car() {
        numberOfCars++;

    }
}

public class Example {
    public static void main(String[] args) {

        System.out.println(Car.numberOfCars);
    }
}
