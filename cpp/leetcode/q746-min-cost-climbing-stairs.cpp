#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int length = cost.size() + 1;

        vector<int> dp(length);

        for (int i = 2; i < length; i++) {
            dp[i] = min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return dp.back();
    }
};