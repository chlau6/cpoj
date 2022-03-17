package question;

public class Q312 {
    public int maxCoins(int[] nums) {
        int n = nums.length;

        int[] x = new int[n + 2];
        x[0] = x[n + 1] = 1;

        for (int i = 1; i <= n; i++) {
            x[i] = nums[i - 1];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int size = 1; size <= n; size++) {

            for (int i = 1; i <= n - size + 1; i++) {
                int j = i + size - 1;

                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.max(dp[i][j], x[i - 1] * x[k] * x[j + 1] + dp[i][k - 1] + dp[k + 1][j]);
                }
            }
        }

        return dp[1][n];
    }
}

/*
312. Burst Balloons
 */
