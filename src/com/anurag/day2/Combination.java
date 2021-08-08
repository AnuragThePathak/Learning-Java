package com.anurag.day2;

import java.util.Scanner;

public class Combination {
    public static int nCr(int n,int r){
        if (r==0 || r==n){
            return 1;
        }
        return nCr(n-1,r)+nCr(n-1,r-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        System.out.println("The value of C("+n+", "+r+") is "+nCr(n,r));

        sc.close();
    }
}
