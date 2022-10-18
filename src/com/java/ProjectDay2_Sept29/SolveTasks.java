package com.java.ProjectDay2_Sept29;

import java.util.Scanner;

public class SolveTasks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("===================================");
            System.out.println("TASK #1");
        /**
         *
         * Create a service to calculate a perimeter of a rectangle.
         * Tasks:
         * 1) have two inputs to your system
         * 2) calculate perimeter
         * 3) print out your result
         *
         * Example output:
         *  Enter your length:
         *  2
         *  Enter your width:
         *  1
         *  Your perimeter is equal to 6.
         *
         */

        //TODO implement your code here...

        System.out.println("Enter your length: ");
        int length = sc.nextInt();

        System.out.println("Enter your width: ");
        int width = sc.nextInt();

        int perimeter = (length + width) * 2;
        System.out.println("Your perimeter is equal to: " + perimeter);

        System.out.println("===================================");
        System.out.println("TASK #2");
        /**
         *
         * Write a program, that calculates 10% bonus for a salary
         * Tasks:
         * 1) have a salary input to your system
         * 2) calculate 10% of a salary
         * 3) print out total amount of salary and bonus
         *
         * Example output:
         *  Enter your salary:
         *  100000
         *  Your bonus is 10000
         *  Your total salary is 110000
         */

        //TODO implement your code here...
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        double bonus = salary * 0.1;
        double totalSalary = bonus + salary;
        System.out.println("Your bonus is: " + bonus);
        System.out.println("Your total salary is: " + totalSalary);

        System.out.println("***********************************");
        System.out.println("TASK #3");
        /**
         *
         *  Write a program that calculates a multiplication by 9 WITHOUT multiplying
         *  Tasks:
         *  1) have a number input
         *  2) add 0 to the end of the number and save it
         *  3) subtract original number from the saved number
         *  4) print out the result
         *
         *  Example output:
         *   Enter any number I will calculate a multiplication by 9 without multiplying:
         *   754
         *   The result is 6786
         *
         */

        //TODO implement your code here...
        System.out.println("Enter any number I will calculate a multiplication by 9 without multiplying: ");
        int number = sc.nextInt();
        int numberWith0 = number * 10;
        int myResult = numberWith0 - number;
        System.out.println("The result: " + myResult);
        System.out.println(number + " * 9 = " + myResult);

        System.out.println("***********************************");
        System.out.println("TASK #4");
        /**
         *
         * 5 street performers are singing every day.
         * At the end of the day they collect all money to one bucket and divide their profit equally.
         * For more accuracy and time efficiency they need a program to get a daily profit.
         * Help them out!
         *
         * 1) Have 5 inputs
         * 2) Calculate profit for each person
         * 3) Print out the result
         *
         * Output example:
         *  Jake's: 100.25
         *  Phil's: 88.50
         *  Ryan's: 99.00
         *  Tom's: 69.00
         *  Bill's: 123.45
         *  Each performer gets $96.04
         */

        //TODO implement your code here...
        System.out.println("Please enter your earning: ");
        System.out.println("Jake's: ");
        double jake = sc.nextDouble();

        System.out.println("Phil's: ");
        double phil = sc.nextDouble();

        System.out.println("Ryan's: ");
        double ryan = sc.nextDouble();

        System.out.println("Tom's: ");
        double tom = sc.nextDouble();

        System.out.println("Bill's: ");
        double bill = sc.nextDouble();

        double eachDailyProfit = (jake + phil + ryan + tom + bill)/5 ;

        System.out.println("Jake's: " + jake + "\nPhil's: " + phil + "\nRyan's: " + ryan + "\nTom's: " + tom +
                "\nBill's: " + bill + "\nEach performer gets $" + eachDailyProfit);

        System.out.println("***********************************");
        System.out.println("TASK #5");
        /*
         * Write a program that takes number of minutes from user and converts the number to Years and Days
         *
         * Tasks:
         * 1) have a number long
         * 2) to get years, divide input number to the total number of minutes in year
         * 3) to get days, divide input number to the total minutes in one day, then modulus by total number of days in a year
         *
         *
         * Example output:
         *  Input the number of minutes:
         *  3456789
         *  3456789 minutes is approximately 6 years and 210 days
         */

        //TODO implement your code here...

        long totalMinInYear = 525600;
        int totalMinutesInDay = 1440;

        System.out.println("Input the number of minutes: ");
        long minutes = sc.nextLong();
        long years = minutes/totalMinInYear;
        long days = (minutes/totalMinutesInDay) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        System.out.println("--- The end ---");
    }
}
