#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        int m = mat.size();
        int n = mat[0].size();
        if (m == r && n == c || m * n != r * c) return mat;

        int x = 0;
        int y = 0;
        vector<vector<int>> result(r, vector<int>(c));

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[x][y];

                if (++y == n) {
                    x++;
                    y = 0;
                }
            }
        }

        return result;
    }
};