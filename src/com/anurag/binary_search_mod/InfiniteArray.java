package com.anurag.binary_search_mod;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 12, 14, 18, 22, 25, 29, 35, 38, 41};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println("The element is in index number " + index(arr, target));
    }

    static int index(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = start + 2 * (end - start + 1);
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
