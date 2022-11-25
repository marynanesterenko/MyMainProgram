package com.java.class24_Nov09_ArraysPractice;
/*
the goal is, after getting the number that we are looking for - we print it/store it,
and then we check if we have already stored the number - then do not print is again
 */
public class FindUniqueElementsOfArray {
    public static void main(String[] args) {
        int[] data = {43, 44, 37, 37, 43, 43, 44, 17, 44, 44, 17};

        int[] duplicates = new int[data.length];

        // "traversing" through array
        for (int i = 0; i < data.length; i++){
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    //
                    if (!isElementPresentInArray(duplicates, data[i])){
                        System.out.println(data[i]);
                    }
                    break;
                }
            }
        }
    }
    static boolean isElementPresentInArray( int[] data, int targetNumber){
        for (int num : data) {
            if ( num == targetNumber){
                return true;
            } else {
                return false;
            }
        }
        return false; // returning false because it is a default value for boolean data type
    }
}
