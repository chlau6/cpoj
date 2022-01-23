#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        int m = board.size();
        int n = board[0].size();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isExist(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    bool isExist(vector<vector<char>>& board, string word, int i, int j, int k) {
        if (k == word.size()) {
            return true;
        }

        int m = board.size();
        int n = board[0].size();

        if (i < 0 || i == m || j < 0 || j == n || board[i][j] != word[k]) return false;

        char c = board[i][j];

        board[i][j] = '#';

        bool result = isExist(board, word, i - 1, j, k + 1) || isExist(board, word, i + 1, j, k + 1) || isExist(board, word, i, j - 1, k + 1) || isExist(board, word, i, j + 1, k + 1);

        board[i][j] = c;

        return result;
    }
};