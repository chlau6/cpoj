#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> luckyNumbers (vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();

        int maxMin = INT_MIN;
        for (int i = 0; i < m; i++) {
            int rowMin = INT_MAX;
            for (int j = 0; j < n; j++) {
                rowMin = min(rowMin, matrix[i][j]);
            }
            maxMin = max(maxMin, rowMin);
        }

        int minMax = INT_MAX;
        for (int j = 0; j < n; j++) {
            int colMax = INT_MIN;
            for (int i = 0; i < m; i++) {
                colMax = max(colMax, matrix[i][j]);
            }
            minMax = min(minMax, colMax);
        }

        if (maxMin != minMax) return {};
        else return {maxMin};
    }
};