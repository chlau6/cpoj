package question;

public class Q2328 {
    int mod = 1000000007;
    int[][] dir = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    long[][] dp;
    int m;
    int n;

    public int countPaths(int[][] grid) {
        long result = 0;
        m = grid.length;
        n = grid[0].length;
        dp = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = (result + dfs(grid, i, j)) % mod;
            }
        }

        return (int) result;
    }

    public long dfs(int[][] grid, int i, int j) {
        if (dp[i][j] > 0) return dp[i][j];


        int m = grid.length;
        int n = grid[0].length;

        long result = 1;
        for (int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];

            if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] <= grid[i][j]) continue;

            result = (result + dfs(grid, x, y)) % mod;

        }

        return dp[i][j] = result;
    }
}

/*
2328. Number of Increasing Paths in a Grid
 */
