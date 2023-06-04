package com.conditionsandloops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while(true){
            // take the operator as input
            char op = next.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/'|| op=='%'){
                // input two number
                int num1 = next.nextInt();
                int num2 = next.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1-num2;
                } else if (op == '*') {
                    ans = num1*num2;
                } else if (op == '/') {
                    ans = num1/num2;
                } else if (op == '%') {
                    ans = num1%num2;
                } else {
                    break;
                }

                System.out.println(ans);
            }
        }
    }
}
