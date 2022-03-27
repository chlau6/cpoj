#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getMoneyAmount(int n) {
        vector<vector<int>> dp(n + 1, vector<int>(n + 1));

        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j > 0; j--) {
                int globalMin = INT_MAX;

                for (int k = j + 1; k < i; k++) {
                    int localMax = k + max(dp[j][k - 1], dp[k + 1][i]);
                    globalMin = min(globalMin, localMax);
                }

                dp[j][i] = (j + 1 == i) ? j : globalMin;
            }
        }

        return dp[1][n];
    }
};