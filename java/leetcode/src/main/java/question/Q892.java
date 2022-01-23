package question;

public class Q892 {
    public int surfaceArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int area = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) area += grid[i][j] * 4 + 2;

                if (i > 0) area -= Math.min(grid[i][j], grid[i - 1][j]) * 2;

                if (j > 0) area -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
            }
        }

        return area;
    }
}

/*
892. Surface Area of 3D Shapes
 */
