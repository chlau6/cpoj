#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getMaximumGenerated(int n) {
        if (n <= 1) return n;

        vector<int> dp(n + 1);
        dp[0] = 0;
        dp[1] = 1;

        int result = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = i % 2 == 0 ? dp[i / 2] : dp[i / 2] + dp[i / 2 + 1];
            result = max(result, dp[i]);
        }

        return result;
    }
};