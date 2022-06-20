package question;

public class Q1027 {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][1001];
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j] + 500;

                dp[i][diff] = dp[j][diff] + 1;

                result = Math.max(result, dp[i][diff]);
            }
        }


        return result + 1;
    }
}

/*
1027. Longest Arithmetic Subsequence
 */
