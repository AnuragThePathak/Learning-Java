package com.anurag.day4_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
//        sc.next(Arrays.toString(arr)); // not possible to do while taking input
        for (int i:arr){
            i=sc.nextInt();
        }
//        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
