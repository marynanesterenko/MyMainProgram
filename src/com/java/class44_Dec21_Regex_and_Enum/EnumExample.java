package com.java.class44_Dec21_Regex_and_Enum;
/*
REAL TIME:
 the exampl could be storing the wording of the error messages in the enums
 */
enum Days{
    // in parentheses, we put the constant we want our enum Object to represent
    // 0 - 6 are the arguments tha are being passed from the Object to the "Day" Constructor
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);


    int day;

    // this is the constructor
    Days(int day){
        this.day = day;
    }

    public int getDayNum(){
        return day;
    }

    // converting the "day" into the string and returning it
    // (when we override the method from the super class, which contains it, we cannot change the return type of it)
    @Override
    public String toString(){
        return String.valueOf(day);
    }
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(Days.TUESDAY.toString());
    }

}
