package com.Linear_search;

public class main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, -3, 16, -1 , 19, 28 };
        int target = 199;
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);
    }

    // Search the target and return the element
//    static int linearSearch2(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//
//        // run a for loop
//        for (int element : arr) {
//            if (element == target){
//                return element;
//            }
//        }
//
//        // this line will execute if none of the return statement above have executed
//        // hence the target not found
//        return -1;


  // search the element and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is == target
            int element = arr[index];
            if (element == target){
                return true;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return false;


        // Search in the array: return the index if item found
    // otherwise if item not found return -1
//    static int linearSearch(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//
//        // run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            // check for element at every index if it is == target
//            int element = arr[index];
//            if (element == target){
//                return index;
//            }
//        }
//
//        // this line will execute if none of the return statement above have executed
//        // hence the target not found
//        return -1;
    }
}
