package com.anurag.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int a = fibo(4);
        System.out.println(a);
    }

    private static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 2) + fibo(n - 1);   // The first function to be called
//        depends on position only. Whichever is present first is also called first.
    }
}
