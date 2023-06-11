package com.Arrays;

import java.util.*;
public class other {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        simpleArraySum();
    }

     static void simpleArraySum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        System.out.println("enter the element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
         System.out.println(sum);

        }


}




