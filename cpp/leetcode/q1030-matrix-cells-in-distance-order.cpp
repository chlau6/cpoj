#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        vector<vector<int>> result(rows * cols, vector<int>(2));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                result[index][0] = i;
                result[index][1] = j;
            }
        }

        sort(result.begin(), result.end(), [rCenter, cCenter](vector<int>& a, vector<int>& b) {
            return abs(a[0] - rCenter) + abs(a[1] - cCenter) < abs(b[0] - rCenter) + abs(b[1] - cCenter);
        });

        return result;
    }
};