package question;

public class Q1572 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        return n % 2 == 0 ? sum : sum - mat[n / 2][n / 2];
    }
}

/*
1572. Matrix Diagonal Sum
 */
