package question;

import java.util.HashMap;

public class Q494 {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        return helper(dp, nums, target, 0);
    }

    public int helper(HashMap<Integer, Integer>[] dp, int[] nums, int target, int index) {
        if (index >= nums.length) return target == 0 ? 1 : 0;

        if (dp[index].containsKey(target)) return dp[index].get(target);

        int count1 = helper(dp, nums, target - nums[index], index + 1);
        int count2 = helper(dp, nums, target + nums[index], index + 1);

        dp[index].put(target, count1 + count2);

        return count1 + count2;
    }
}

/*
494. Target Sum
 */
