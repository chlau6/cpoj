package question;

public class Q766 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) return false;
            }
        }

        return true;
    }
}

/*
766. Toeplitz Matrix
 */
