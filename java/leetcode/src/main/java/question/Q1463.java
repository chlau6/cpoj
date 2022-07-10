package question;

public class Q1463 {
    int m;
    int n;
    Integer[][][] dp;

    public int cherryPickup(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        dp = new Integer[m][n][n];
        return dfs(grid, 0, 0, n - 1);
    }

    int dfs(int[][] grid, int row, int left, int right) {
        if (row == m) return 0;

        if (dp[row][left][right] != null) {
            return dp[row][left][right];
        }

        int result = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {

                int x1 = left + i;
                int x2 = right + j;

                if (x1 >= 0 && x2 > x1 && x2 < n) {
                    result = Math.max(result, dfs(grid, row + 1, x1, x2));
                }
            }
        }

        return dp[row][left][right] = result + grid[row][left] + grid[row][right];
    }
}

/*
1463. Cherry Pickup II
 */
