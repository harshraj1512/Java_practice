package com.conditionsandloops;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        System.out.println("Enter an Alphabate: ");
        char ch = next.next().trim().charAt(1);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }

//        String word = "hello";
//        System.out.println(word.trim());
//        System.out.println(word.charAt(1));
    }
}
