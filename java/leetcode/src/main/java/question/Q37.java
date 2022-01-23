package question;

public class Q37 {
    public void solveSudoku(char[][] board) {
        recursion(board);
    }

    public boolean recursion(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') continue;

                for (char c = '1'; c <= '9'; c++) {
                    if (!isValid(board, i, j, c)) continue;

                    board[i][j] = c;

                    if (recursion(board)) return true;

                    board[i][j] = '.';
                }

                return false;
            }
        }

        return true;
    }

    public boolean isValid(char[][] board, int i, int j, char c) {
        for (int k = 0; k < 9; k++) {
            if (board[i][k] != '.' && board[i][k] == c) return false;
            if (board[k][j] != '.' && board[k][j] == c) return false;

            int row = i / 3 * 3 + k / 3;
            int col = j / 3 * 3 + k % 3;

            if (board[row][col] != '.' && board[row][col] == c) return false;
        }

        return true;
    }
}

/*
37. Sudoku Solver
 */
