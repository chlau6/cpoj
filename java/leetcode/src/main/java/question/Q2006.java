package question;

import annotation.Array;

@Array
public class Q2006 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int countKDifference(int[] nums, int k) {
        int[] counts = new int[101];
        int result = 0;

        for (int num : nums) {
            counts[num]++;
        }

        for (int i = k; i < 101; i++) {
            result += counts[i] * counts[i - k];
        }

        return result;
    }
}
/*
2006. Count Number of Pairs With Absolute Difference K
 */
