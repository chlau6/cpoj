package question;

public class Q1975 {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int zero = 0;
        int negative = 0;
        int min = Integer.MAX_VALUE;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.abs(matrix[i][j]);
                zero += (matrix[i][j] == 0 ? 1 : 0);
                negative += (matrix[i][j] < 0 ? 1 : 0);
                min = Math.min(min, Math.abs(matrix[i][j]));
            }
        }

        if (zero > 0) {
            return sum;
        }

        if (negative % 2 == 0) {
            return sum;
        }

        return sum - min * 2;
    }
}

/*
1975. Maximum Matrix Sum
 */
