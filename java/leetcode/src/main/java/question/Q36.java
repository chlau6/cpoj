package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Matrix;

@Array
@HashTable
@Matrix
public class Q36 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] grid = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int k = i / 3 * 3 + j / 3;
                    if (row[i][num] || col[j][num] || grid[k][num]) {
                        return false;
                    }

                    row[i][num] = col[j][num] = grid[k][num] = true;
                }
            }
        }

        return true;
    }
}

/*
36. Valid Sudoku
 */
