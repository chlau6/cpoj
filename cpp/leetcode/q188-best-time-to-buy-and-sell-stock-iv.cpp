#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxProfit(int k, vector<int>& prices) {
        if (k >= prices.size() / 2) return maxProfit(prices);

        int n = prices.size();

        vector<vector<int>> localMax(n, vector<int>(k + 1));
        vector<vector<int>> globalMax(n, vector<int>(k + 1));

        for (int i = 1; i < n; i++) {
            int diff = prices[i] - prices[i - 1];

            for (int j = 1; j <= k; j++) {
                localMax[i][j] = max(globalMax[i - 1][j - 1] + max(0, diff), localMax[i - 1][j] + diff);
                globalMax[i][j] = max(globalMax[i - 1][j], localMax[i][j]);
            }
        }

        return globalMax[n - 1][k];
    }

    int maxProfit(vector<int>& prices) {
        int result = 0;
        int n = prices.size();

        for (int i = 1; i < n; i++) {
            int diff = prices[i] - prices[i - 1];

            if (diff > 0) {
                result += diff;
            }
        }

        return result;
    }
};
