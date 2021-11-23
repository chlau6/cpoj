#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        vector<bool> r(4);
        fill(r.begin(), r.end(), true);

        int n = mat.size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) r[0] = false;
                if (mat[i][j] != target[n - 1 - j][i]) r[1] = false;
                if (mat[i][j] != target[n - 1- i][n - 1 - j]) r[2] = false;
                if (mat[i][j] != target[j][n - 1 - i]) r[3] = false;
            }
        }

        return r[0] || r[1] || r[2] || r[3];
    }
};