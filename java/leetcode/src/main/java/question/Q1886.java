package question;

import annotation.Array;
import annotation.Matrix;

import java.util.Arrays;

@Array
@Matrix
public class Q1886 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(1)
     */
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean[] r = new boolean[4];
        Arrays.fill(r, true);

        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) r[0] = false;
                if (mat[i][j] != target[n - 1 - j][i]) r[1] = false;
                if (mat[i][j] != target[n - 1 - i][n - 1 - j]) r[2] = false;
                if (mat[i][j] != target[j][n - 1 - i]) r[3] = false;
            }
        }

        return r[0] || r[1] || r[2] || r[3];
    }
}

/*
1886. Determine Whether Matrix Can Be Obtained By Rotation
 */
