#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int n = obstacleGrid[0].size();

        vector<int> dp(n, 0);
        dp[0] = 1;

        for (auto& o : obstacleGrid) {
            for (int i = 0; i < n; i++) {
                if (o[i] == 1) {
                    dp[i] = 0;
                } else if (i > 0) {
                    dp[i] += dp[i - 1];
                }
            }
        }

        return dp[n - 1];
    }
};