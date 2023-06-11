package com.Arrays;

import java.sql.Array;
import java.util.Arrays;

public class just {
    public static void main(String[] args) {
        int[] nums ={1,1,1,1};
            int count = 0;


            for (int i = 0; i <nums.length-1 ; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i < j && nums[i] == nums[j]) {
                        count++;
                    }
                }
            }System.out.println(count);
        }


    }



