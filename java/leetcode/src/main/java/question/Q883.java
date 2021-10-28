package question;

import annotation.Array;
import annotation.Geometry;
import annotation.Maths;
import annotation.Matrix;

@Array
@Maths
@Geometry
@Matrix
public class Q883 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {
            int col = 0;
            int row = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) area++;
                row = Math.max(row, grid[i][j]);
                col = Math.max(col, grid[j][i]);
            }

            area += col + row;
        }

        return area;
    }
}

/*
883. Projection Area of 3D Shapes
 */
