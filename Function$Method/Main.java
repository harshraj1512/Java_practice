package com.Function$Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q: Take an input of Two Numbers and print the sum

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = in.nextInt();

        //sum
        int add = num1 + num2;
        System.out.println("sum: " + add);
    }
}
// If a person says to do it 100 times which is impossible to do for this type of problem we use function and method approach.