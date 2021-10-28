package question;

import annotation.Array;
import annotation.DynamicProgramming;

@Array
@DynamicProgramming
public class Q746 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int[] dp = new int[length];

        for (int i = 2; i < length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return dp[length - 1];
    }
}

/*
746. Min Cost Climbing Stairs
 */
