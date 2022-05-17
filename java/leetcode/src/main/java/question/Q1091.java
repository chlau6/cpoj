package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;

        int result = 0;
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int[][] dir = new int[][]{{-1, 1}, {0, 1}, {1, 1}, {-1, 0}, {1, 0}, {-1, -1}, {0, -1}, {1, -1}};
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            result++;

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int currX = cell[0];
                int currY = cell[1];

                if (currX == m - 1 && currY == n - 1) return result;

                for (int[] d : dir) {
                    int x = cell[0] + d[0];
                    int y = cell[1] + d[1];

                    if (x < 0 || y < 0 || x >= m || y >= n || visited[x][y] || grid[x][y] == 1) continue;

                    visited[x][y] = true;

                    queue.add(new int[]{x, y});
                }
            }
        }

        return -1;
    }
}

/*
1091. Shortest Path in Binary Matrix
 */
