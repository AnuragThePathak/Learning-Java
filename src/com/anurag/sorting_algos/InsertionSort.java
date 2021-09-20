package com.anurag.sorting_algos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 4, 3, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }

        }
    }
}
