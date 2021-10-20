package question;

import annotation.Array;
import annotation.DivideAndConquer;
import annotation.DynamicProgramming;

@Array
@DivideAndConquer
@DynamicProgramming
public class Q53 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maxSubArray(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for (int num : nums) {
            localMax = Math.max(localMax + num, num);
            globalMax = Math.max(localMax, globalMax);
        }

        return globalMax;
    }
}

/*
53. Maximum Subarray
 */