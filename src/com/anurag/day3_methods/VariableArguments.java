package com.anurag.day3_methods;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        func(a, b);
        func(a, b, c,d);
    }

    static void func(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
