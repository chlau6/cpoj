
package question;

public class Q289 {
    public void gameOfLife(int[][] board) {
        int[][] dir = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;

                for (int k = 0; k < 8; k++) {
                    int x = i + dir[k][0];
                    int y = j + dir[k][1];

                    if (x < 0 || y < 0 || x >= m || y >= n) continue;

                    if (board[x][y] == 1 || board[x][y] == 2) {
                        count++;
                    }
                }

                if (board[i][j] == 1 && (count < 2 || count > 3)) {
                    board[i][j] = 2;
                } else if (board[i][j] == 0 && count == 3) {
                    board[i][j] = 3;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }
}

/*
289. Game of Life
 */

/*
0: dead -> dead
1: alive -> alive
2: alive -> dead
3: dead -> alive
 */
