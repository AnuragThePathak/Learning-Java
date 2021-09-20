package com.anurag.sorting_algos;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else i++;

        }
    }
}
