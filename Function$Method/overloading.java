package com.Function$Method;

public class overloading {
    public static void main(String[] args) {
//        fun(67);
//        fun("Asus");
        int ans = sum(7,11,15);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}