#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> dir = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    int longestIncreasingPath(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<vector<int>> dp(m, vector<int>(n));
        int result = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result = max(result, dfs(matrix, dp, i, j));
            }
        }

        return result;
    }

    int dfs(vector<vector<int>>& matrix, vector<vector<int>>& dp, int i, int j) {
        if (dp[i][j] > 0) return dp[i][j];

        int m = matrix.size();
        int n = matrix[0].size();
        int result = 1;

        for (auto& d : dir) {
            int x = i + d[0];
            int y = j + d[1];

            if (x < 0 || y < 0 || x >= m || y >= n || matrix[x][y] <= matrix[i][j]) continue;
            int length = 1 + dfs(matrix, dp, x, y);
            result = max(result, length);
        }

        dp[i][j] = result;

        return result;
    }
};