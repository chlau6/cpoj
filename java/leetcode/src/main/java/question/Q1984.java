package question;

import annotation.Array;
import annotation.Sorting;

import java.util.Arrays;

@Array
@Sorting
public class Q1984 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = k - 1; i < n; i++) {
            result = Math.min(result, nums[i] - nums[i - k + 1]);
        }

        return result;
    }
}
/*
1984. Minimum Difference Between Highest and Lowest of K Scores
 */
