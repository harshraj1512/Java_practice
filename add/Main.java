package com.add;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second No.: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("sum " + sum);
    }
}
