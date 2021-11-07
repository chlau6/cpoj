#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int r = m - 1;
        int c = 0;
        int result = 0;

        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                result += (n - c);
                r--;
            } else {
                c++;
            }
        }

        return result;
    }
};