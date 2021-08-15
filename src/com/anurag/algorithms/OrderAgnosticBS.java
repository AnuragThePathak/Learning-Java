package com.anurag.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ar = {-2, 0, 3, 5, 6, 9, 10, 14, 15, 34, 36, 38, 45, 49};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(target + " is in index no. " + binarySearch(arr, target)
                + " of" + " array " + Arrays.toString(ar));
    }

    static int binarySearch(int[] ar, int target) {
        int start = 0;
        int end = ar.length - 1;
        boolean isAscending = ar[start] < ar[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ar[mid] == target) {
                return mid;
            } else if (isAscending) {
                if (target < ar[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > ar[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

