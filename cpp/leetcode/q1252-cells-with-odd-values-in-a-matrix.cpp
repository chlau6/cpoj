#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int oddCells(int m, int n, vector<vector<int>>& indices) {
        vector<bool> rows(m);
        vector<bool> cols(n);

        for (auto index : indices) {
            rows[index[0]] = !rows[index[0]];
            cols[index[1]] = !cols[index[1]];
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] ^ cols[j]) count++;
            }
        }

        return count;
    }
};