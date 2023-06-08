package com.Function$Method;

public class shadow {
    static int x = 20;// this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x);
        int x ;
        x = 40;//the class variable at line 10 is shadowed by this
        System.out.println(x);
        fun();

    }

    static void fun(){
        System.out.println(x);
    }
}
