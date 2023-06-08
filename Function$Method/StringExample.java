package com.Function$Method;

import java.util.Queue;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // the value which is returned is stored in the message variable
//        String message = greet();
//        System.out.println( message);

        // 2 program
        Scanner ne =new Scanner(System.in);
        String name = ne.next();
        String mg = myGreet( name);
        System.out.println(mg);

    }

    // In the following we will be returning string value
//    static String greet(){
//        String greeting = "How are You";
//        return greeting;
//    }

    // Q: pass the value of string when you are calling the method in main()
    static String myGreet(String name){

        String msg = "Hello " + name;
        return msg;
    }
}
