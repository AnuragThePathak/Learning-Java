package com.anurag.hackerrank;

import java.text.NumberFormat;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

//         Write your code here.
        String money = Double.toString(payment);
        String us = "$" + money;
        String india = "Rs." + money;
        String china = "￥" + money;
        String france = money + " €";
//        NumberFormat us=

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
