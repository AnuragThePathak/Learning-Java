package com.anurag.day2;

import java.util.Scanner;

public class Permutation {
    public static int n, r;

    public static int nPr(int m) {
        if (m == n - r) {
            return 1;
        }
        return m * nPr(m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        System.out.println("The value of P(" + n + ", " + r + ") is " + nPr(n));

        sc.close();

    }
}
