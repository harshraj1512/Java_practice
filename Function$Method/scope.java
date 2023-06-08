package com.Function$Method;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "iron";

        // Block Scoping
        {
            // int a = 70; //already initialised outside the block in the same method, hence cannot be initialised again

            a = 100; // reassign the origin ref variable to some other value
            name = "man";

            int c = 99; // Value initialised in the block will remain in the block
            System.out.println(a);
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);

       // System.out.println(c); // cannot be used outside the block

        //Scoping in for loop
        for(int i = 0; i<4; i++){
            System.out.println(i);
            int num = 90;
        }
        // System.out.println(i);// cant access outside the block
    }

}
