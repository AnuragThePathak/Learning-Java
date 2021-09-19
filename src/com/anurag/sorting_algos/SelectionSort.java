package com.anurag.sorting_algos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {18, 13, 10, 5, 4, 3};
        sort(arr);
        System.out.println("The sorted array is :" + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = arr.length - i - 1;
            int max = findMax(arr, j);

            int temp = arr[j];
            arr[j] = arr[max];
            arr[max] = temp;
        }
    }

    private static int findMax(int[] arr, int end) {
        int max = end;
        for (int i = 0; i < end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
