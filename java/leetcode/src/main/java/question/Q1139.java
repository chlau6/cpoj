package question;

public class Q1139 {
    public int largest1BorderedSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] hor = new int[m][n];
        int[][] ver = new int[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue;

                hor[i][j] = (j == 0) ? 1 : hor[i][j - 1] + 1;
                ver[i][j] = (i == 0) ? 1 : ver[i - 1][j] + 1;
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int min = Math.min(hor[i][j], ver[i][j]);

                while (min > max) {
                    if (ver[i][j - min + 1] >= min && hor[i - min + 1][j] >= min) {
                        max = min;
                        break;
                    }

                    min--;
                }
            }
        }

        return max * max;
    }
}

/*
1139. Largest 1-Bordered Square
 */
