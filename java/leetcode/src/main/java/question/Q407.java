package question;

import java.util.PriorityQueue;

public class Q407 {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        int level = Integer.MIN_VALUE;
        int result = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));

        boolean[][] visited = new boolean[m][n];
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    pq.add(new int[]{heightMap[i][j], i * n + j});
                    visited[i][j] = true;
                }
            }
        }

        while (!pq.isEmpty()) {
            int[] top = pq.poll();

            int height = top[0];
            int row = top[1] / n;
            int col = top[1] % n;

            level = Math.max(level, height);

            for (int[] d : directions) {
                int x = row + d[0];
                int y = col + d[1];

                if (x < 0 || y < 0 || x == m || y == n || visited[x][y]) continue;
                visited[x][y] = true;

                if (heightMap[x][y] < level) {
                    result += level - heightMap[x][y];
                }

                pq.add(new int[]{heightMap[x][y], x * n + y});
            }
        }

        return result;

    }
}

/*
407. Trapping Rain Water II
 */
