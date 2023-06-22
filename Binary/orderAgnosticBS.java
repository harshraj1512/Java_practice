package com.Binary;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0 , 2, 3, 4, 15, 18 ,22, 45};
        int target = 16;
        int ans = oabs(arr,target);
        int j = arr[ans];
        System.out.println(j);
    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is shorted in ascending or descending
        //boolean isAsc = arr[start] < arr[end]
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        int mid = 0;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of integer in java
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else if (isAsc) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }// else {
                //return mid;
           // }
        }

        return start;
    }
    }


