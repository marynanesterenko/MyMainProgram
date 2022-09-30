package JavaPractice.NumbersAndExpressions;

import java.util.Scanner; // ScannerClassExample class, that allows the program use input from the User

public class MarblesApp {
    static Scanner sc = new Scanner(System.in);
    /*  here we create the ScannerClassExample object
        and assign it to a variable, so that it can be used by any method inside this class
     */
    public static void main(String[] args) {
        // declarations of local variables:
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftover;

        //get the input data from the User:
        System.out.println("Welcome to the Marble divider");
        System.out.println("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.println("Number of Children: ");
        numberOfChildren = sc.nextInt();

        // calculate the result:
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftover = numberOfMarbles % numberOfChildren;

        // print the results:
        System.out.println("Give each Child " + marblesPerChild + " marbles.");
        System.out.println("You will have " + marblesLeftover + " marbles left over.");

    }
}
