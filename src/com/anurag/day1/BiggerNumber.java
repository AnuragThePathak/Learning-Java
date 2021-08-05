package com.anurag.day1;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m > n) {
            System.out.println(m);
        } else if (m < n) {
            System.out.println(n);
        } else {
            System.out.println("Both are equal");
        }
    }
}
