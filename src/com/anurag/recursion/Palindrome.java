package com.anurag.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "AbccbA";
        System.out.println(palindrome(str));
        System.out.println(palindrome(String.valueOf(123721)));
    }

    private static boolean palindrome(String str) {
//        Here we can use start and end in the original function.
//        But let's try using helper function.

        return helper(str, 0, str.length() - 1);
    }

    private static boolean helper(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return helper(str, start + 1, end - 1);
    }
}
