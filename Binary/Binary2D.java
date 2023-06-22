package com.Binary;

import java.util.Arrays;

public class Binary2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}};
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    // returning an array
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length -1;

        // row should be less than matrix length and colum should be greater than equal to 0
        while(r < matrix.length && c >=0){
            // have to make 3 checks
           if(matrix[r][c] == target){
               return new int[]{r,c};
           }

           if(matrix[r][c] < target){
               r++;
           } else {
               c--;
           }

        }
        return new int[]{-1,-1};
    }
}
