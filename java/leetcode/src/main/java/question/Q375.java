package question;

public class Q375 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j > 0; j--) {
                int globalMin = Integer.MAX_VALUE;

                for (int k = j + 1; k < i; k++) {
                    int localMin = k + Math.max(dp[j][k - 1], dp[k + 1][i]);
                    globalMin = Math.min(globalMin, localMin);
                }

                dp[j][i] = (j + 1 == i) ? j : globalMin;
            }
        }

        return dp[1][n];
    }
}


/*
375. Guess Number Higher or Lower II
 */
