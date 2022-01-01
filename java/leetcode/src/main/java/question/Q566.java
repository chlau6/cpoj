package question;

public class Q566 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(mn)
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m == r && n == c || m * n != r * c) return mat;

        int x = 0;
        int y = 0;
        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[x][y];

                if (++y == n) {
                    x++;
                    y = 0;
                }
            }
        }

        return result;
    }
}

/*
566. Reshape the Matrix
 */
