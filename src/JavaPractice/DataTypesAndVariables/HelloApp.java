package JavaPractice.DataTypesAndVariables;

public class HelloApp {

    static String helloMessage;
    /*
    this is a class variable and we MUST place the word "static" in it's declaration
    class variable is a variable, that any method in the class can access, including the main method
    we dont have to place this at the beginning, but it is a good practice to do so
    */

    public static void main (String[] args) {
        /*
        this is a static method, and it is not associated with the instance of the class
        therefore - we cannot use instance variables inside the static method

        */

        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }

}
