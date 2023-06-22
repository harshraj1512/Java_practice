package com.Binary;

public class main {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0 , 2, 3, 4, 15, 18 ,22, 45};
        int target = 15;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it does not exist
    static int BinarySearch(int[] ar, int target){
        int start = 0;
        int end = ar.length -1;

        while(start <= end){
            // find the middle element
//            int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of integer in java
            int mid = start +(end - start) / 2;

            if(target < ar[mid]){
                end = mid - 1;
            } else if (target > ar[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
