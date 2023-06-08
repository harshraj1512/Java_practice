package com.Function$Method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Create an array
        int [] arr = {1,3, 45, 7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums [0] = 99;
    }
}
