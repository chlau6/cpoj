package question;

public class Q329 {
    int[][] dir = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int result = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dfs(matrix, dp, i, j));
            }
        }

        return result;
    }

    private int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (dp[i][j] > 0) return dp[i][j];

        int m = matrix.length;
        int n = matrix[0].length;
        int result = 1;

        for (int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];

            if (x < 0 || y < 0 || x >= m || y >= n || matrix[x][y] <= matrix[i][j]) continue;

            int length = 1 + dfs(matrix, dp, x, y);
            result = Math.max(result, length);
        }

        dp[i][j] = result;

        return result;
    }
}

/*
329. Longest Increasing Path in a Matrix
 */
