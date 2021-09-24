package com.anurag.strings;

public class ImplicitConversionToString {
    public static void main(String[] args) {
        System.out.println('a' + 1);
        System.out.println((char) ('a' + 1));

        System.out.println("Hello" + 9);
        System.out.println("Hello" + 9 + 'c');
        System.out.println(9 + "Hello");
        System.out.println('c' + "Hello");

        System.out.println(4 + 'e' + "Hello");
    }
}
