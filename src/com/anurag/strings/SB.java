package com.anurag.strings;

// There already exists built-in class named StringBuilder hence we avoided name conflict
public class SB {
    public static void main(String[] args) {
//        We are creating a string consisting of all alphabets sequentially.
//        The best way to write the least code is to use loops to add alphabets in a
//        string one by one. But in such case if we use string we'll create 27 objects
//        in total. Hence, we're using stringbuilder instead.

        StringBuilder builder = new StringBuilder();
        char ch = 'a';

        for (int i = 0; i < 26; i++) {
            builder.append((char) (ch + i));
        }

        System.out.println(builder);
    }
}
