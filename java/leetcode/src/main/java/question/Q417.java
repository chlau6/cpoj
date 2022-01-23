package question;

import java.util.ArrayList;
import java.util.List;

public class Q417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();

        if (heights.length == 0 || heights[0].length == 0) return ans;
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < n; i++) {
            dfs(heights, pacific, 0, 0, i);
            dfs(heights, atlantic, 0, m - 1, i);
        }

        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, 0, i, 0);
            dfs(heights, atlantic, 0, i, n - 1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    ans.add(List.of(i, j));
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] heights, boolean[][] visited, int height, int i, int j) {
        int m = heights.length;
        int n = heights[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || heights[i][j] < height) return;
        visited[i][j] = true;

        dfs(heights, visited, heights[i][j], i + 1, j);
        dfs(heights, visited, heights[i][j], i - 1, j);
        dfs(heights, visited, heights[i][j], i, j + 1);
        dfs(heights, visited, heights[i][j], i, j - 1);
    }
}

/*
417. Pacific Atlantic Water Flow
 */
