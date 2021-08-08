package com.anurag.day2;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        System.out.println((int)('a')+" "+(int)('Z'));
        if (ch <= 'Z' && ch >= 'A') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else if (ch <= 'z' && ch >= 'a') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

//            Alternatively we can also use modern switch case in jdk 14 onwards
//            case 'a','e','i','o','u' -> System.out.println("Vowel");
//            default -> System.out.println("Consonant");

        } else {
            System.out.println("Not a alphabet");
        }

    }
}
