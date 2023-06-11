package com.Arrays;

public class main {
    public static void main(String[] args) {
        //Q: Store a roll no
        int a = 19;

        // Q : store a person's name
        String name = "Asus Book";

        // Q: Store 5 roll numbers
        int rno1 = 19;
        int rno2 = 27;
        int rno3 = 35;
        int rno4 = 37;
        int rno5 = 39;

        // Syntax of an Array
        // datatype[] variable_name = new datatype[size];
        // Store 5 roll no.
        int[] rno = new int[5];
        // or directly
        int[] rno_1 = {15, 19, 21 ,23 , 25};

        int[] ros; // decleration of array ros is getting defined in the *stack*
        ros = new int[5];// intilasation: actually here object is being created in the memory *(heap)*

        System.out.println(ros[1]);

        String[] ross = new String[5];
        System.out.println(ross[1]);
    }
}
