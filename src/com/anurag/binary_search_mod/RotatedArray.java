package com.anurag.binary_search_mod;

import java.util.Scanner;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 11, 12, 0, 2, 3};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println("The element is in " + findIndex(arr, target));
    }

    static int findIndex(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot != -1) {
            if (arr[pivot] == target) {
                return pivot;
            }
            if (arr[0] <= target) {
                return binarySearch(arr, target, 0, pivot);
            }
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

        return binarySearch(arr, target, 0, arr.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

//            Here using start and end despite their values keep changing doesn't affect
//            the result. It's because in cases like before we get end=mid+1 and our
//            first case doesn't work properly that mid before this one we're considering
//            gets returned by 2nd condition.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] ar, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ar[mid] > target) {
                end = mid - 1;
            } else if (ar[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
