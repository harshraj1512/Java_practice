package com.Switch;

import java.util.Scanner;

public class swithcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit = input.next();

        // old version of switch case in java
//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("Sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("please enter valid value");

        // Enhanced version of switch case in java
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter valid value");
        }

        // swith case using integer expression
        System.out.print("Enter a fav number 1-7: ");
        int day = input.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }
    }
}
