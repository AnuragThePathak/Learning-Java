package com.anurag.binary_search_mod;

public class FindingSquare {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 2;
        long end = x / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid < x) {
                start = mid + 1;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                return (int) mid;
            }
        }

        return (int) end;
    }
}
