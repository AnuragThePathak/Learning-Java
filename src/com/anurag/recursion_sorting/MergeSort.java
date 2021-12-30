package com.anurag.recursion_sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 6, 3, 0, 9, 5, 4, -1, -2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] arr = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[index++] = left[i++];
            } else {
                arr[index++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[index++] = left[i++];
        }

        while (j < right.length) {
            arr[index++] = right[j++];
        }

        return arr;
    }
}
