package question;

public class Q79 {
    public boolean exist(char[][] board, String word) {
        char[] s = word.toCharArray();
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isExist(board, s, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isExist(char[][] board, char[] s, int i, int j, int k) {
        if (k == s.length) {
            return true;
        }

        int m = board.length;
        int n = board[0].length;

        if (i < 0 || i == m || j < 0 || j == n || board[i][j] != s[k]) return false;

        char c = board[i][j];

        board[i][j] = '#';

        boolean result = isExist(board, s, i - 1, j, k + 1) || isExist(board, s, i + 1, j, k + 1) || isExist(board, s, i, j - 1, k + 1) || isExist(board, s, i, j + 1, k + 1);

        board[i][j] = c;

        return result;
    }
}

/*
79. Word Search
 */
