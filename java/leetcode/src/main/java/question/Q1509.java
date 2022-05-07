package question;

import java.util.Arrays;

public class Q1509 {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;

        int n = nums.length;
        Arrays.sort(nums);

        int result = Integer.MAX_VALUE;

        result = Math.min(result, nums[n - 1] - nums[3]);
        result = Math.min(result, nums[n - 4] - nums[0]);
        result = Math.min(result, nums[n - 2] - nums[2]);
        result = Math.min(result, nums[n - 3] - nums[1]);

        return result;
    }
}

/*
1509. Minimum Difference Between Largest and Smallest Value in Three Moves
 */
