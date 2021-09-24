package com.anurag.strings;

import java.util.Arrays;

public class ArrayComparision {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println(arr == arr2); // So arrays do not have pool like Strings
        System.out.println(arr.equals(arr2));
        System.out.println(Arrays.equals(arr, arr2));

        int[] arr3 = new int[3];
        System.out.println(arr == arr3);
        System.out.println(Arrays.equals(arr, arr3));
    }
}
