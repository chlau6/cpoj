#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
        vector<vector<int>> result;

        int m = heights.size();
        int n = heights[0].size();
        vector<vector<bool>> pacific(m, vector<bool>(n));
        vector<vector<bool>> atlantic(m, vector<bool>(n));

        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, 0, i, 0);
            dfs(heights, atlantic, 0, i, n - 1);
        }

        for (int i = 0; i < n; i++) {
            dfs(heights, pacific, 0, 0, i);
            dfs(heights, atlantic, 0, m - 1, i);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.push_back({i, j});
                }
            }
        }

        return result;
    }

    void dfs(vector<vector<int>>& heights, vector<vector<bool>>& visited, int height, int i, int j) {
        int m = heights.size();
        int n = heights[0].size();

        if (i < 0 || j < 0 || i == m || j == n || visited[i][j] || height > heights[i][j]) return;

        visited[i][j] = true;

        dfs(heights, visited, heights[i][j], i + 1, j);
        dfs(heights, visited, heights[i][j], i - 1, j);
        dfs(heights, visited, heights[i][j], i, j + 1);
        dfs(heights, visited, heights[i][j], i, j - 1);
    }
};