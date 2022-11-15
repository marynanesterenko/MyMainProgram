package com.java.SelfStudy;
/*
Create an array which will have days of week as String.
ex: Monday, Tuesday

Using this array, write a logic which would print out weekdays only
Using this array, write a logic which would print out weekends only

 */
public class PrintWeekdays {
    public static void main(String[] args) {

        String[] weekdaysArray  = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        // the length of the array is: 7
        // the indices are: 0, 1, 2, 3, 4, 5, 6

        String weekdays = "Weekdays are:";
        for (int i =0; i < weekdaysArray.length; i++) {
            weekdays = weekdays + " " + weekdaysArray[i] + ",";
        }
        System.out.println(weekdays.substring(0, weekdays.length() - 1));



        String [] weekendArray = {"Saturday", "Sunday"};
        String weekends  = "Weekend days are:";
        for (int j = 0; j < weekendArray.length; j++ ){
            weekends = weekends + " " + weekendArray[j] + ",";
        }
        System.out.println(weekends.substring(0, weekends.length() - 1));

    }
}

