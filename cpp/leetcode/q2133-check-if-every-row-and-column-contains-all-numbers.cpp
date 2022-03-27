#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkValid(vector<vector<int>>& matrix) {
        int n = matrix.size();

        for (int i = 0; i < n; i++) {
            unordered_set<int> row;
            unordered_set<int> col;

            for (int j = 0; j < n; j++) {
                if (row.count(matrix[i][j]) || row.count(matrix[i][j])) return false;

                row.insert(matrix[i][j]);
                col.insert(matrix[j][i]);
            }
        }

        return true;
    }
};