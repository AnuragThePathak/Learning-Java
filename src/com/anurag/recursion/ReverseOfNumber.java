package com.anurag.recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 1539;
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {
        if (n % 10 == n) return n;

        int digits = (int) Math.log10(n);
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits) + reverse(n / 10));
    }
}
