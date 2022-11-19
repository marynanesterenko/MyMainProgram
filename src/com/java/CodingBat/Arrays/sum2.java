package com.java.CodingBat.Arrays;

public class sum2 {

    public int sum(int[] nums) {

        int sum = 0;

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            sum = nums[0];
        } else {
            for (int i = 0; i < nums.length; i++) {
                sum = nums[i] + nums[i + 1];
                break;
            }
        }

        return sum;
    }
}
