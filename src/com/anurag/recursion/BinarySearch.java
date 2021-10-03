package com.anurag.recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 11, 12, 13, 17};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return mid;

        if (arr[mid] > target) return search(arr, target, start, mid - 1);
        return search(arr, target, mid + 1, end);
    }
}
