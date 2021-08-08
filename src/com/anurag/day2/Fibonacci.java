package com.anurag.day2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int nthTerm = b;

        for (int i = 2; i < n; i++) {
//            nthTerm = a + b;
//            a = b;
//            b = nthTerm;

//            alternative
            b=nthTerm;
            nthTerm+=a;
            a=b;
        }
        System.out.println(nthTerm);

        sc.close();
    }
}
