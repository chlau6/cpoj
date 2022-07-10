package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q317 {
    int m;
    int n;

    public int shortestDistance(int[][] grid) {
        int result = Integer.MAX_VALUE;
        int buildings = countBuildings(grid);
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    result = Math.min(result, bfs(grid, i, j, buildings));
                }
            }
        }

        return result;
    }

    public int countBuildings(int[][] grid) {
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) result++;
            }
        }

        return result;
    }

    public int bfs(int[][] grid, int i, int j, int totalBuildings) {
        if (totalBuildings == 0) return Integer.MAX_VALUE;

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});

        int step = 0;
        int foundBuildings = 0;
        int totalSteps = 0;

        while (!q.isEmpty()) {
            int length = q.size();

            for (int k = 0; k < length; k++) {
                int[] front = q.poll();
                int x = front[0];
                int y = front[1];

                if (!visited[x][y]) {
                    visited[x][y] = true;

                    if (x - 1 >= 0) q.add(new int[]{x - 1, y});
                    if (y - 1 >= 0) q.add(new int[]{x, y - 1});
                    if (x + 1 < m) q.add(new int[]{x + 1, y});
                    if (y + 1 < n) q.add(new int[]{x, y + 1});
                } else {
                    foundBuildings++;
                    totalSteps += step;

                    if (foundBuildings == totalBuildings) return totalSteps;
                }
            }

            step++;
        }

        return Integer.MAX_VALUE;
    }
}

/*
317. Shortest Distance from All Buildings
 */
