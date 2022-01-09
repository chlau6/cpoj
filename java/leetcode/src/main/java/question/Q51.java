package question;

import java.util.ArrayList;
import java.util.List;

public class Q51 {
    /*
    Time Complexity: O(n!)   Space Complexity: O(n^2)
     */
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        recursion(result, board, 0, n);

        return result;
    }

    public void recursion(List<List<String>> result, char[][] board, int currRow, int n) {
        if (currRow == n) {
            result.add(generate(board, n));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(board, currRow, i, n)) {
                board[currRow][i] = 'Q';

                recursion(result, board, currRow + 1, n);

                board[currRow][i] = '.';
            }
        }
    }

    public boolean isValid(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public List<String> generate(char[][] board, int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < n; j++) {
                builder.append(board[i][j]);
            }

            result.add(builder.toString());
        }

        return result;
    }
}

/*
50. Pow(x, n)
 */
