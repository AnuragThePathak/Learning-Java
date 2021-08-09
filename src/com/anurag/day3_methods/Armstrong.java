package com.anurag.day3_methods;

import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args) {
//        our task is to list Armstrong Numbers in between 10,000 to 99,999
        for (int i = 10_000; i <=99_999 ; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static boolean isArmstrong(int n) {
        int rev=0;
        for (int i = n, rem; i >0 ; i/=10) {
            rem=i%10;
            rev+=(int) pow(rem,5);
        }
        return rev==n;
    }
}
