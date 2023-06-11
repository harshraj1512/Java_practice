package com.Arrays;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        // Q1 Swap the array

        int[] arr = {1, 5, 99, 4 , 5};
//        swap(arr, 1, 2);
//        System.out.println(Arrays.toString(arr));

        // Q2 return max value in array
       int a = max(arr);
        System.out.println(a);


    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
               max = arr[i] ;
            }

        }
        return max;
    }

//    static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }


}
