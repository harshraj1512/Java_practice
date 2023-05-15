package com.task1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temp in C: ");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.print("Temperature in F: " + tempF);
    }
}
