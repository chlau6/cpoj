package question;

public class Q576 {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[maxMove + 1][m][n];

        for (int k = 1; k <= maxMove; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    long v1 = (i == 0) ? 1 : dp[k - 1][i - 1][j];
                    long v2 = (j == 0) ? 1 : dp[k - 1][i][j - 1];
                    long v3 = (i == m - 1) ? 1 : dp[k - 1][i + 1][j];
                    long v4 = (j == n - 1) ? 1 : dp[k - 1][i][j + 1];

                    dp[k][i][j] = (int) ((v1 + v2 + v3 + v4) % 1000000007);
                }
            }
        }

        return dp[maxMove][startRow][startColumn];
    }
}

/*
576. Out of Boundary Paths
 */
