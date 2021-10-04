package com.anurag.recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 100402;
        System.out.println(count(n));
    }

    private static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) return c;

        if (n % 10 == 0) c++;
        return helper(n / 10, c);
    }
}
