package com.anurag;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0){
                System.out.println(n+" is not prime");
                return;
            }
        }
        System.out.println(n+" is prime");
    }
}
