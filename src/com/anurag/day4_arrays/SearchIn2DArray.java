package com.anurag.day4_arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] ar = {{2, 3, 4},
                {12, 6},
                {3, 6, 7, 0}};

        int[] ans=linSearch(ar, 2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linSearch(int[][] ar, int target){
        for (int i=0; i<ar.length; i++){
            for (var j:ar[i]){
                if (j == target) {
                    return new int[] {i,j};
//                    the below method is also correct as
//                    int[] ans={i,j};
//                    return ans;
                }
            }
        }

        return new int[]{-1,-1};
    }
}
