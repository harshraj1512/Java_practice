package com.Arrays;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int[] arr = new int[5];
//        arr[0] = 57;
//        arr[1] = 529;
//        arr[2] = 7;
//        arr[3] = 293;
//        arr[4] = 3;
//        System.out.println(arr[3]);

        // input using for loop
//        for (int i=0; i < arr.length; i++ ){
//            arr[i] = in.nextInt();
//            // System.out.println(arr[i] + " ");
//        }

//        for (int num: arr) { // for every element in array, print the element
//            System.out.println(num + " "); // here num represents elements of the array
//
//        }

//        System.out.print(Arrays.toString(arr));


        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));


    }

}
