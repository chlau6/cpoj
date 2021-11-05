#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int x = 0;
        int y = 0;

        int result = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for (int i = x; i >= 0; i--) {
            if (board[i][y] == 'p') {
                result++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }

        for (int i = x; i < 8; i++) {
            if (board[i][y] == 'p') {
                result++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }

        for (int i = y; i >= 0; i--) {
            if (board[x][i] == 'p') {
                result++;
                break;
            } else if (board[x][i] == 'B') {
                break;
            }
        }

        for (int i = y; i < 8; i++) {
            if (board[x][i] == 'p') {
                result++;
                break;
            } else if (board[x][i] == 'B') {
                break;
            }
        }

        return result;
    }
};