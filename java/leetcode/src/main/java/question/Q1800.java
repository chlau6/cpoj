package question;

import annotation.Array;

@Array
public class Q1800 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maxAscendingSum(int[] nums) {
        int localMax = nums[0];
        int globalMax = localMax;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            localMax = (nums[i] > nums[i - 1]) ? localMax + nums[i] : nums[i];
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}

/*
1800. Maximum Ascending Subarray Sum
 */
