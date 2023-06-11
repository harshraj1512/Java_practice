package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistss {
    public static void main(String[] args) {
        // Syntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(45);
//        list.add(23);
//        list.add(469);
//        list.add(4646);
//        list.add(4);
//        list.add(75);
//        list.add(4);
//        list.add(654);
//        System.out.println(list);
//        list.set(1, 99);
//        System.out.println(list);

        //Input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //output
        // get item at any index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(2)); // Pass index here, list[index] sytntax will not work here
        }
    }
}
