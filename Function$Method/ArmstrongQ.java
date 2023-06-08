package com.Function$Method;

import java.util.Scanner;

public class ArmstrongQ {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        int n = next.nextInt();
        boolean x = isArmstrong(n);
        System.out.println(x);
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
