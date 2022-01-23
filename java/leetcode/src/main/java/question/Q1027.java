package question;

public class Q1027 {
    public int longestArithSeqLength(int[] nums) {
        int[][] dp = new int[nums.length][1001];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int diffCell = nums[i] - nums[j] + 500;
                dp[i][diffCell] = dp[j][diffCell] + 1;
                max = Math.max(dp[i][diffCell], max);
            }
        }
        return max;
    }
}

/*
1027. Longest Arithmetic Subsequence
 */
