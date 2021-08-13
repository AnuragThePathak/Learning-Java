package com.anurag.day4_arrays;

public class StringToCharArrayConversion {
    public static void main(String[] args) {
        String str="OMG99ets";
        char[] arr= str.toCharArray();
        System.out.println(arr);
//        System.out.println(str.toCharArray());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }   // however, index operator can't be used with string, we can here because
        // arr is character array
        System.out.println();

        System.out.println("Using for loop directly on string ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
