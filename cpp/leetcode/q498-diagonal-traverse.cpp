#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        int size = m * n;
        int c = 0;
        int r = 0;
        vector<int> result(size);
        vector<vector<int>> dirs = {{-1, 1}, {1, -1}};
        int d = 0;

        for (int i = 0; i < size; i++) {
            result[i] = mat[r][c];
            r += dirs[d][0];
            c += dirs[d][1];

            if (r >= m) {
                r = m - 1;
                c += 2;
                d = 1 - d;
            }

            if (c >= n) {
                c = n - 1;
                r += 2;
                d = 1 - d;
            }

            if (r < 0) {
                r = 0;
                d = 1 - d;
            }

            if (c < 0) {
                c = 0;
                d = 1 - d;
            }
        }

        return result;
    }
};