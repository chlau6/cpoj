package question;

public class Q1905 {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid1[i][j] == 0) {
                    dfs(grid2, i, j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    result++;
                    dfs(grid2, i, j);
                }
            }
        }

        return result;
    }

    public void dfs(int[][] grid2, int i, int j) {
        int m = grid2.length;
        int n = grid2[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid2[i][j] == 0) return;

        grid2[i][j] = 0;

        dfs(grid2, i - 1, j);
        dfs(grid2, i + 1, j);
        dfs(grid2, i, j - 1);
        dfs(grid2, i, j + 1);
    }
}

/*
1905. Count Sub Islands
 */
