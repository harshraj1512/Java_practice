package com.Function$Method;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner nex = new Scanner(System.in);
        int n = nex.nextInt();
        boolean ans = isboolean(n);
        System.out.println(ans);

    }

    static boolean isboolean(int n){
        if (n <= 1) {
            return false;
        }

        int c  = 2;
        while(c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        return c * c > n;

    }
}
