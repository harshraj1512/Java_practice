package com.Function$Method;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,5,9,7,1,3,35,57);
        multiple(3,7, "Iron man", "captain America", "Hulk");
    }

    static void multiple(int a, int b, String ...x){
        System.out.println(a + " " + b + " "+ Arrays.toString(x));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
