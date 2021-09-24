package com.anurag.strings;

public class Comparision {
    public static void main(String[] args) {
        String lang = "Java";
        String lang2 = "Java";
        System.out.println(lang == lang2);

        lang2 = "Kotlin";
        System.out.println(lang == lang2);

        String lang3 = "Kotlin";
        System.out.println(lang2 == lang3);

        String lang4 = new String("Java");
        System.out.println(lang == lang4);
        System.out.println(lang.equals(lang4));

        String lang5 = new String("Java");
        System.out.println(lang5 == lang4);

        String lang6;
        lang6 = new String("Java");
        System.out.println(lang == lang6);
    }
}
