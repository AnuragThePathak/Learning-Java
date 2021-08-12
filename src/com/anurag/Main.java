package com.anurag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        variable names must contain _, $, letter, number only, can't start with number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
