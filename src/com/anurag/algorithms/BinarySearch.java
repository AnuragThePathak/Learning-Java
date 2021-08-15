package com.anurag.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar={-2,0,3,5,6,9,10,14,15,34,36,38,45,49};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(target+" is in index no. "+binarySearch(ar,target)+ " of" +
                " array "+ Arrays.toString(ar));
    }

    static int binarySearch(int[] ar, int target) {
        int start = 0;
        int end = ar.length-1;

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
