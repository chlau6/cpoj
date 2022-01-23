package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q1263 {
    char[][] g;
    int m, n;
    int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int minPushBox(char[][] grid) {
        g = grid;
        m = g.length;
        n = g[0].length;
        int step = 0;
        boolean[][][] visited = new boolean[m][n][4];

        Queue<Position> queue = new LinkedList<>();
        int[] box = new int[]{-1, -1}, target = new int[]{-1, -1}, player = new int[]{-1, -1};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 'B') box = new int[]{i, j};
                if (g[i][j] == 'T') target = new int[]{i, j};
                if (g[i][j] == 'S') player = new int[]{i, j};
            }
        }
        queue.offer(new Position(box[0], box[1], player[0], player[1]));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position position = queue.remove();
                if (position.boxX == target[0] && position.boxY == target[1]) return step;
                for (int j = 0; j < direction.length; j++) {
                    if (visited[position.boxX][position.boxY][j]) continue;
                    int[] dir = direction[j];

                    int nextPlayerX = position.boxX + dir[0];
                    int nextPlayerY = position.boxY + dir[1];  // where pl stands, have room to push;

                    if (nextPlayerX < 0 || nextPlayerX >= m || nextPlayerY < 0 || nextPlayerY >= n || g[nextPlayerX][nextPlayerY] == '#')
                        continue;
                    int nextBoxX = position.boxX - dir[0];
                    int nextBoxY = position.boxY - dir[1];  // box next spots;
                    if (nextBoxX < 0 || nextBoxX >= m || nextBoxY < 0 || nextBoxY >= n || g[nextBoxX][nextBoxY] == '#')
                        continue;
                    if (!reachable(nextPlayerX, nextPlayerY, position)) continue;
                    visited[position.boxX][position.boxY][j] = true;
                    queue.offer(new Position(nextBoxX, nextBoxY, position.boxX, position.boxY));
                }
            }
            step++;
        }
        return -1;
    }

    private boolean reachable(int i, int j, Position position) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{position.playerX, position.playerY});
        boolean[][] visited = new boolean[m][n];
        visited[position.boxX][position.boxY] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.remove();
            if (curr[0] == i && curr[1] == j) return true;
            for (int[] dir : direction) {
                int currX = curr[0] - dir[0];
                int currY = curr[1] - dir[1];  // box next spots;
                if (currX < 0 || currX >= m || currY < 0 || currY >= n || visited[currX][currY] || g[currX][currY] == '#')
                    continue;
                visited[currX][currY] = true;
                queue.offer(new int[]{currX, currY});
            }
        }
        return false;
    }

    class Position {
        public int boxX;
        public int boxY;
        public int playerX;
        public int playerY;

        public Position(int boxX, int boxY, int playerX, int playerY) {
            this.boxX = boxX;
            this.boxY = boxY;
            this.playerX = playerX;
            this.playerY = playerY;
        }
    }
}

/*
1263. Minimum Moves to Move a Box to Their Target Location
 */
