package com.anurag.day2;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[2];
        int[] y = new int[2];
        for (int i = 0; i < 2; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        double dist = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
        System.out.println(dist);

        sc.close();
    }
}
