package com.anurag.recursion_array_problems;

import java.util.ArrayList;
import java.util.List;

public class ListOutputWithPassingInArguments {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 3, 8, 4, 8, 4, 8, 4, 8, 4, 8};
        System.out.println(find(arr, 4, 0));
    }

    static List<Integer> find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return new ArrayList<>();
        }

        List<Integer> result = find(arr, target, index + 1);

        if (arr[index] == target) {
            result.add(index);
        }

        return result;
    }
}
