package com.conditionsandloops;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q: Find the fibonacco series of the Nth number ?

        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count < n ){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println("value" + b);
    }
}
