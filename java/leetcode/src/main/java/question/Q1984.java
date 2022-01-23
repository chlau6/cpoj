package question;

import java.util.Arrays;

public class Q1984 {
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
