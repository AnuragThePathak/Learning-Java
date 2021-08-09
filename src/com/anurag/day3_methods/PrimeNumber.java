package com.anurag.day3_methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number is prime: "+isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int i;
        for (i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return i * i > n;
    }
}
