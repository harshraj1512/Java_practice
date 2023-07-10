package com.Arrays;

public class Largest_value {
    public static void main(String[] args) {
        // -infinity =Integer.MIN_VALUE
        // +infinity = Ineteger.MAX_VALUE
        int[] number = {1,2,6,3,5};
        System.out.println(largestElement(number));

    }

    static int largestElement(int[] arr){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
}
