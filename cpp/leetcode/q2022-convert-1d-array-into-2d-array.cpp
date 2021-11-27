#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        int size = original.size();

        if (m * n != size) return {};

        vector<vector<int>> result(m, vector<int>(n));

        for (int i = 0; i < size; i++) {
            result[i / n][i % n] = original[i];
        }

        return result;
    }
};