package question;

public class Q221 {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }

                result = Math.max(result, dp[i][j]);
            }
        }

        return result * result;
    }
}

/*
221. Maximal Square
 */
