package question;

import company.Facebook;

@Facebook
public class Q348 {
    /*
    Time Complexity: O(1)   Space Complexity: O(n)
     */
    class TicTacToe {
        private int[] rows;
        private int[] cols;
        private int diagonal;
        private int revDiagonal;
        private int size;

        /**
         * Initialize your data structure here.
         */
        public TicTacToe(int n) {
            rows = new int[n];
            cols = new int[n];
            size = n;
        }

        public int move(int row, int col, int player) {
            int add = player == 1 ? 1 : -1;
            rows[row] += add;
            cols[col] += add;
            diagonal += (row == col ? add : 0);
            revDiagonal += (row == size - col - 1 ? add : 0);

            return Math.abs(row) == size || Math.abs(col) == size || Math.abs(diagonal) == size || Math.abs(revDiagonal) == size ? player : 0;
        }
    }

    /**
     * Your TicTacToe object will be instantiated and called as such:
     * TicTacToe obj = new TicTacToe(n);
     * int param_1 = obj.move(row,col,player);
     */
}

/*
348. Design Tic-Tac-Toe
 */
