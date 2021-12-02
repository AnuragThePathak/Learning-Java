package com.anurag.recursion_array_problems;

public class SearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 7};
        System.out.println(find(arr, 2, 0));
    }

    static int find(int[] arr, int element, int index) {
        if (arr.length == index + 1) {
            return -1;
        }

        if (arr[index] == element) {
            return index;
        }

        return find(arr, element, index + 1);
    }
}
