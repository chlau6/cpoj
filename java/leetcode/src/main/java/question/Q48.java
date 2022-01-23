package question;

public class Q48 {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int k = 0;
        int l = m - 1;

        while (k < l) {
            int[] temp = matrix[k];
            matrix[k++] = matrix[l];
            matrix[l--] = temp;
        }

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

/*
48. Rotate Image
 */
