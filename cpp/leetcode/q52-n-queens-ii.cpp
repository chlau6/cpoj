#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int totalNQueens(int n) {
        vector<int> queens(n, -1);
        int result = 0;

        recursion(queens, result, 0, n);

        return result;
    }

    void recursion(vector<int>& queens, int& result, int row, int n) {
        if (row == n) {
            result++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col;

                recursion(queens, result, row + 1, n);

                queens[row] = -1;
            }
        }
    }

    bool isValid(vector<int>& queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || abs(row - i) == abs(col - queens[i])) {
                return false;
            }
        }

        return true;
    }
};