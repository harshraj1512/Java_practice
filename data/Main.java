package com.data;

public class Main {
    public static void main(String[] args) {
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumber = 4567654.4567;
        long largeInterger = 3482155226654664156L;
        boolean check = false;

        // Non primitive data type
        String name = "Harsh";

        // How to write number in this formate (23,00,00)?
        int a = 23_00_00;
        System.out.println("Number: " + a);


        //Rapper class
        Integer rno = 64;
        rno.valueOf(rno);
    }

}
