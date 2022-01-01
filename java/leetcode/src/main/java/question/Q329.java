package question;

public class Q329 {
    /*
    Time Complexity: O(mn)  Space Complexity: O(mn)
     */
    int[][] directions = new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;

        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans = Math.max(ans, dfs(matrix, dp, i, j));
            }
        }
        return ans;
    }

    private int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (dp[i][j] > 0) return dp[i][j];

        int max = 1;

        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] <= matrix[i][j]) continue;
            int len = 1 + dfs(matrix, dp, x, y);
            max = Math.max(max, len);
        }

        dp[i][j] = max;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Q329().longestIncreasingPath(new int[][]{{1, 2}}));
    }
}

/*
329. Longest Increasing Path in a Matrix
 */
