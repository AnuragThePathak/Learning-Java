package com.anurag.day2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
//        for (var i : num) {
//            i = sc.nextInt();
//            sum += i;
//        }
//        The above code doesn't edit the elements of the array as for
//        like it doesn't in c++ if we don't use &.

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
        float average = (float) sum / n;
        System.out.println("Average = " + average);
        sc.close();
    }
}
