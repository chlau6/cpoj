package question;

import java.util.Arrays;

public class Q52 {
    int result = 0;

    public int totalNQueens(int n) {
        int[] queens = new int[n];

        Arrays.fill(queens, -1);

        recursion(queens, 0, n);

        return result;
    }

    public void recursion(int[] queens, int row, int n) {
        if (row == n) {
            result++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(queens, row, i)) {
                queens[row] = i;

                recursion(queens, row + 1, n);

                queens[row] = -1;
            }
        }
    }

    public boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }

        return true;
    }
}

/*
50. Pow(x, n)
 */
