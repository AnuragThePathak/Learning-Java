package com.anurag.binary_search_mod;

//Ceiling of a number target is the smallest element in the array which is greater than
//or equal to target
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 11, 13, 17, 20, 21, 22};
        int target = 19;

        int ans = binarySearch(arr, target);
        if (ans == -1) {
            System.out.println("No such element.");
        } else {
            System.out.println("The required element is " + arr[ans]);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

//        If arr[mid] is never equal to zero then just before the condition being
//        violated we will always have start==mid.
        return start;
    }
}
