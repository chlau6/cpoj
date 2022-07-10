package question;

public class Q1937 {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] dp = new long[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[j] += points[i][j];
            }

            for (int j = 1; j < n; j++) {
                dp[j] = Math.max(dp[j - 1] - 1, dp[j]);
            }

            for (int j = n - 2; j >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j + 1] - 1);
            }
        }

        long result = 0;
        for (int j = 0; j < n; j++) {
            result = Math.max(result, dp[j]);
        }

        return result;
    }
}

/*
1937. Maximum Number of Points with Cost
 */
