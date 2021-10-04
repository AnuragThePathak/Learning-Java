package com.anurag.recursion;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int n = 15551;
        System.out.println(palindrome(n));
    }

    private static boolean palindrome(int n) {
        return n == reverse(n);
    }

    private static int reverse(int n) {
        if (n % 10 == n) return n;

        int digits = (int) Math.log10(n);
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits) + reverse(n / 10));
    }
}
