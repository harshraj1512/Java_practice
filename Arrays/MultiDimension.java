package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
              1 2 3
              4 5 6
              7 8 9
         */
//       Syntax of 2D Array
//        int[][] arr = new int[2][];

//        int[][] arr = {
//                {1, 2, 3},  //0th index
//                {4, 5},     //1th index
//                {6, 7, 8, 9}// 2nd index -> arr[2] = {6, 7, 8, 9}
//                                          //  arr[2][1] = {7}
//        };
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows 3

        // Input formate
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
        // Output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//
//        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
            }

    }
}
