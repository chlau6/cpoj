package question;

public class Q198 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int n = nums.length;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        return dp[n];
    }
}

/*
198. House Robber
 */