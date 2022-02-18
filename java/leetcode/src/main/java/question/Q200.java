package question;

public class Q200 {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    result++;
                }
            }
        }

        return result;
    }

    public void dfs(char[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;

        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == '0') return;

        grid[x][y] = '0';

        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }
}

/*
200. Number of Islands
 */
