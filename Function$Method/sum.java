package com.Function$Method;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // Function call
        // sum -> function name and ()-> function call
//        sum();
//        sum();

        // here we will store the value in add reference variable
//        int add = sum2();
//        System.out.println(add);

        // 3 program call
        int add = sum3(20,30);
        System.out.println("value:" + add );
    }
    /*
    Syntax of Method
          return_type name (arguments){
                   // body;
                   return statement;
          }

    */
    // Q:  following the return type is void and used to display/prints the value of addition
//    static void sum(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the second number: ");
//        int num2 = input.nextInt();
//
//        int add = num1 + num2;
//        System.out.println("The sum: " + add);
//    }

    // Q: return the value of integer type
//    static int sum2(){
//        Scanner oi = new Scanner(System.in);
//        System.out.print("Enter the 1 number: ");
//        int num1 = oi.nextInt();
//        System.out.print("Enter the 2 number: ");
//        int num2 = oi.nextInt();
//
//        int sum = num1 + num2;
//        return sum;
//    }

    //Q: Pass the value of number when you are calling the method in main ()

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;

    }
}
