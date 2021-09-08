package com.anurag.binary_search_mod;

public class FBQuestion {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, target, false);
        }

        return ans;
    }

    static int binarySearch(int[] nums, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
