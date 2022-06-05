package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q994 {
    /*
    DFS
     */
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        int[][] dir = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        int m = grid.length;
        int n = grid[0].length;
        int orange = 0;
        int day = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    orange++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        if (orange == 0) return 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            day++;

            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();


                for (int[] d : dir) {
                    int x = pos[0] + d[0];
                    int y = pos[1] + d[1];

                    if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1) continue;

                    orange--;
                    grid[x][y] = 2;
                    queue.add(new int[]{x, y});
                }
            }
        }

        return orange == 0 ? day - 1 : -1;
    }
}

/*
994. Rotting Oranges
 */
