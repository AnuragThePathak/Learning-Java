package com.anurag.day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int t = input.nextInt();
        int R = input.nextInt();
        int I=P*R*t;
        System.out.println("Simple Interest will be "+I);
    }
}
