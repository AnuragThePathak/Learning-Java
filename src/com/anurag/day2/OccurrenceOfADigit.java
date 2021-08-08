package com.anurag.day2;

import java.util.Scanner;

public class OccurrenceOfADigit {
    public static void main(String[] args) {
//        we have to find how many times a particular digit appears in some number
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int count=0;

        while (n>0)
        {
            if ((n%10)==m)
            {
                count++;
            }

            n/=10;
        }
        System.out.println(count);

//        conversion into string can too be used

        sc.close();
    }
}
