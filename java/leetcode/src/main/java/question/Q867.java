package question;

import annotation.Array;
import annotation.Matrix;
import annotation.Simulation;

@Array
@Matrix
@Simulation
public class Q867 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(mn)
     */
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }
}

/*
867. Transpose Matrix
 */
