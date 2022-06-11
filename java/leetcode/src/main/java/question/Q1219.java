package question;

public class Q1219 {
    int[][] dir = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dfs(grid, i, j));
            }
        }

        return result;
    }

    public int dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] <= 0) return 0;

        int result = 0;
        grid[i][j] = -grid[i][j];

        for (int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];

            result = Math.max(result, dfs(grid, x, y));
        }

        grid[i][j] = -grid[i][j];

        return grid[i][j] + result;
    }
}

/*
1219. Path with Maximum Gold
 */
