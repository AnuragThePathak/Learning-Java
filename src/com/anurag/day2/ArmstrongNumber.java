package com.anurag.day2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        to count number of digits we can use logarithm or string conversion
//        using string (in this case this method will be better as we have to get each digit as well)
//        However we won't be using this one too as we must save the string.
//        int digits=String.valueOf(n).length();

//        logarithmic method
//        int digits=(int)(Math.log10(n)+1);

        String str = String.valueOf(n);
        int digits = str.length();
        int armstrong = 0;
        int x;
        for (char i : str.toCharArray()) {
//            x = str.charAt(i);
            x= i-'0';
//            System.out.println(x);
            armstrong += (int) Math.pow(x, digits);
        }
        if (n==armstrong){
            System.out.println(n+" is an Armstrong number");
        }
        else {
            System.out.println(n+" is not an Armstrong number");
        }

        sc.close();
    }
}
