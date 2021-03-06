package com.anurag.binary_search_mod;

import java.util.Scanner;

//We have a bitonic array where we need to find minimum index where target appears
public class BSInBitonicArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8, 10, 15, 22, 19, 14, 9, 8, 4, 3, 2};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println("Least index containing " + target + " is " + findIndex(target, arr));
    }

    static int findIndex(int target, int[] arr) {
        int peak = peakElementIndex(arr);
        int index = binarySearch(arr, target, 0, peak);

        if (index != -1) {
            return index;
        }

        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int peakElementIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(int[] ar, int target, int start, int end) {
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
