#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        int m = grid.size();
        int n = grid[0].size();

        vector<vector<int>> result(m, vector<int>(n));

        int start = m * n - k % (m * n);
        int end = start + m * n;

        for (int i = start; i < end; i++) {
            int index = i % (m * n);
            int r = index / n;
            int c = index % n;

            int newRow = (i - start) / n;
            int newCol = (i - start) % n;

            result[newRow][newCol] = grid[r][c];
        }

        return result;
    }
};