#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    Node* construct(vector<vector<int>>& grid) {
        return build(grid, grid.size(), 0, 0);
    }

    Node* build(vector<vector<int>>& grid, int n, int x, int y) {
        if (n == 0) return NULL;

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] == grid[x][y]) continue;

                return new Node(true, false,
                                build(grid, n / 2, x, y),
                                build(grid, n / 2, x, y + n / 2),
                                build(grid, n / 2, x + n / 2, y),
                                build(grid, n / 2, x + n / 2, y + n / 2));
            }
        }

        return new Node(grid[x][y] == 1, true, NULL, NULL, NULL, NULL);
    }
};