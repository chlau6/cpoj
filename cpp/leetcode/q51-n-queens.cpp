#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> result;
        vector<string> board(n, string(n, '.'));

        recursion(result, board, 0, n);

        return result;
    }

    void recursion(vector<vector<string>>& result, vector<string>& board, int currRow, int n) {
        if (currRow == n) {
            result.push_back(board);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (valid(board, currRow, i, n)) {
                board[currRow][i] = 'Q';

                recursion(result, board, currRow + 1, n);

                board[currRow][i] = '.';
            }
        }
    }

    bool valid(vector<string>& board, int row, int col, int n) {
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
};