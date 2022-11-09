package com.java.class22_Nov07;

public class PrintOutDuplicateNumbers {
    public static void main(String[] args) {
        int [] array = new int []{23, 44, 21, 23, 27, 35, 75, 44, 25};
        String duplicates = "Duplicate numbers are: ";

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    duplicates = duplicates + " " + array[i] + ",";
                }
            }
        }
        System.out.println(duplicates.substring(0, duplicates.length() - 1));
    }
}
