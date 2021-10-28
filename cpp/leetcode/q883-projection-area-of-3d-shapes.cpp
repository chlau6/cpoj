#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int projectionArea(vector<vector<int>>& grid) {
        int n = grid.size();
        int area = 0;

        for (int i = 0; i < n; i++) {
            int col = 0;
            int row = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) area++;
                row = max(row, grid[i][j]);
                col = max(col, grid[j][i]);
            }

            area += col + row;
        }

        return area;
    }
};