package com.java.class16_Oct24_NestedForLoop;

public class HomeworkTask2_Oct24_FindResult {
    /*
    2.  Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
     */

    public static void main(String[] args) {

        int firstSum = 0;
        for ( int i = 10; i >= 6; i--){
            firstSum = firstSum + i;
        }

        int secondSum = 0;
        for (int j = 1; j <= 5; j++) {
            secondSum = secondSum + j;
        }

        int result = firstSum + secondSum;

        System.out.println("The sum of " +
                "10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5 = " + result);
    }

    /*
    Another way of doing it:
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++){

            if( i <=) {

                sum = sum + 1;
                (if the question was 10 - 1 + 9 - 2 + 8 - 3 + 7 - 4 + 6 - 5. then:
                we would use "sum = sum - i", but since it is "+", then this)

            } else {

                sum = sum + 1;

                }
        }
        System.out.println(sum);
     }
     */
}
