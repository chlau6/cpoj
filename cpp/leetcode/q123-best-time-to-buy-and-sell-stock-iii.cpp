#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();

        vector<vector<int>> localMax(n, vector<int>(3));
        vector<vector<int>> globalMax(n, vector<int>(3));

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 3; j++) {
                int diff = prices[i] - prices[i - 1];
                localMax[i][j] = max(globalMax[i - 1][j - 1] + max(diff, 0), localMax[i - 1][j] + diff);
                globalMax[i][j] = max(globalMax[i - 1][j], localMax[i][j]);
            }
        }

        return globalMax[n - 1][2];
    }
};