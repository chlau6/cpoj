#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minCut(string s) {
        int n = s.size();

        vector<vector<int>> strDP(n, vector<int>(n));
        vector<int> dp(n);

        for (int i = 0; i < n; i++) {
            dp[i] = i;
            for (int j = 0; j <= i; j++) {
                if (s[i] == s[j] && (i - j <= 2 || strDP[j + 1][i - 1])) {
                    strDP[j][i] = true;
                    dp[i] = (j == 0) ? 0 : min(dp[i], dp[j - 1] + 1);
                }
            }
        }

        return dp[n - 1];
    }
};