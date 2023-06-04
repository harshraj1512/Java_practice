package com.conditionsandloops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: print number from 1 to 5

        /*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement){
             //body
        }
        */

//        for(int i = 0; i <=5; i++){
//            System.out.println(i);
//        }

        // Q: print number from 1 to n
        Scanner input = new Scanner(System.in);

//        int n = input.nextInt();
//
//        for (int num = 0; num <= n; num+= 1 ){
//            System.out.print(num + " ");
//        }

        // do While

        /*
        do  {

        //body

        } while(condition);
         */

//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        } while (num<=5);

        int num = 1;
        do{
            System.out.println("How are You!!");
        } while(num != 1);
    }
}
