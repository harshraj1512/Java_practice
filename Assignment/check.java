package com.Assignment;

import java.util.Arrays;

public class check {
    public static void main(String[] args) {
        int[] nums = {10, 4,8,3};
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] answer = new int[n];

        int sum = 0;
        for(int i = 0; i<n; i++){
            leftsum[i] = sum;
            sum = sum + nums[i];
        }

        int sum2 = 0;
        for(int i= n-1; i>=0; i--){
            rightsum[i]  = sum2;
           sum2 = sum2 + nums[i];
        }

        for(int i = 0; i<n ; i++){
            answer[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        System.out.println(Arrays.toString(answer));

    }
}
