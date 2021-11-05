#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int surfaceArea(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int area = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) area += grid[i][j] * 4 + 2;

                if (i > 0) area -= min(grid[i][j], grid[i - 1][j]) * 2;

                if (j > 0) area -= min(grid[i][j], grid[i][j - 1]) * 2;
            }
        }

        return area;
    }
};